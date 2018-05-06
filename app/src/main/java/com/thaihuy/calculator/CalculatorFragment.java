package com.thaihuy.calculator;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ThaiHuyPC on 5/6/2018.
 */

public class CalculatorFragment extends Fragment implements View.OnClickListener {
    private TextView txtKetqua;
    private Float fThamSo1, fThamSo2;
    private String sToanTu, sXuatManhinh = "";
    private SharedPreferences sharedPreferences;
    private Float kq = null;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_fragment, container, false);
        setHasOptionsMenu(true);

        txtKetqua = view.findViewById(R.id.txtKetqua);
        Toolbar toolbar = view.findViewById(R.id.toolbar);

        int[] idButton = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btnCong, R.id.btnTru, R.id.btnNhan, R.id.btnChia, R.id.btnBang, R.id.btnPhay, R.id.btnPhantram, R.id.btnDoi, R.id.btnAc};
        for (int id : idButton) {
            View v = view.findViewById(id);
            v.setOnClickListener(this);
        }

        toolbar.setTitle("");
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);

        sharedPreferences = getActivity().getSharedPreferences("save", Context.MODE_PRIVATE);
        float ketqua = sharedPreferences.getFloat("ketqua", 0);
        txtKetqua.setText(String.valueOf(ketqua));
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        getActivity().getMenuInflater().inflate(R.menu.menu_calculator, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_clear:
                ToanTu();
                break;
            case R.id.menu_save:
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (kq != null) {
                    editor.putFloat("ketqua", kq);
                } else {
                    editor.putFloat("ketqua", 0.f);
                }
                editor.commit();
                Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
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
