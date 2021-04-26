package cat.itb.karaokeapp;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.Espresso.*;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.schibsted.spain.barista.interaction.BaristaClickInteractions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cat.itb.karaokeapp.Activities.MainActivity;
import cat.itb.karaokeapp.R;

import static com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn;
import static com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginRegisterTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void login_test() {

        clickOn(R.id.loginButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "Password");
        clickOn(R.id.loginButton);

    }

    @Test
    public void register_test(){

        clickOn(R.id.registerButton);
        writeTo(R.id.loginText, "Username");
        writeTo(R.id.passwordText, "password");
        writeTo(R.id.repeatPasswordText, "password");
        writeTo(R.id.emailText, "randomMail@gmail.com");
        writeTo(R.id.nameText, "Jordi");
        writeTo(R.id.surnameText, "Blanco");
        writeTo(R.id.birthDate, "15/08/2001");
        writeTo(R.id.menu, "Male");
        clickOn(R.id.acceptBox);
        clickOn(R.id.registerButton);

    }
}
