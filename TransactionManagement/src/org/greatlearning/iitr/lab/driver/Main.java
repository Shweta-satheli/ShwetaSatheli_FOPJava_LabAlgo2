package org.greatlearning.iitr.lab.driver;

import java.util.Scanner;

import org.greatlearning.iitr.lab.services.MergeSortImplementation;
import  org.greatlearning.iitr.lab.services.NotesCount;

public class Main {

	public static void main(String[] args) {
        MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
        NotesCount notescount = NotesCount();
        System.out.println("enter the size for currency denominations");
        try (Scanner sc = new Scanner(System.in)) {
			int size=sc.nextInt();
			int[] notes= new int[size];
			System.out.println("enter the currency denominations value");
			for	(int i=0;i<size;i++)
			{
				notes[i]=sc.nextInt();
			}
			System.out.println("enter the amount that ypu want to pay");
			int amount=sc.nextInt();
			mergeSortImplementation.sort(notes, 0 , notes.length-1);
			notescount.notesCount(notes,amount);
		}
	}

	private static NotesCount NotesCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
