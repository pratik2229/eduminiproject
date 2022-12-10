package edubminiproject;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;

public class Library {

    public static void main(String args[])
    {
         /*

            System.out.println("Enter 1 to add Book");
            System.out.println("Enter 2 to issue a Book");
            System.out.println("Enter 3 to return Book");
            System.out.println("Enter 4 to see complete issue details");
            System.out.println("Enter 5 to show details of added book");
             System.out.println("Enter 6 to exit");
          */
        ArrayList<Book> bookList=new ArrayList<Book>();
        bookList.add(new Book(10,200,"M3","sharma"));
        bookList.add(new Book(11,270,"DBMS","pratik"));
        bookList.add(new Book(12,400,"MySql","jonson"));
        bookList.add(new Book(13,679,"DC","john"));
        bookList.add(new Book(14,545,"SE","jinks"));
        bookList.add(new Book(15,354,"Let us C","denis ritchie"));

        System.out.println(bookList);

        LinkedHashSet<Student> studentList=new LinkedHashSet<Student>();
        studentList.add(new Student(1,"pratik","IT"));
        studentList.add(new Student(2,"Rushi","Mech"));
        studentList.add(new Student(2,"anuj","Entc"));
        studentList.add(new Student(2,"Aniket","Cse"));

        System.out.println(studentList);
    }
}

class Book
{
    int bookId,bookPrice;
    String bookName,bookAuthor;
    String issueDate,returnDate;
    int fine;
    String status;//Active, Issued
    public Book(int bookId,int bookPrice,String bookName,String bookAuthor)
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

class Student
{
    int sId;
    String sName,branch;
    LinkedHashSet<Book> bookList;

    public Student(int sId, String sName, String branch) {
        // TODO Auto-generated constructor stub
        this.sId=sId;
        this.sName=sName;
        this.branch=branch;
    }
    public String toString()
    {
        return "("+sId+","+sName+","+branch+")";

    }
}
