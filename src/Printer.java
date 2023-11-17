public class Printer {

    public void info() {
        System.out.println("HP 4500");
        System.out.println("Mfg date: 12/12/2023");
    }

    /*public synchronized void print(String filePath) {
        try {
            Thread.sleep(100);
            System.out.println("Start ->");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("<-- End");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }*/

    public void print(String filePath) {
        try {
            Thread.sleep(100);
            System.out.println("Start ->");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("<-- End");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
