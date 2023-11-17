// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        /*User user1 = new User("AA", new Printer());
        User user2 = new User("BB", new Printer());
        User user3 = new User("CC", new Printer());
        User user4 = new User("DD", new Printer());
        User user5 = new User("EE", new Printer());*/

        User user1 = new User("AA", printer);
        User user2 = new User("BB", printer);
        User user3 = new User("CC", printer);
        User user4 = new User("DD", printer);
        User user5 = new User("EE", printer);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();


    }
}