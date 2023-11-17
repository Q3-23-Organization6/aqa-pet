package HomeWork11.Task1_2;

import java.util.Arrays;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public static void printMagazines(Printable[] printables) {
        Arrays.stream(printables)
                .filter(printable -> printable instanceof Magazine)
                .forEach(printable -> printable.print());
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }
}