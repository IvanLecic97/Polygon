package com.polygon;

import Model.Point;
import Service.Convex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner myObj = new Scanner(System.in);
        System.out.println("Unesite broj tjemena mnogougla: ");
        int num = 0;
        while(num < 3){
            num = myObj.nextInt();
            if(num < 3 ) {
                System.out.println("Unesite vise tjemena!!!");
            }
        }


        System.out.println("broj tjemena je " + num);
        List<Point> lista = new ArrayList<Point>();

        System.out.println("Unesite različite tačke mnogougla: ");
        for (int i = 0; i < num; i++) {
            Point p = new Point();
            System.out.println("X = ");
            p.setX(myObj.nextDouble());
            System.out.println("Y = ");
            p.setY(myObj.nextDouble());
            lista.add(p);
        }

        Convex convex = new Convex();

       /* for(Point p : lista){
            System.out.println("X = " + p.getX());
            System.out.println("Y = " + p.getY());
        } */

      if(convex.checkConvex(lista) == true){
           System.out.println("Mnogogugao je konveksan!!");
          Point pointToCheck = new Point();
          System.out.println("Unesite tacku za provjeru: ");
          System.out.println("X = ");
          pointToCheck.setX(myObj.nextDouble());
          System.out.println("Y = ");
          pointToCheck.setY(myObj.nextDouble());

          if(convex.checkPointInPolygon(lista, pointToCheck) == true) {
              System.out.println("Tacka se nalazi unutar mnogougla!!!");
          } else {
              System.out.println("Tacka se ne nalazi unutar mnogougla!!!");
          }
       } else {
           System.out.println("Mnogougao nije konveksan!!");
       }



    }
}
