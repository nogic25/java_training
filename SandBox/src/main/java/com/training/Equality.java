package com.training;

/**
 * Created by anastasiyam on 2/11/2017.
 */
public class Equality {
    public static void main (String[]args ){
        String s1="firefox";
        String s2=new String(s1);

        //== compare physical location of the object
        System.out.println(s1==s2);

        // equals compare logical location of the object
        System.out.println(s1.equals(s2));

    }
}
