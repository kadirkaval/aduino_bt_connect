package com.example.aduino_bt_connect;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DEBUG_MA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate-Start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume-Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause-Start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy-Start");
    }
}