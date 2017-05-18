package project11.a2017.se.firstaid.Adapter;

import java.util.ArrayList;
import java.util.List;

import project11.a2017.se.firstaid.Model.Hospital;
import project11.a2017.se.firstaid.Model.Position;

/**
 * Created by Admin on 5/14/2017.
 */

public class HospitalBaseAdapter {
List<Hospital> listHos ;
   public HospitalBaseAdapter(){
        listHos = new ArrayList<>();
        addListHos();
    }
    private void addListHos() {
        Hospital h1 = new Hospital(new Position(10.8719808,106.7925977),"ĐH Nông Lâm","Khu phố 6 ,Linh Trung Thủ Đức TpHCM","01642340787");
        Hospital h2 = new Hospital(new Position(10.861625,106.780462),"ĐH KHTN","Khu phố 6 ,Linh Trung Thủ Đức TpHCM","01642340787");
        Hospital h3 = new Hospital(new Position(10.937321,106.729190),"ĐH BK","Khu phố 6 ,Linh Trung Thủ Đức TpHCM","01642340787");
        listHos.add(h2);
        listHos.add(h1);
        listHos.add(h3);
    }



    public List<Hospital> getListHos(){
        return this.listHos;

    }
}
