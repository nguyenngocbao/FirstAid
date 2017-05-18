package project11.a2017.se.firstaid.Controller;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

import project11.a2017.se.firstaid.R;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabHost tabHost;
    LocalActivityManager mLam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        createAppBar();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //actionBar.setTitle(" ");
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setHomeAsUpIndicator(R.drawable.home);
        createTabHost(savedInstanceState);
    }
    public void createAppBar(){
        toolbar = (Toolbar)findViewById(R.id.toolBar);
      setSupportActionBar(toolbar);
    }

    public void createTabHost(Bundle savedInstanceState){
        mLam = new LocalActivityManager(this, false);
        mLam.dispatchCreate(savedInstanceState);
        tabHost =(TabHost) findViewById(R.id.tabHost);

        tabHost.setup(mLam);
        //tab 1
        TabHost.TabSpec tab1 = tabHost.newTabSpec("Sơ Cứu");
        tab1.setIndicator("Sơ cứu");
        Intent tabIntent1 = new Intent(this,Tab1.class);
        tab1.setContent(tabIntent1);
        tabHost.addTab(tab1);

        //tab 2
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Phòng bị");
        tab2.setIndicator("Phòng Bị");
        Intent tabIntent2 = new Intent(this,Tab2.class);
        tab2.setContent(tabIntent2);
        tabHost.addTab(tab2);
        //tab 3
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Bệnh viện");
        tab3.setIndicator("Khẩn Cấp");
        Intent tabIntent3 = new Intent(this,Tab3.class);
        tab3.setContent(tabIntent3);
        tabHost.addTab(tab3);

        //tab 3
        TabHost.TabSpec tab4 = tabHost.newTabSpec("Bệnh viện");
        tab4.setIndicator("Bệnh Viện");
        Intent tabIntent4 = new Intent(this,HospitalActivity.class);
        tab4.setContent(tabIntent4);
        tabHost.addTab(tab4);
    }

    @Override
    protected void onResume(){
        super.onResume();
        mLam.dispatchResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mLam.dispatchPause(isFinishing());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_left, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.search:
                    Toast.makeText(this, "Search button", Toast.LENGTH_SHORT).show();
                    break;

        }

       return super.onOptionsItemSelected(item);
    }
}
