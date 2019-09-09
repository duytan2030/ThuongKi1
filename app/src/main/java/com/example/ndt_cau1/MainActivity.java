package com.example.ndt_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1;
    Button btn_dangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1 =(CheckBox) findViewById(R.id.checkbox_chk1);
        btn_dangnhap =(Button) findViewById(R.id.button_dangnhap);
        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chk1.isChecked()){
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn Khong được lưu",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
