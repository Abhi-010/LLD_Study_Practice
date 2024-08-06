package Constructor;

public class Student {
        String name ;
        int age = 21;
        private String univName;
        double psp;
        boolean isPlaced;

        public Student(Student old){
                name = old.name;
                univName = old.univName;
                psp = old.psp;
                isPlaced = old.isPlaced;
        }
        //own constructor
        public Student(String studentName, String universityName){
                name = studentName;
                univName = universityName;
        }


}
