package project11.a2017.se.firstaid.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;
import java.util.List;

import project11.a2017.se.firstaid.Controller.HospitalActivity;
import project11.a2017.se.firstaid.Model.Hospital;
import project11.a2017.se.firstaid.R;

/**
 * Created by Admin on 5/14/2017.
 */

public class InforHospitalAdapter implements GoogleMap.InfoWindowAdapter {
    private Activity content;
    private HashMap<String,Hospital> hospital;

    public InforHospitalAdapter(Activity content,HashMap<String,Hospital>  hospital) {
        this.content = content;
        this.hospital = hospital;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        Hospital item = this.hospital.get(marker.getId());



        LayoutInflater layoutInflater = this.content.getLayoutInflater();
        View row = layoutInflater.inflate(R.layout.infor_hospital,null);
        TextView txtName = (TextView) row.findViewById(R.id.textNameHospital);
        TextView txtAddress = (TextView) row.findViewById(R.id.textAddress);
        TextView txtDistance = (TextView) row.findViewById(R.id.textDistance);
        TextView txtPhone = (TextView) row.findViewById(R.id.textPhone);


        txtName.setText(item.getName());
        txtAddress.setText(item.getAddress());
        txtDistance.setText(item.getDistance()+"");
        txtPhone.setText(item.getPhone());


        return row;
    }
}
