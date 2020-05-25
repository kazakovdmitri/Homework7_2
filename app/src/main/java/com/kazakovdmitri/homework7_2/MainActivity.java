package com.kazakovdmitri.homework7_2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox checkBox = findViewById(R.id.checkBox);
        final FrameLayout simpleCalc = findViewById(R.id.simpleCalc);
        final FrameLayout ingenereCalc = findViewById(R.id.ingenereCalc);
        CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    simpleCalc.setVisibility(View.GONE);
                    ingenereCalc.setVisibility(View.VISIBLE);
                } else {
                    simpleCalc.setVisibility(View.VISIBLE);
                    ingenereCalc.setVisibility(View.GONE);
                }
            }
        };
        checkBox.setOnCheckedChangeListener(checkedChangeListener);

    }
}