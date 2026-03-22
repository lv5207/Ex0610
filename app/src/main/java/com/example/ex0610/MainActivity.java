package com.example.ex0610;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private ToggleButton tb;
private Switch sw;
private Button btn;
private LinearLayout llMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
        btn = findViewById(R.id.btn);
        llMain = findViewById(R.id.llMain);
    }

    /**
     * Changes the application background according to the states (on or off) of the toggle and switch.
     * In total, there are four backgrounds possible.
     * <p>
     *
     * @param view The button being clicked.
     */
    public void checkOnOff(View view) {
        boolean tbOn = tb.isChecked();
        boolean swOn = sw.isChecked();

    }
}