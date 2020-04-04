package com.example.horsemap.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.horsemap.R;
import com.example.horsemap.fragments.carefragment.ComplementsFragment;
import com.example.horsemap.fragments.carefragment.MarechalFragment;
import com.example.horsemap.fragments.carefragment.VetoFragment;
import com.example.horsemap.fragments.horsefragment.ClubFragment;
import com.example.horsemap.fragments.horsefragment.PonyClubFragment;
import com.example.horsemap.fragments.horsefragment.ProprioFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class CareActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener,
        NavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care);
        bottomNavigationView = findViewById(R.id.activity_care_bottom_navigation);
        setUpBottomNavigationView();
        replaceFragment(new VetoFragment());
    }


    public void setUpBottomNavigationView(){
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.activity_care_bottom_veto:
                replaceFragment(new VetoFragment());
                break;
            case R.id.activity_care_bottom_marechal:
                replaceFragment(new MarechalFragment());
                break;
            case R.id.activity_main_bottom_complements:
                replaceFragment(new ComplementsFragment());
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


