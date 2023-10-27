package com.hfad.bitsandpizzas.bitsandpizzas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.os.Bundle;

import com.hfad.bitsandpizzas5.R;

public class OrderActivity extends AppCompatActivity {

    Spinner Spinneractor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarOrder);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Spinneractor=findViewById(R.id.salas);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.salas_lab, android.R.layout.simple_spinner_item);
        Spinneractor.setAdapter(adapter);

    }


}