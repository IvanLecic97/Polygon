package Service;

import Model.Point;
import Model.Polygon;

import java.util.List;

public interface IConvex {

    boolean checkSide(Point p1, Point p2, Point p, Point pp);
    boolean checkConvex(List<Point> pointList);
    boolean checkPointInPolygon(List<Point> pointList, Point point);




}
