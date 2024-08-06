package AccessModifierCheck;
import AccessModifier.Student;

public class StudentClass extends Student {
    public static void main(String[] args) {

        Student st = new StudentClass();

        StudentClass sc = new StudentClass();
        sc.psp = 55;
    }
}

class Main {
}
