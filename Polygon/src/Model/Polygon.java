package Model;

import java.util.List;

public class Polygon {

    private List<Point> Polygon;

    public Polygon(List<Point> polygon) {
        Polygon = polygon;
    }

    public Polygon() {}

    public List<Point> getPolygon() { 
        return Polygon;
    }

    public void setPolygon(List<Point> polygon) {
        Polygon = polygon;
    }
}
