package project11.a2017.se.firstaid.Model;

/**
 * Created by Admin on 5/14/2017.
 */

public class Hospital {
    private String id;
    private Position viTri;
    private String name;
    private String address;
    private String phone;
    private  double distance;

    public Hospital( Position viTri, String name, String address, String phone) {

        this.viTri = viTri;
        this.name = name;
        this.address = address;
        this.phone = phone;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getViTri() {
        return viTri;
    }

    public void setViTri(Position viTri) {
        this.viTri = viTri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
