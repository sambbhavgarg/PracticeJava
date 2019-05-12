package Threads;

import java.util.Arrays;

public class MergeThread implements Runnable {
	
	MergeThread(int )

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static int a [] = new int [10000];
		int arlen = a.length;
		System.currentTimeMillis();
		
		int[] b = Arrays.copyOf(a,a.length);
		
		int bins = arlen/4;
		
		int abin = bins, bbin = abin+bins, cbin = bbin+bins;
		
		Runnable r1 = new MergeThread(0, abin-1);
		Runnable r2 = new MergeThread(abin, bbin-1);
		Runnable r3 = new MergeThread(bbin, cbin-1);
		Runnable r4 = new MergeThread(cbin, a);

		
		
	}
	
	

}
