package project11.a2017.se.firstaid.Controller;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import project11.a2017.se.firstaid.Adapter.HospitalBaseAdapter;
import project11.a2017.se.firstaid.Adapter.InforHospitalAdapter;
import project11.a2017.se.firstaid.Model.Hospital;
import project11.a2017.se.firstaid.R;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;

;

public class HospitalActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {


    GoogleMap map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        map = mapFragment.getMap();
        addMaker();


    }


    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        googleMap.setBuildingsEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        askPermissionsLocation();

        map.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {



            }
        });


    }


    @Override
    public void onClick(View v) {

    }
    public void addMaker(){

        List<Hospital> listHis = new HospitalBaseAdapter().getListHos();
        HashMap<String,Hospital> list = new HashMap<>();
        for (Hospital item: listHis
             ) {
            MarkerOptions pos = new MarkerOptions();

            pos.position(new LatLng(item.getViTri().getKinhDo(),item.getViTri().getViDo()));


            Marker marker = map.addMarker(pos);
            list.put(marker.getId(),item);





        }
        map.setInfoWindowAdapter(new InforHospitalAdapter(HospitalActivity.this,list));


    }

    public void askPermissionsLocation() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            String[] permissions = new String[]{ACCESS_COARSE_LOCATION,
                    ACCESS_FINE_LOCATION};

            ActivityCompat.requestPermissions(this.getParent(), permissions, 1);

        }
        if (ContextCompat.checkSelfPermission(this, ACCESS_FINE_LOCATION)
                == PERMISSION_GRANTED) {
            map.setMyLocationEnabled(true);
        }

    }
}