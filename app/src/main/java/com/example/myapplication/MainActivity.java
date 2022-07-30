package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button fragment1Btn, fragment2Btn, nextActivityBtn;
    public static final String TAG = "Logcat: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity 1 is created");
        Toast.makeText(getApplicationContext(), "Activity 1 onCreate()", Toast.LENGTH_SHORT).show();
        fragment1Btn = findViewById(R.id.button);
        fragment2Btn = findViewById(R.id.button2);
        nextActivityBtn = findViewById(R.id.button3);

        fragment1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlankFragment blankFragObj = new BlankFragment();
                replaceFragment(blankFragObj);
            }
        });

        fragment2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlankFragment2 blankFrag2Obj = new BlankFragment2();
                replaceFragment(blankFrag2Obj);
            }
        });

        nextActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextScreen(view);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity1 started!");
        Toast.makeText(getApplicationContext(), "Activity 1 onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "Resumed activity 1");
        Toast.makeText(getApplicationContext(), "Activity 1 onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, "Paused activity 1");
        Toast.makeText(getApplicationContext(), "Activity 1 onPause()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG, "Stopped activity 1");
        Toast.makeText(getApplicationContext(), "Activity 1 onStop()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroyed activity 1");
        Toast.makeText(getApplicationContext(), "Activity 1 onDestroy()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Restarted activity 1");
        Toast.makeText(getApplicationContext(), "Activity 1 onRestart()", Toast.LENGTH_SHORT).show();
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.card_view, fragment);
        fragmentTransaction.commit();
    }

    public void goToNextScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), DisplayNextScreen.class);
        startActivity(intent);
    }
}