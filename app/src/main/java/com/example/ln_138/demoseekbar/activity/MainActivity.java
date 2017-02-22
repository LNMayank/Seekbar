package com.example.ln_138.demoseekbar.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ln_138.demoseekbar.R;
import com.example.ln_138.demoseekbar.view.seekbar.SeekBar;

public class MainActivity extends AppCompatActivity {

    SeekBar mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeekBar = (SeekBar) findViewById(R.id.seekbar);
    }
}
