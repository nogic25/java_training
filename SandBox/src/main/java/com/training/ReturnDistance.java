package com.training;

/**
 * Created by anastasiyam on 1/27/2017.
 */
public class ReturnDistance {
    public static void main(String[] args){
        Point p= new Point(2,6,2,8);

        System.out.println("Distance between "+ "A ("+p.x1+","+ p.x2 + ") and "+ "B ("+p.y1+","+ p.y2 + ") is equal to "+ p.calculateDistance());



    }
}
