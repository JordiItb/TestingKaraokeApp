package cat.itb.karaokeapp;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.schibsted.spain.barista.interaction.BaristaClickInteractions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cat.itb.karaokeapp.Activities.MainActivity;

import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;
import static com.schibsted.spain.barista.interaction.BaristaListInteractions.clickListItem;
import static com.schibsted.spain.barista.interaction.BaristaListInteractions.scrollListToPosition;

@RunWith(AndroidJUnit4.class)
public class UseCaseTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sing_a_song_case_test(){

        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        scrollListToPosition(R.id.recylcerViewPop, 5);
        clickListItem(R.id.recylcerViewPop, 5);
        clickOn(R.id.btnPlay);

    }

    @Test
    public void search_a_song_case_test(){

        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        clickOn(R.id.buscar);
        writeTo(R.id.editText, "Kandem");
        clickOn(R.id.searchButton);

    }

    @Test
    public void logout_case_test(){

        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);
        clickOn(R.id.logout);

    }

}
