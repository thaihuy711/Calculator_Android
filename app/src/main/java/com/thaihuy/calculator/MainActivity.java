package com.thaihuy.calculator;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction tranCalculator = fragmentManager.beginTransaction();
        CalculatorFragment calculatorFragment = new CalculatorFragment();
        tranCalculator.replace(R.id.content, calculatorFragment);
        tranCalculator.commit();

    }
}
