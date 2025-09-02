/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.management.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DINUSHKA_THARIDU-AS
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        int response;
        
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Show all books");
            System.out.println("2. Add a book");
            System.out.println("3. Add a member");
            System.out.println("4. Issue a book");
            System.out.println("5. Return a book");
            System.out.println("6. Find a book");
            System.out.println("7. Remove a book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            response = input.nextInt();
            input.nextLine();
            System.out.println();

            switch (response) {
                case 1:
                    library.showAllBooks();
                            
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = input.nextLine();
                    System.out.print("Enter Year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    library.addBook(new Book(bookId, name, author, isbn, year));
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    int memberId = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Name: ");
                    String memberName = input.nextLine();
                    library.addMember(new Member(memberId, memberName));
                    break;
                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = input.nextInt();
                    library.issueBook(issueId);
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = input.nextInt();
       
                    library.returnBook(returnId);   
                    break;
                case 6:
                    System.out.print("Enter Book KeyWord (name, Auther or ISBN): ");
                    String keyword = input.next();
                    library.searchBook(keyword);
                    break;
                case 7:
                    System.out.print("Enter Book Name: ");
                    String title = input.nextLine();
                    library.removeBook(title);
                    break;
                case 0:
                        
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (response!= 0);

        input.close();
    }
        
    }
    
    
    


class Member{
    
    private int memberId;
    private String memberName;

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }
    
    
    
    public Member(int memberId, String memberName ){
        this.memberId = memberId;
        this.memberName = memberName;
        
    }
    
}

class Book{
    
   private int bookId;
   private String name;
   private String auther;
   private String isbn;
   private int year;
   private boolean isIssued ;

    public String getIsbn() {
        return isbn;
    }

    public boolean isIsIssued() {
        return isIssued;
    }

    public int getBookId() {
        return bookId;
    }
    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }

    public int getYear() {
        return year;
    }
   
    Book(int bookId, String name, String auther, String isbn, int year){
        this.bookId = bookId;
        this.name = name;
        this.auther = auther;
        this.isbn = isbn;
        this.year = year;
        this.isIssued = false;
    }
    
     public void issue() { 
         isIssued = true; 
     }
     public void returnBook() { 
         isIssued = false; 
     }

    @Override
    public String toString() {
        return bookId + " - " + name + " by " + auther + (isIssued ? " [Issued]" : " [Available]");
    }
}

class Library{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    
    // Add Book
    
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added Successfuly! ");
        
    }
    
    // Add Member 
    public void addMember(Member member){
        members.add(member);
        System.out.println("Member Added Successfuly !");
    }
    
    //show all books
    public void showAllBooks(){
        for(Book b: books  ){
            System.out.println(b);
        }
        
    }
    
    // Issue a Book
    public void issueBook(int bookId){
        for (Book b :   books){
            if (b.getBookId() == bookId  && !b.isIsIssued()){
                b.issue();
                System.out.println("Book Issued " +b.getName());
                return;
            }
        }
         System.out.println("Book not available!");
        
    }
      // Return  book
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId && b.isIsIssued()) {
                b.returnBook();
                System.out.println("Book returned : " + b.getName());
                return;
            }
        }
        System.out.println("Invalid book ID!");
    }
    
    public void searchBook(String keyword){
        for(Book b : books){
            if(b.getName().equals(keyword) || b.getAuther().equals(keyword) || b.getIsbn().equals(keyword)){
                System.out.println(b);
                return;
            }
        }
          System.out.println("Book not found!");
        
    }
    
    public void removeBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                books.remove(book);
                System.out.println("Book removed  " + name); 
            }
        }
        System.out.println("Book not found!");
    }
    
}
