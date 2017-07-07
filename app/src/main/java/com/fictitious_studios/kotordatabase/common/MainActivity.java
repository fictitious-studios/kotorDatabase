package com.fictitious_studios.kotordatabase.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fictitious_studios.kotordatabase.R;

import butterknife.ButterKnife;

/**
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if(savedInstanceState == null) {
            // load default content
        } else {
            // load bundle content
        }
    }
}
