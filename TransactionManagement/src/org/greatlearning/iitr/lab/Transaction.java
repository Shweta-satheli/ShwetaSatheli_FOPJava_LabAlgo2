package org.greatlearning.iitr.lab;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of transaction array");
    int size=sc.nextInt();
	int arr[]=new int[size];
    System.out.println("enter the values of array");
    for(int i=0;i<size;i++)
    	arr[i]=sc.nextInt();
    System.out.println("enter the total no of targets that needs to be achieved");
    int targetNo=sc.nextInt();
    while(targetNo!=0)
         {
    	int flag=0;
    	long target;
    	System.out.println("enter the value of target");
    	target=sc.nextInt();
    	long sum=0;
    	for(int i=0;i<size;i++)
    	{
    		sum+=arr[i];
    		if(sum>=target)
    		{
    			System.out.println("Target achieved after "+(i+1)+" transactions");
    			flag=1;
    			break;
    			
    		}
    	}
    	if (flag==0)
    		System.out.println("Target is not achieved");
    	targetNo--;
     }
    
	}

}
