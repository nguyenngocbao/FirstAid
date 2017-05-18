package project11.a2017.se.firstaid.Controller;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ListView;

import java.util.ArrayList;

import project11.a2017.se.firstaid.Adapter.CustomBaseAdapter;
import project11.a2017.se.firstaid.Model.Lession;
import project11.a2017.se.firstaid.R;

public class Tab1 extends Activity {
    WebView webView;
    ListView listViewLession;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tab1);

        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        String myvideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iMdI-omme20\" frameborder=\"0\" allowfullscreen></iframe>";
        webView.loadData(myvideo,"text/html","utf-8");
        webView.setWebChromeClient(new WebChromeClient() );

        listViewLession = (ListView) findViewById(R.id.listviewtab1);

         ArrayList<Lession> listLesstion = new ArrayList<Lession>();
        for (int i = 0; i<10;i++){
            Lession ls = new Lession("Bai" + i, "Bang Bo","abc", R.drawable.logo);
            listLesstion.add(ls);
        }

        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(this, R.layout.custom_layout_list,listLesstion);
        customBaseAdapter.notifyDataSetChanged();
        listViewLession.setAdapter(customBaseAdapter);


    }

}
