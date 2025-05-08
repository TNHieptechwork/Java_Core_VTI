package org.example.models;

import java.time.LocalDate;
import java.util.*;

public class LibManager {
   private Map<String,Book> books = new HashMap<>();
   private Map<String,User> users = new HashMap<>();
   private List<LoanRecord> listLoanRecords = new ArrayList<>();

   public void addBook(Book book){
      books.put(book.getId(),book);
   }
   public void addUser(User user){
      users.put(user.getId(),user);
   }
   public boolean borrowBook(String userId,String BookId){
       User user = users.get(userId);
       Book book = books.get(BookId);

       if(user == null || book == null){
          System.out.printf("Book | User not found");
          return false;
       }
       if(!book.isAvailable()){
          System.out.println("This book was lent");
          return false;
       }
       book.setAvailable(false);
       LoanRecord loanRecord = new LoanRecord(user,book, LocalDate.now(),null);
       listLoanRecords.add(loanRecord);

       return true;
   }

   public boolean returnBook(String userId,String BookId){
      for(LoanRecord record : listLoanRecords){
         if(record.getBook().getId().equals(BookId) && record.getUser().getId().equals(userId)
         && record.getReturnDate() == null){
            record.getBook().setAvailable(true);
               record.setReturnDate(LocalDate.now());
               record.getBook().setAvailable(true);

            System.out.printf("Book returned succesfully \n");
            return  true;
         }
      }
      System.out.printf("No active loan record found");
      return true;
   }
    // Hiển thị danh sách sách đang được mượn.
   public void printListBookBorrow(){
      System.out.println("List of Books is borrowing: ");
         for(LoanRecord record : listLoanRecords){
            if(record.getReturnDate() == null){
               Book b = record.getBook();
               System.out.println("\nBook_Id: "+b.getId() + " - " + b.getTitle() + " - " + b.getAuthor() + " - "
            + "Borrowing");
            }
         }
   }
    //Hiển thị danh sách sách đã được trả.
    public void printListBookReturned(){
        System.out.println("List of Books is returned: ");
        for(LoanRecord record : listLoanRecords){
            if(record.getReturnDate() != null){
                Book b = record.getBook();
                System.out.println("\nBook_Id: "+b.getId() + " - Title: " + b.getTitle() + " - Author: " + b.getAuthor() + " - "
                        + "Returned");
            }
        }
    }
    //Tìm các sách mà một người dùng đã mượn trong quá khứ.
    public void findBookBorrowed_past(String userId){
       User user = users.get(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("\nBooks borrowed by " + user.getName() + ":");
        boolean found = false;
        for(LoanRecord record : listLoanRecords){
            if(record.getUser().getId().equals(userId)){
                Book b = record.getBook();
                System.out.println("\nBook_Id: "+b.getId() + " - Title: " + b.getTitle() + " - Author: " + b.getAuthor() + " - "
                        + "Borrowed");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books borrowed.");
        }
    }

}
