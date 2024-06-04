package com.example.instagram.mainActivity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.instagram.FragmentPackage.fivethFragment;
import com.example.instagram.FragmentPackage.fourthFragment;
import com.example.instagram.FragmentPackage.fristFragment;
import com.example.instagram.FragmentPackage.secondFragment;
import com.example.instagram.FragmentPackage.thirdFragment;
import com.example.instagram.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().add(R.id.linearLayout,new fristFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,new fristFragment()).commit();
                }
                else if (item.getItemId()==R.id.search) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,new secondFragment()).commit();
                }
                else if (item.getItemId()==R.id.reel) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,new thirdFragment()).commit();
                }
                else if (item.getItemId()==R.id.bag) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,new fourthFragment()).commit();
                }
                else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,new fivethFragment()).commit();
                }

                return true;
            }
        });
    }
}
