package com.example.pohs;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ShopDashBoard extends AppCompatActivity {

    private Toolbar mtoolbar;
    private ViewPager mViewpager;
    private SectionPageDepterforSH mSectionPageAdepter;
    private TabLayout mtablayout;
    private FloatingActionButton muploadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_dash_board);

        mtoolbar = (Toolbar)findViewById(R.id.sh_dashboard_toolbar);
        //setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("SHOP DASHBOARD");


        mViewpager = (ViewPager)findViewById(R.id.sh_dashboard_tabpager);

        mSectionPageAdepter = new SectionPageDepterforSH(getSupportFragmentManager());
        mViewpager.setAdapter(mSectionPageAdepter);

        mtablayout = (TabLayout)findViewById(R.id.sh_dashboard_tabs);
        mtablayout.setupWithViewPager(mViewpager);

        muploadBtn = (FloatingActionButton)findViewById(R.id.uploadBtn);

        muploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentup = new Intent(ShopDashBoard.this,Upload.class);
                startActivity(intentup);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }
}
