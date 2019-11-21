package com.example.e_softwarica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    FrameLayout frameLayout;
    public static List<Student> students=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        frameLayout=findViewById(R.id.main_layout);

        students= new ArrayList<>();
        students.add(new Student("AShish","ktm","Male",21, R.drawable.avatar));
        students.add(new Student("Uttam","ktm","Male",23, R.drawable.avatar));


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()){
                    case R.id.home:
                        fragment=new HomeFragment();
                        break;
                    case R.id.about:
                        fragment=new AboutFragment();
                        break;
                    case R.id.addStudent:
                        fragment=new AddStudentFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                        fragment).commit();

                return true;
            }

        });

        bottomNavigationView.setSelectedItemId(R.id.home);


    }
}
