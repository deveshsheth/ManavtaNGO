package com.manavta.myngoapp.ngo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.manavta.myngoapp.R;
import com.manavta.myngoapp.ngo.Fragment.NGOHomeFragment;
import com.manavta.myngoapp.ngo.Fragment.NGOHospitalFragment;
import com.google.android.material.navigation.NavigationView;
import com.manavta.myngoapp.ngo.Fragment.NGOPlasmaDonorFragment;
import com.manavta.myngoapp.ngo.Fragment.NGOVaccinationFragment;

import org.jetbrains.annotations.NotNull;

public class NGOHomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_home);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_open);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        NGOHomeFragment fragment = new NGOHomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

                int id = item.getItemId();
                Fragment fragment;
                if ((id == R.id.nav_home)){

                    fragment = new NGOHomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,fragment);
                    fragmentTransaction.commit();
                    Toast.makeText(NGOHomeActivity.this, "Home", Toast.LENGTH_SHORT).show();
                }else if (id == R.id.nav_hospital){

                    fragment = new NGOHospitalFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,fragment);
                    fragmentTransaction.commit();
                    Toast.makeText(NGOHomeActivity.this, "Hospitals", Toast.LENGTH_SHORT).show();

                }else if (id == R.id.nav_plasma){

                    fragment = new NGOPlasmaDonorFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,fragment);
                    fragmentTransaction.commit();
                    Toast.makeText(NGOHomeActivity.this, "Plasma Donor", Toast.LENGTH_SHORT).show();

                }else if (id == R.id.nav_vaccine){

                    fragment = new NGOVaccinationFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame,fragment);
                    fragmentTransaction.commit();
                    Toast.makeText(NGOHomeActivity.this, "Vaccine", Toast.LENGTH_SHORT).show();

                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_dash, menu);
        return true;
    }


}