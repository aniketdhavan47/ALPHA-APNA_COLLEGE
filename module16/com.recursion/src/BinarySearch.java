package com.module16.com.recursion.src;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the target");
        int target=sc.nextInt();
        System.out.println(bs(arr,target,0,arr.length-1));
    }
    public static int bs(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]== target){
            return mid;
        }else if(arr[mid]>target){
            return bs(arr,target,s,e=mid);
        }
        return bs(arr,target,mid+1,e);


    }
}
