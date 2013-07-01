/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

class Test{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int[] a = new int[x];
		for(int i = 0;i<x;i++){
			if(i > 0){
			a[i] += a[i-1]+5;}
			else a[i] = 5;
            System.out.println("This is an Array a value at" + " " + i + " =" + a[i]);
		}
	}
}

