package com.example.pohs.DashBoard;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.pohs.R;


public class CustomerDashBoard extends AppCompatActivity {

    private Toolbar mtoolbar;
    private ViewPager mViewpager;
    private SectionPageDepterforCU mSectionPageAdepter;
    private TabLayout mtablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dash_board);


        mtoolbar = (Toolbar)findViewById(R.id.cu_dashboard_toolbar);
       //setSupportActionBar(mtoolbar);
        getSupportActionBar().setTitle("CUSTOMER DASHBOARD");

        mViewpager = (ViewPager)findViewById(R.id.sh_dashboard_tabpager);

      mSectionPageAdepter = new SectionPageDepterforCU(getSupportFragmentManager());
      mViewpager.setAdapter(mSectionPageAdepter);

      mtablayout = (TabLayout)findViewById(R.id.cu_dashboard_tabs);
      mtablayout.setupWithViewPager(mViewpager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }


}
