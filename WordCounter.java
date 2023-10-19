package pkg;

import java.util.Scanner;


//this is the Word Counter Which tells you which letters are there in your String which user has Passed
public class WordCounter {
	String str;
	//Code to Split the Text as well as Storing   the splited Text in the array 
	public void storeSplit() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Text That You want:- ");
		str=sc.nextLine();// user Input according to that Output will Come
		String arr[]=str.split(" ");
 		for(int i =0;i<arr.length;i++) {
		   System.out.println("Split the String:  "+arr[i]);	
		}
		
		System.out.println("Counting the Words:  "+arr.length);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCounter wc=new WordCounter();
		wc.storeSplit();
		 
	}

}
