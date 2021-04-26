package cat.itb.karaokeapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.os.Bundle;

import cat.itb.karaokeapp.Fragments.IntroFragment;
import cat.itb.karaokeapp.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            IntroFragment intro = new IntroFragment();
            changeFragment(intro);
        }

    }

    private void changeFragment(Fragment currentFragment) {
        getFragmentManager().beginTransaction().replace(R.id.fragment_container, currentFragment).commit();
    }

}