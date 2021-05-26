/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR11.Lab8;

/**
 *
 * @author Alex
 */
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ruslan
 */
public class Algorithms {
    private int[] _array;
    
    public Algorithms(int length)
    {
        _array = GenerateArray(length);
    }
    
    public int[] GenerateArray(int length)
    {
        Random rd = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
           array[i] = rd.nextInt();
        return array;
    }
    
    public AlgorithmDetails bubbleSort() {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int temp = 0;
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        for(int i=0; i < array.length; i++){ 
            comparisons++;
            for(int j=1; j < array.length - i; j++){  
                comparisons += 2;
                if(array[j-1] > array[j]){  
                    temp = array[j-1];  
                    array[j-1] = array[j];  
                    array[j] = temp;
                    substitutions++;
                }                
            }  
        }
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
   public AlgorithmDetails InsertionSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        int substitutions = 0;
        int comparisons = 0;
        long startTime = System.nanoTime();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            comparisons += 2;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                substitutions++;
            }
            array[j + 1] = key;
            substitutions++;
        }
        comparisons += n;
        long endTime = System.nanoTime();
        details.setComparisons(comparisons);
        details.setSubstitutions(substitutions);
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
   void MergeSortInner(int arr[], int l, int m, int r, AlgorithmDetails details)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            details.setComparisons(details.getComparisons() + 3);
            details.setSubstitutions(details.getSubstitutions()+ 1);
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            details.setComparisons(details.getComparisons() + 1);
            details.setSubstitutions(details.getSubstitutions()+ 1);
        }
    }
 
    public void MergeSortOuter(int arr[], int l, int r, AlgorithmDetails details)
    {
        details.setComparisons(details.getComparisons()+ 1);
        if (l < r) {
            int m =l+ (r-l)/2;
            
            MergeSortOuter(arr, l, m, details);
            MergeSortOuter(arr, m + 1, r, details);
 
            MergeSortInner(arr, l, m, r, details);
        }

    }
    
    public AlgorithmDetails MergeSort()
    {
        AlgorithmDetails details = new AlgorithmDetails();
        int[] array = Arrays.copyOf(_array, _array.length);
        long startTime = System.nanoTime();
        MergeSortOuter(array, 0, array.length - 1, details);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
    
    private void QuickSortInner(int[] array, int low, int high, AlgorithmDetails details)
    {
       details.setComparisons(details.getComparisons() + 1);
       if (array.length == 0)
            return;
       
        details.setComparisons(details.getComparisons() + 1);
        if (low >= high)
            return;
 
        int middle = low + (high - low) / 2;
        int opora = array[middle];
 
        int i = low, j = high;
        while (i <= j) {
            details.setComparisons(details.getComparisons() + 1);
            while (array[i] < opora) {
                i++;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            while (array[j] > opora) {
                j--;
                details.setComparisons(details.getComparisons() + 1);
            }
 
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
                details.setSubstitutions(details.getSubstitutions() + 1);
                details.setComparisons(details.getComparisons() + 1);
            }
        }
 
        details.setComparisons(details.getComparisons() + 1);
        if (low < j)
            QuickSortInner(array, low, j, details);
        details.setComparisons(details.getComparisons() + 1);
        if (high > i)
            QuickSortInner(array, i, high, details);
    }
    
    public AlgorithmDetails QuickSort()
    {
        int[] array = Arrays.copyOf(_array, _array.length);
        AlgorithmDetails details = new AlgorithmDetails();
        long startTime = System.nanoTime();
        QuickSortInner(array, 0, array.length - 1, details);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        details.setTime(duration);
        return details;
    }
}