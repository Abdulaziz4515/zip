package com.example.zip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.zip.ui.bookmark.bookmarkFragment;
import com.example.zip.ui.home.HomeFragment;
import com.example.zip.ui.menu.menukFragment;
import com.example.zip.ui.setting.setFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
        initViews();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.ic_setting:
                        fragment = new setFragment();
                        break;
                    case R.id.ic_book:
                        fragment = new bookmarkFragment();
                        break;
                    case R.id.ic_notes:
                        fragment = new menukFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                return true;
            }


    });


}

    private void initViews() {

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
    }
}