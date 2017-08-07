package com.eqdd.datasave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.eqdd.annotation.datasave.ToSave;

public class MainActivity extends AppCompatActivity {

    @ToSave
    String asa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
