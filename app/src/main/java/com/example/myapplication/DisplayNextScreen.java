package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayNextScreen extends AppCompatActivity {

    public TextView name;
    public static final String TAG = "Logcat: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Created activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onCreate()", Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_next_screen);
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//        name = findViewById(R.id.textView);
//        name.setText(message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Started activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "Resumed activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, "Paused activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG, "Stopped activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Destroyed activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Restarted activity 2");
        Toast.makeText(getApplicationContext(), "Activity 2 onRestart()", Toast.LENGTH_LONG).show();
    }

}