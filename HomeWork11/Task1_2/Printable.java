package HomeWork11.Task1_2;

public interface Printable {
    void print();

    /*При этом варианте у меня не получилось получить ответ
     от методов Book.printBooks(printables) и Magazine.printMagazines(printables);
        static Printable create(String type, String title) {
        type = type.toLowerCase();
        if ("book".equals(type)) {
            return () -> System.out.println("Book: " + title);
        } else if ("magazine".equals(type)) {
            return () -> System.out.println("Magazine: " + title);
        } else {
            return () -> System.out.println("Unknown type");
        }*/

        static Printable create(String type, String title) {
            type = type.toLowerCase();
            if ("book".equals(type)) {
                return new Book(title);
            } else if ("magazine".equals(type)) {
                return new Magazine(title);
            } else {
                return () -> System.out.println("Unknown type");
            }
    }
}
