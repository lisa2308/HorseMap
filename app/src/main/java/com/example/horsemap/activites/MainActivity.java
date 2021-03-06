package com.example.horsemap.activites;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.horsemap.R;
import com.example.horsemap.fragments.horsefragment.ClubFragment;
import com.example.horsemap.fragments.horsefragment.PonyClubFragment;
import com.example.horsemap.fragments.horsefragment.ProprioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;



public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener,
        NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.activity_main_bottom_navigation);
        setUpBottomNavigationView();
        replaceFragment(new ClubFragment());
    }


    public void setUpBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.activity_main_bottom_club:
                replaceFragment(new ClubFragment());
                break;
            case R.id.activity_main_bottom_ponyclub:
                replaceFragment(new PonyClubFragment());
                break;
            case R.id.activity_main_bottom_proprio:
                replaceFragment(new ProprioFragment());
                break;
        }

        return true;
    }

    public void replaceFragment(Fragment fragment) {
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.activity_main_frame_layout, fragment, fragment.getClass().getSimpleName());
        //retour vers ancienne vue
        transaction.addToBackStack(fragment.getClass().getSimpleName());
        transaction.commit();
    }
}
