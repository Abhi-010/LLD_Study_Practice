package DesignPattern.PrototypeRevision;

public class Client {

    public static void fillRegistry(StudentRegistry registry){

        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("April 21");
        aprBatchStudent.setAverageBatchPsp(89.0);
        registry.register("april21Batch", aprBatchStudent);

        IntelligentStudent prototypeIntelligentStudent
                = new IntelligentStudent();
        prototypeIntelligentStudent.iq = 85;
        prototypeIntelligentStudent.setBatch("June 21");
        prototypeIntelligentStudent.setAverageBatchPsp(80.0);

        registry.register("IntelligentStudentPrototype",prototypeIntelligentStudent);


    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student sidd = studentRegistry.get("april21Batch").clone();
        sidd.setName("Siddhart");
        sidd.setAge(25);
        sidd.setStudentPsp(91);

        Student intelligentStudent = studentRegistry.get("IntelligentStudentPrototype").clone();
        intelligentStudent.setName("Abhishek");
        intelligentStudent.setAge(30);

        System.out.println("DEBUG");
    }
}
