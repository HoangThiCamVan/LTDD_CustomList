package com.example.listmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listmusic.adapter.CustomAdapter;
import com.example.listmusic.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listProduct;
    String[] name={
            "Hoa nở không màu","Thích thì đến","Mẹ yêu","Đồi hoa mặt trời","Cha và con gái",
    };
    String[] type={
            "Hoài Lâm","Trịnh Thăng Bình","Thùy Chi","Hoàng Yến","Thùy Chi",
    };
    Integer[] imgid={
            R.drawable.product_hnkm,R.drawable.product_ttd,R.drawable.product_my,R.drawable.product_dhmt,R.drawable.product_cvcg,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomAdapter adapter=new CustomAdapter(this,name,type,imgid);
        listProduct=(ListView) findViewById(R.id.listProduct);
        listProduct.setAdapter(adapter);
    }
}