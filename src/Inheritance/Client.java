package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login();

        System.out.println(i.userName);

    }
}
