public class User extends Thread {

    private String username;
    private Printer printer;

    public User(String username, Printer printer) {
        this.username = username;
        this.printer = printer;
    }

    @Override
    public void run() {
        super.run();
        synchronized (printer) {
            printer.print(username + ".pdf");
        }
    }
}
