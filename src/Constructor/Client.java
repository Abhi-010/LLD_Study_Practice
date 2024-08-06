package Constructor;

public class Client {
    public static void main(String[] args) {

        Student st = new Student("Naman", "ABC");
        Student stCopy = new Student(st);
        Student st11 = st;
        System.out.println("DEBUG");

    }
}
