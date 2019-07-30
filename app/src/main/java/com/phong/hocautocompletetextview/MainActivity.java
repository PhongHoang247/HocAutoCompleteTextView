package com.phong.hocautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTinhThanh;
    ArrayAdapter<String> tinhThanhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        autoCompleteTinhThanh = (AutoCompleteTextView) findViewById(R.id.autoCompleteTinhThanh);
        tinhThanhAdapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1);
        //Gán adapter:
        autoCompleteTinhThanh.setAdapter(tinhThanhAdapter);
        //Nạp dữ liệu cho autoCompleteTextView:
        tinhThanhAdapter.addAll(getResources().getStringArray(R.array.arrTinhThanh));
    }
}
