package org.greatlearning.iitr.lab.services;

public final class BubbleSortImplementation {
    public void bubblesort(int arr[])
    {
    	int n=arr.length;
        for(int i=0;i<n-1;i++)
    		{
    			for(int j=0;j<n-1;j++)
    			{
    				if(arr[j]<arr[j+1])
    				{
    					int temp=arr[j];
    				    arr[j]=arr[j+1];
    				    arr[j+1]=temp;
    				}
    			}
    		}
    }
}
