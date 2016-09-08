package com.example.asus.fragmentsex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void ChangeFragment(View view){
       Fragment fragment;
       if(view==findViewById(R.id.button)){

           fragment =new Fragment1();
           FragmentManager fm=getFragmentManager();
           FragmentTransaction ft=fm.beginTransaction();
           ft.replace(R.id.fragment_place,fragment);
           ft.commit();
       }
       if(view==findViewById(R.id.button2)){
           fragment =new Fragment2();
           FragmentManager fm=getFragmentManager();
           FragmentTransaction ft=fm.beginTransaction();
           ft.replace(R.id.fragment_place,fragment);
           ft.commit();
       }


   }
}
