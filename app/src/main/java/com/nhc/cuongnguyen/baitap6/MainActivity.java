package com.nhc.cuongnguyen.baitap6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listTinh;
    ArrayList<String> arrayTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listTinh = (ListView) findViewById(R.id.listTinh);
        arrayTinh = new ArrayList<>();
        arrayTinh.add("Ha Noi");
        arrayTinh.add("Ha Nam");
        arrayTinh.add("Ha Tinh");
        arrayTinh.add("Nghe An");
        arrayTinh.add("Quang Binh");
        arrayTinh.add("Quang Tri");
        arrayTinh.add("Hue");
        arrayTinh.add("Da Nang");
        arrayTinh.add("Quang Nam");
        arrayTinh.add("Quang Ngai");
        arrayTinh.add("Binh Dinh");
        arrayTinh.add("Phu Yen");
        arrayTinh.add("Khanh Hoa");
        arrayTinh.add("Binh Thuan");
        arrayTinh.add("Ba Ria-Vung Tau");
        arrayTinh.add("Ho Chi Minh");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrayTinh);
        listTinh.setAdapter(adapter);

        listTinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,ProvinceActivity.class);
                String str="";
                for (int j = 0 ; j <=i-1;j++){
                    str += arrayTinh.get(j)+"-";
                }
                str +=arrayTinh.get(i);
                intent.putExtra("tinh",str);
                startActivity(intent);
            }
        });
    }
}
