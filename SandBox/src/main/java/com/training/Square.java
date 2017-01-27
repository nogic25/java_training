package com.training;

/**
 * Created by anastasiyam on 1/27/2017.
 */
public class Square {

    public double len;

    //constructor creation. We have to define attributes of our object as well as arguments of our function

    public Square (double l) {
        //len is an attribute . l is argument of the constructor
        this.len = l; }

        //methods can be oly called whithin the class. Each method will have name of the object upfront
 // no longer static because method is the part of the specific object now
    public  double area(){
        return this.len*this.len;
    }



}
