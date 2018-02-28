package com.company;
/*TonyZhong
S3C7
2017.11.15 classwork
 */
import java.util.Arrays;

public class TonyZhongSelection_sort {

    public static void main(String[] args) {
        int[] unsorted = {10,5,9,4,12,44};
        selection_sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }
    public static void selection_sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[1];
            int min_index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<i){
                    min=arr[j];
                    min_index=j;
                }
            }if(min_index!=i){
                int t=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=t;
            }
        }

        }
    }

