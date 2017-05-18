package project11.a2017.se.firstaid.Controller;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import project11.a2017.se.firstaid.R;

public class Tab2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);
        callPhone();
    }
    public void callPhone(){
        Button btn = (Button) findViewById(R.id.call);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0978246289"));
                startActivity(intent);
            }
        });
    }
}
