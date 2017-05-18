package project11.a2017.se.firstaid.Model;

/**
 * Created by Admin on 5/14/2017.
 */

public class Position {
    private double kinhDo;
    private double viDo;
    public Position(double kinhDo, double viDo){
        this.kinhDo = kinhDo;
        this.viDo = viDo;

    }

    public double getViDo() {
        return viDo;
    }

    public void setViDo(double viDo) {
        this.viDo = viDo;
    }

    public double getKinhDo() {
        return kinhDo;

    }

    public void setKinhDo(double kinhDo) {
        this.kinhDo = kinhDo;
    }
}
