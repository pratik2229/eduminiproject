
package miniproject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Library {
	
	public static void main(String args[]) 
	{    
		
	    	Book book = null;
	    	Student student;
	    	ArrayList<Book> bookList=new ArrayList<Book>();
	        bookList.add(new Book(10,200,"M3","sharma"));
	        bookList.add(new Book(11,270,"DBMS","pratik"));
	        bookList.add(new Book(12,400,"MySql","jonson"));
	        bookList.add(new Book(13,679,"DC","john"));
	        bookList.add(new Book(14,545,"SE","jinks"));
	        bookList.add(new Book(15,354,"Let us C","denis ritchie"));
	       
	        
	    LinkedHashSet<Student> studentList=new LinkedHashSet<Student>();
	    System.out.println(studentList);
	    System.out.println("welcome");
	    System.out.println("The List of Books: ");
	    Iterator<Book> itr = bookList.iterator();
    	while(itr.hasNext()) {
    		System.out.println("["+itr.next()+"]");
    	}
    	
        Scanner sc=new Scanner(System.in);
        
             
        
     while(true) {
    	 
    	 System.out.println("Enter any Input:");
    	 
    	 System.out.println("Enter 1 to add Book");
         System.out.println("Enter 2 to issue a Book");
         System.out.println("Enter 3 to return Book");
         System.out.println("Enter 4 to see complete issue details");
         System.out.println("Enter 5 to show details of current books list");
         System.out.println("Enter 6 to exit");
          
    	 int choice=sc.nextInt();
    	 if(choice==1) {
    	 //add
        	System.out.println("Enter the BookId,Book price,book name,authore");
        	bookList.add(new Book(sc.nextInt(),sc.nextDouble(),sc.next(),sc.next()));
        	Iterator<Book> itrAfter=  bookList.iterator();
        	while(itrAfter.hasNext())
        	{
        		System.out.println("["+itrAfter.next()+"]");
        	 }       	
    	 }
        
    	 if(choice==2) {
    	 
        	System.out.println("Enter the student's details to whome you want to issue book:");//issue
        	System.out.println("Enter sId,sName,branch,bookId,bookNane,author");
        	studentList.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.next()));
        	System.out.println(" Enter the issuing Date:");
        	int DD=sc.nextInt(),MM=sc.nextInt(),YYYY=sc.nextInt();
        	System.out.println(DD+"/"+MM+"/"+YYYY); 
        	bookList.remove(0);
        	System.out.println("The last date to return the book is 30 days from the issue date!!!");
        	
    	 }
        	
    	 if(choice==3)//return
    	 {
        	bookList.add(new Book(sc.nextInt(),sc.nextDouble(),sc.next(),sc.next()));
        	studentList.clear();
        	System.out.println("Book returned");
    	 }
        	
    	 if(choice==4)//Current books issued details
    	 {
        	 Iterator<Student> itr2 = studentList.iterator();
         	while(itr2.hasNext()) {
         		System.out.println("["+itr2.next()+"]");
         	}
    	 }
    	 if(choice==5)//current books list
    	 {
    		 Iterator<Book> itrAfter = bookList.iterator();
	        	while(itrAfter.hasNext()) {
	        		System.out.println("["+itrAfter.next()+"]");
	        		
	        	}
    	 }
    	 if(choice==6) {
    		 break;
    	 }
    	 System.out.println("To continue press number from 1-5 and press 6 to exit");
      }

     System.out.println("End");	
     
        }
}

class Book
{
	int bookId;
	double bookPrice;
    
	String bookName,bookAuthor;
    String issueDate,returnDate;
    int fine;
    String status;//Active, Issued
    public Book(int bookId,double bookPrice,String bookName,String bookAuthor)
    {
        super();
        this.bookId=bookId;
        this.bookPrice=bookPrice;
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
    }
    public String toString()
    {
        return "("+bookId+","+bookPrice+","+bookName+","+bookAuthor+")";
    }
}
