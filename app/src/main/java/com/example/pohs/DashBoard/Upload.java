package com.example.pohs.DashBoard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;

import com.example.pohs.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class Upload extends AppCompatActivity {

    private Toolbar mtoolbar;
    String[] SPINNERLIST ={"Male Item","Female Item","Kids Item"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        mtoolbar = (Toolbar)findViewById(R.id.Upload_dashboard_toolbar);
        //setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("UPLOAD");

        //dropdown for dress type

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,SPINNERLIST);
        MaterialBetterSpinner betterSpinner = (MaterialBetterSpinner)findViewById(R.id.dresstype);
        betterSpinner.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }
}
