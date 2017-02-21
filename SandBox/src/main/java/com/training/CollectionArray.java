package com.training;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anastasiyam on 2/19/2017.
 */
public class CollectionArray {
    public static void main (String[] args){

        String[]lengs ={"Java","Python","PHP","C#"};

       // for(int i=0;i<lengs.length;i++)

        for (String l:lengs)
        {
            System.out.println("I want to learn "+ l);
        }
        //List<String> language=new ArrayList<String >(); - one way to call the list interface
        //language.add("Python");
        //language.add("Java");
//Arrays.asList .converts arrays in list
        List<String>language= Arrays.asList("Python","JAVA");
//l is reference to array lengs
        for (String l:language)
        {
            System.out.println("I want to learn "+ l);
        }

    }
}
