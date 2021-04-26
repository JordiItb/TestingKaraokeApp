package cat.itb.karaokeapp;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cat.itb.karaokeapp.Activities.MainActivity;

import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;
import static com.schibsted.spain.barista.interaction.BaristaListInteractions.clickListItem;
import static com.schibsted.spain.barista.interaction.BaristaListInteractions.scrollListToPosition;

@RunWith(AndroidJUnit4.class)
public class NavigationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void saved_songs_navigation_test(){

        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        clickOn(R.id.playlist);
        scrollListToPosition(R.id.recyclerSaved, 9);

    }

    @Test
    public void song_navigation_test(){
        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        clickListItem(R.id.recylcerViewPop, 2);
    }

    @Test
    public void search_song_navigation_test(){
        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        clickOn(R.id.buscar);
    }

}
