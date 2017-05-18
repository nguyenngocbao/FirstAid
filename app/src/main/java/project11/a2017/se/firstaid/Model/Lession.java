package project11.a2017.se.firstaid.Model;

/**
 * Created by MinhChuong on 25/04/2017.
 */

public class Lession {
    String id;
    String lessionName;
    String urlVideo;
    int icon;

    public Lession(String id, String lessionName, String urlVideo, int icon) {
        this.id = id;
        this.lessionName = lessionName;
        this.urlVideo = urlVideo;
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLessionName() {
        return lessionName;
    }

    public void setLessionName(String lessionName) {
        this.lessionName = lessionName;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
