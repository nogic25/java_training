package com.training;

/**
 * Created by anastasiyam on 1/27/2017.
 */
public class Point {
    public int x1;
    public int x2;
    public int y1;
    public int y2;
    public double distance;
    public double distancex;
    public double distancey;



    public Point(int x1,int x2,int y1,int y2){

        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    public double calculateDistance(){
      this.distancex = (x2 - x1)*(x2 - x1);
       this.distancey = (y2 - y1)*(y2 - y1);

         distance = Math.sqrt(distancex + distancey);
        return distance;

    }





}
