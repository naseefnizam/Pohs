package com.example.pohs.DashBoard;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pohs.R;

public class MainActivity extends AppCompatActivity {

    private Button mgetstartBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgetstartBtn = (Button)findViewById(R.id.firstBtn);

        mgetstartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this,ShopDashBoard.class);
                startActivity(intent);
            }
        });
    }
}
