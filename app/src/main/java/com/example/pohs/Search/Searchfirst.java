package com.example.pohs.Search;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pohs.R;
import com.example.pohs.Search.Modal.searchItemModal;

import java.util.ArrayList;

public class Searchfirst extends AppCompatActivity {

    Button searchbtn;
    EditText searchtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchbtn = (Button)findViewById(R.id.searchbtn);
        searchtext = (EditText)findViewById(R.id.search);



        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Searchfirst.this,searchViewActivity.class);
                intent.putExtra("searchText",searchtext.toString());
                startActivity(intent);
            }
        });


    }
}
