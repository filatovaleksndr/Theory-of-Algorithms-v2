/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR11.Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Calculator {
    private int arrayLength;
    private int lowerBorder;
    private int upperBorder;
    private int numberToSearch;
    private int[] array;
    
    public Calculator()
    {
        arrayLength = 100;
        lowerBorder = 0;
        upperBorder = 9;
        numberToSearch = 0;
        array = new int[arrayLength];
    }
    
    public Calculator(int[] arr)
    {
        array = arr;
    }
    
    public void InitArray()
    {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++)
           array[i] = rd.nextInt(upperBorder + 1);
    }
    
//    public String BiggestNumbers()
//    {
//        Arrays.sort(array);
//        List<Integer> list = Arrays.asList(array);
//        
//        Collections.reverse(list);
////        list.subList(0,3);
////        return Arrays.toString(list.toArray());
//         return Arrays.toString(list.toArray());
//
//    }
    
    public String DisplayArray()
    {
        return Arrays.toString(array);
    }
}
