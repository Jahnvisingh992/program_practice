//.Write a  program to print the book details (book id,book name,price) using arrays of object
package basics.practice;
import java.util.*;
public class Book1 {
     int id;
        String name;
        double price;

        // constructor to intialize the book details
        public Book1(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

     class bookdetails {

        public static void main(String[] args) {
            Book1[] books = new Book1[1];

            // create sccaner object for taking input
            Scanner scn = new Scanner(System.in);

            System.out.println("Enter The number of books::");
            int noOfBooks = scn.nextInt();

            for (int i = 0; i < noOfBooks; i++) {
                System.out.println("Enter Book Id::");
                int id = scn.nextInt();

                scn.nextLine();
                System.out.println("Enter Book Name::");
                String name = scn.nextLine();

                System.out.println("Enter Book Price::");
                double price = scn.nextDouble();

                books[i] = new Book1(id, name, price);

            }

            // print book details

            System.out.println("-------------Book details----------------------1");
            for (int i = 0; i < noOfBooks; i++) {

                Book1 b = books[i];

                System.out.println("Book Id::" + b.id);
                System.out.println("Book Name::" + b.name);
                System.out.println("Book price::" + b.price);
            }

        }

    }
    /*------------------------------------------------------------------------------------------------------*/
//Second approch
   public class Book1 {
        int bookId;
        String bookName;
        float bookPrice;
        public int getBookId() {
            return bookId;
        }
        public void setBookId(int bookId) {
            this.bookId = bookId;
        }
        public String getBookName() {
            return bookName;
        }
        public void setBookName(String bookName) {
            this.bookName = bookName;
        }
        public float getBookPrice() {
            return bookPrice;
        }
        public void setBookPrice(float bookPrice) {
            this.bookPrice = bookPrice;
        }
        //Using toString method-
        @Override
        public String toString() {
            return "Book [bookid=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
	       //Get input by user
            System.out.print("Enter the no. of Books:- ");
            int num = sc.nextInt();
            Book1 book[] = new Book1[5];
            System.out.println("\t\tEnter Book Details:-");

            for(int i=0; i<num; i++) {
                Book1 book1 = new Book1();
                System.out.print("Enter Book Id: ");
                int bookid = sc.nextInt();
                sc.nextLine();
                book1.setBookId(bookid);
                System.out.print("Enter Book Name: ");
                String bookName = sc.nextLine();
                book1.setBookName(bookName);
                System.out.print("Enter Book Price: ");
                float bookPrice = sc.nextFloat();
                book1.setBookPrice(bookPrice);
                book[i] = book1;


            }
            System.out.println("\t\tAll Books Details:-");
            for(int i=0; i<num; i++) {
                System.out.println(book[i]);

            }

        }


    }