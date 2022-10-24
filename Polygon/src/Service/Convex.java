package Service;

import Model.Point;
import Model.Polygon;

import java.util.ArrayList;
import java.util.List;

public class Convex implements IConvex {

    public Convex() {}


    @Override
    public boolean checkSide(Point p1, Point p2, Point p, Point pp) {
        double retVal;
        double retVal1;
        double retVal2;
        boolean returnValue = false;

        retVal1 = ( (p.getY() - p1.getY())  * (p2.getX() - p1.getX())  )  - ( (p.getX() - p1.getX()) * (p2.getY() - p1.getY()));
        retVal2 = ( (pp.getY() - p1.getY())  * (p2.getX() - p1.getX())  )  - ( (pp.getX() - p1.getX()) * (p2.getY() - p1.getY()));

        retVal = retVal1 * retVal2;
        if(retVal > 0 ){
            returnValue = true;
        }
        return returnValue;
    }

    @Override
    public boolean checkConvex(List<Point> pointList) {
        boolean check1 = true;
        boolean check2 = true;
        boolean check = true;
        boolean konveksan = true;
        int i;
        int j;
        int n = pointList.size();


            for (i = 0; i < n - 1; i++) {
                for(j = 0; j < i-1; j++){
                    if(!checkSide(pointList.get(i), pointList.get(i+1), pointList.get(j), pointList.get(j+1)))
                    {
                        konveksan = false;
                    }

                }
                for(j = i + 2; j < n-1; j++){
                    if(!checkSide(pointList.get(i), pointList.get(i+1), pointList.get(j), pointList.get(j+1))){
                        konveksan = false;
                    }
                }
                if(i != 0 && i != n - 1 && i + 1 != 0 && i + 1 != n - 1){
                    if(!checkSide(pointList.get(i), pointList.get(i +1), pointList.get(0), pointList.get(n-1))){
                        konveksan = false;
                    }
                }
            }
            for(j = 1; j < n - 2; j++){
                if(!checkSide(pointList.get(0), pointList.get(n - 1), pointList.get(j), pointList.get(j + 1))){
                    konveksan = false;
                }
            }

        return konveksan;
    }



    @Override
    public boolean checkPointInPolygon(List<Point> pointList, Point point) {
        int n = pointList.size() - 1;
        int i;
        boolean retVal = true;

        for(i = 0; i < n - 2; i ++){
            if(!checkSide(pointList.get(i), pointList.get(i + 1), pointList.get(i + 2),point)){
                retVal = false;
            }
        }
        i++;

        if(!checkSide(pointList.get(i), pointList.get(i + 1), pointList.get(0), point)){
            retVal = false;
        }
        i++;
        if(!checkSide(pointList.get(i), pointList.get(0), pointList.get(1), point)){
            retVal = false;
        }

        return retVal;
    }
}
