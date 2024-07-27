package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class BookProgram {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String printOption = scanner.nextLine();

        if (printOption.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printOption.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

        // Creating Book objects
        Book book1 = new Book("To Kill a Mockingbird", 281, 1960);
        Book book2 = new Book();
        Book book3 = new Book("1984");
        Book book4 = new Book("The Great Gatsby", 180);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        scanner.close();
    }
}