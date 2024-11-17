package com.example.lifecyclelogeventlistenersapp;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lifecyclelogeventlistenersapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "t";

    //Binding
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.button.setOnClickListener(v->{
            Log.d(TAG, "onClick: ");
            Log.v(TAG,"Verbose");
            Log.wtf(TAG, "onCreate: ");
        });

        Log.d(TAG,"onCreate:");
        Log.e(TAG,"onCreate");
        Log.w(TAG,"onCreate");
        //m
        Log.d(TAG, "onCreate() called with: savedInstance = [" + savedInstanceState + "]");
        Log.d(TAG, "onCreate() returned: " + 1);


        Log.println(Log.ASSERT,TAG,"ASSERT");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart: ");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    @Override
    protected void  onStop(){
        super.onStop();
        Log.i(TAG, "onStop: ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.w(TAG, "onRestart: " );

    }
}