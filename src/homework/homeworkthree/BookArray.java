package homework.homeworkthree;

import java.util.Random;

public class BookArray {

    public static void main(String[] args) {
        Book[] bookArray = new Book[7];
        Random randomizer = new Random();

        for (int i = 0; i < 6; i++){
            bookArray[i] = new Book(false,
                    randomizer.nextInt(200),
                    "Harry Potter, part "+(i+1),
                    "J.K. Rowling");
            }
        bookArray[6] = new Book();

        for (int i = 0; i < 7; i++){
            System.out.println("" + bookArray[i].electron +
                    " " + bookArray[i].page +
                    " " + bookArray[i].name +
                    " " + bookArray[i].authorName);
        }

        Book book1 = new Book(false,
                1000,
                "Harry Potter",
                "J.K. Rowling");

        Book book2 = new Book(true,
                100,
                "Harry Potter",
                "J.K. Rowling");

        Book book3 = new Book(false,
                1000,
                "Bible",
                "Matvei");
        System.out.println(book1.equals(book2));//true
        System.out.println(book1.equals(book3));//false
        System.out.println(book3.equals(book2));//false
        System.out.println(book3.equals(null));//false
        System.out.println(book3.equals(new int[3]));//false


    }




}
