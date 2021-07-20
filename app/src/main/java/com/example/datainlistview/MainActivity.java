package com.example.datainlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <String> listitem = new ArrayList<>();
    ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.et_input);
        Button save =  findViewById(R.id.bt_save);
        ListView listView = findViewById(R.id.listView);


        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listitem);
        listView.setAdapter(adapter);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listitem.add(input.getText().toString());
                adapter.notifyDataSetChanged();
                input.setText("");

            }
        });

    }
}