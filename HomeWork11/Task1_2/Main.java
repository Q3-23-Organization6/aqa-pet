package HomeWork11.Task1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
                Printable.create("book", "Book 1"),
                Printable.create("magazine", "Magazine 1"),
                Printable.create("book", "Book 2"),
                Printable.create("magazine", "Magazine 2")};

        Arrays.stream(printables).forEach(Printable::print);

        Book.printBooks(printables);

        Magazine.printMagazines(printables);

    }
}
