package com.assignment2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
	
	public ArrayListSort() {
		
	}
	ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> arr){
		Collections.sort(arr,Collections.reverseOrder());
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
		System.out.println("Enter number of elements you wish to input");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element");
			arr.add(sc.nextBigInteger());
		}
		System.out.println("ArrayList before sorting: ");
		System.out.println(arr);
		System.out.println("ArrayList after sorting:");
		ArrayListSort obj = new ArrayListSort();
		obj.arrayListSortDesc(arr);
		System.out.println(arr);
		sc.close();
	}

}
