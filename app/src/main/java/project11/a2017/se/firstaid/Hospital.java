package project11.a2017.se.firstaid;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Hospital extends AppCompatActivity implements OnMapReadyCallback,View.OnClickListener {
    GoogleMap map;
    Button  btnMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync( this);
        map = mapFragment.getMap();
        btnMarker = (Button) findViewById(R.id.btnMarker);
        btnMarker.setOnClickListener(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

    @Override
    public void onClick(View v) {
        LatLng nlu = new LatLng(10.8719808,106.7925977);
        MarkerOptions posNLU = new MarkerOptions();

        posNLU.position(nlu);
        posNLU.title("NLU");
        Marker marker = map.addMarker(posNLU);
    }
}
