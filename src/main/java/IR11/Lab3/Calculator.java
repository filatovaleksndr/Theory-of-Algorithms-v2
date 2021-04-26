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
import org.apache.commons.lang3.ArrayUtils;


/**
 *
 * @author Alex
 */
public class Calculator {
    private int arrayLength;
    private int lowerBorder;
    private int upperBorder;   
    private int[] array;
    
    public Calculator(int k)
    {
        arrayLength = k;
        lowerBorder = 1;
        upperBorder = 100;
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
           array[i] = rd.nextInt(upperBorder + lowerBorder);
    }
    
    public String BiggestNumbers(int n)
    {
        Arrays.sort(array);
        ArrayUtils.reverse(array);
        int[] result = Arrays.copyOfRange(array, 0, n);
        return Arrays.toString(result);
    }
    
    public String DisplayArray()
    {
        return Arrays.toString(array);
    }
}
