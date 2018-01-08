package com.arry;

public class Arry {


public void PaiXu() {
	int target;	
	int[] arry= {1,5,2,6,17,19,33};
	int n=arry.length
for(int i=0;i<arry.length-1;i++) {
	  for (int j = 0; j < n - 1; j++) {   
		  
	if (arry[j]>arry[j+1]) {
		int tmp=arry[j];
		arry[j]=arry[j+1];
		arry[j+1]=tmp;		
			
	}
	System.out.print(arry);
}

}
}