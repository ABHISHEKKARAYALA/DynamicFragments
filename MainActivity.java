package com.example.dynamicfragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements DynamicFragment.FragListner, DynamicFragmentAss.FragBListner, DynamicFragmentNot.FragCListner {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            DynamicFragment b = new DynamicFragment();
                            // Create an object of FragmentManager
                            FragmentManager fm = getSupportFragmentManager();
                            // Begin the transaction
                            FragmentTransaction ft = fm.beginTransaction();
                            // Replace the container with the new fragment
                            ft.replace(R.id.fragment, b);
                            ft.commit();
                            break;
                        case R.id.assignment:
                            DynamicFragmentAss c = new DynamicFragmentAss();
                            FragmentManager tm = getSupportFragmentManager();
                            FragmentTransaction f = tm.beginTransaction();
                            f.replace(R.id.fragment1, c);
                            f.commit();
                            break;
                        case R.id.notifications:
                            DynamicFragmentNot d = new DynamicFragmentNot();
                            FragmentManager fr = getSupportFragmentManager();
                            FragmentTransaction fy = fr.beginTransaction();
                            fy.replace(R.id.fragment2, d);
                            fy.commit();
                            break;
                    }
                    return true;
                }
            };

    public void onInputASelect(CharSequence input) {
        DynamicFragmentAss a = new DynamicFragmentAss();
        a.updateEditText(input);
    }

    public void onInputBSelect(CharSequence input) {
        DynamicFragment a = new DynamicFragment();
        a.updateEditText(input);
    }

    @Override
    public void onInputCSelect(CharSequence input) {
        DynamicFragmentAss a = new DynamicFragmentAss();
        a.updateEditText(input);
    }
}