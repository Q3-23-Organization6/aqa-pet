package HomeWork11.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 5),
                new User("Alice", "Smith", 30),
                new User("Bob", "Johnson", 22),
                new User("Jane", "Williams", 10),
                new User("Sam", "Adams", 19),
                new User("Eva", "Scott", 35),
                new User("Mike", "Taylor", 30),
                new User("Sophia", "Anderson", 21),
                new User("Alex", "Brown", 18),
                new User("Sara", "White", 26)
        );
        System.out.println("10 users: " + users);

        List<User> sortedByAge = users.stream()
                .sorted((user1, user2) -> Integer.compare(user1.getAge(), user2.getAge()))
                .collect(Collectors.toList());
        System.out.println("Sorted by age: " + sortedByAge);

        double averageAge = users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);

        List<User> sortedByFirstNameAndAge = users.stream()
                .sorted((user1, user2) -> {
                    if (user1.getFirstName().equals(user2.getFirstName())) {
                        return Integer.compare(user1.getAge(), user2.getAge());
                    } else {
                        return user1.getFirstName().compareTo(user2.getFirstName());
                    }
                })
                .collect(Collectors.toList());
        System.out.println("Sorted by firstName and age: " + sortedByFirstNameAndAge);

        boolean secondNameSOrA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        System.out.println("Has user with 'S' or 'A': " + secondNameSOrA);

        boolean allUsersOlderThan18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println("All users older than 18: " + allUsersOlderThan18);
    }
}
