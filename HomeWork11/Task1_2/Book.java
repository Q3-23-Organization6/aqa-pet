package HomeWork11.Task1_2;

import java.util.Arrays;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public static void printBooks(Printable[] printables) {
        Arrays.stream(printables)
                .filter(printable -> printable instanceof Book)
                .forEach(printable -> printable.print());
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}