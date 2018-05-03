package com.thaihuy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnC, btnDoi, btnPhantram, btnPhay, btnCong, btnTru,
            btnNhan, btnChia, btnBang, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    EditText edKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addClicks();

    }

    private void addClicks() {
        btnC.setOnClickListener(this);
        btnDoi.setOnClickListener(this);
        btnPhantram.setOnClickListener(this);
        btnPhay.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    private void addControls() {
        edKetqua = findViewById(R.id.edKetqua);
        btnC = findViewById(R.id.btnAc);
        btnDoi = findViewById(R.id.btnDoi);
        btnPhantram = findViewById(R.id.btnPhantram);
        btnPhay = findViewById(R.id.btnPhay);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnBang = findViewById(R.id.btnBang);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnAc:
                break;
            case R.id.btnDoi:
                break;
            case R.id.btnPhantram:
                break;
            case R.id.btnPhay:
                break;
            case R.id.btnCong:
                break;
            case R.id.btnTru:
                break;
            case R.id.btnNhan:
                break;
            case R.id.btnChia:
                break;
            case R.id.btnBang:
                break;
            case R.id.btn0:
                break;
            case R.id.btn1:
                break;
            case R.id.btn2:
                break;
            case R.id.btn3:
                break;
            case R.id.btn4:
                break;
            case R.id.btn5:
                break;
            case R.id.btn6:
                break;
            case R.id.btn7:
                break;
            case R.id.btn8:
                break;
            case R.id.btn9:
                break;

        }
    }
}
