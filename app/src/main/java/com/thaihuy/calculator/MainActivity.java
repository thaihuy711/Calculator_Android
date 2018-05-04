package com.thaihuy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtKetqua;
    Float fThamSo1, fThamSo2;
    String sToanTu, sXuatManhinh = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKetqua = findViewById(R.id.txtKetqua);
        int[] idButton = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btnCong, R.id.btnTru, R.id.btnNhan, R.id.btnChia, R.id.btnBang, R.id.btnPhay, R.id.btnPhantram, R.id.btnDoi, R.id.btnAc};
        for (int id : idButton) {
            View view = findViewById(id);
            view.setOnClickListener(this);
        }

    }


    private void ToanTu() {
        fThamSo1 = Float.parseFloat(txtKetqua.getText().toString());
        sXuatManhinh = "0";
        txtKetqua.setText("0");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btnAc:
                ToanTu();
                break;
            case R.id.btnDoi:
                break;
            case R.id.btnPhantram:
                break;
            case R.id.btnPhay:
                break;
            case R.id.btnCong:
                sToanTu = "+";
                ToanTu();
                break;
            case R.id.btnTru:
                sToanTu = "-";
                ToanTu();
                break;
            case R.id.btnNhan:
                sToanTu = "*";
                ToanTu();
                break;
            case R.id.btnChia:
                sToanTu = "/";
                ToanTu();
                break;
            case R.id.btnBang:
                Float kq = null;
                fThamSo2 = Float.parseFloat(txtKetqua.getText().toString());
                if (sToanTu == "+") {
                    kq = fThamSo1 + fThamSo2;
                }
                if (sToanTu == "-") {
                    kq = fThamSo1 - fThamSo2;
                }
                if (sToanTu == "*") {
                    kq = fThamSo1 * fThamSo2;
                }
                if (sToanTu == "/") {
                    kq = fThamSo1 / fThamSo2;
                }
                txtKetqua.setText(String.valueOf(kq));
                fThamSo1 = 0.0f;
                fThamSo2 = 0.0f;
                sXuatManhinh = "0";


                break;
            default:
                if (sXuatManhinh.equals("0")) {
                    sXuatManhinh = "";
                }
                sXuatManhinh += ((Button) view).getText().toString();
                txtKetqua.setText(sXuatManhinh);

        }
    }
}
