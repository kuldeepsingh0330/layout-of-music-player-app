package com.ransankul.music.Activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;
import com.ransankul.music.R;
import com.ransankul.music.Fragements.discoverFragment;
import com.ransankul.music.Fragements.libraryFragement;
import com.ransankul.music.Fragements.profileFragment;
import com.ransankul.music.databinding.ActivityMainBinding;
import com.ransankul.music.toolbarController;

public class MainActivity extends AppCompatActivity implements toolbarController {

    libraryFragement lib = new libraryFragement();
    discoverFragment dis = new discoverFragment();
    profileFragment pro = new profileFragment();
    ActivityMainBinding binding;
    ListView listView;
    String [ ] items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, binding.drawerlayout, binding.toolbar, R.string.navopen, R.string.navclose);
        binding.drawerlayout.addDrawerListener(toggle);
        toggle.syncState();


        getSupportFragmentManager().beginTransaction().replace(R.id.container, lib).commit();

        binding.navbottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.library:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, lib).commit();
                        return true;
                    case R.id.discover:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, dis).commit();
                        return true;
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, pro).commit();
                        return true;
                }

                return true;
            }
        });
    }

    @Override
    public void setDrawerLocked() {
        binding.etsearch.setVisibility(View.GONE);
        binding.toolbar.setVisibility(View.GONE);
    }

    @Override
    public void setDrawerUnlocked() {
        binding.etsearch.setVisibility(View.VISIBLE);
        binding.toolbar.setVisibility(View.VISIBLE);

    }

}