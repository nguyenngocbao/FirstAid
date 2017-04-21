package project11.a2017.se.firstaid;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TabHost;

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
        tab3.setIndicator("Bệnh Viện");
        Intent tabIntent3 = new Intent(this,Hospital.class);
        tab3.setContent(tabIntent3);
        tabHost.addTab(tab3);
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
}
