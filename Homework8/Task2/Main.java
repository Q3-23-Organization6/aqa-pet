package Homework8.Task2;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Book 1");
        printables[1] = new Magazine("Magazine 1");
        printables[2] = new Book("Book 2");
        printables[3] = new Magazine("Magazine 2");

        for (Printable printable : printables) {
            printable.print();
        }

        Book.printBooks(printables);

        Magazine.printMagazines(printables);
    }
}
