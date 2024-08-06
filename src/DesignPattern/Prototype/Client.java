package DesignPattern.Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apprBatchStudent = new Student();
        apprBatchStudent.setBatch("Apr21");
        apprBatchStudent.setAverageBatchPsp(89.0);
        studentRegistry.register("april21Batch",apprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.iq = 180;
        aprBatchIntelligentStudent.setBatch("April21");
        aprBatchIntelligentStudent.setAverageBatchPsp(89.0);
        studentRegistry.register("aprBatchIntelligentStudent", aprBatchIntelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

       Student sidd = StudentRegistry.get("april21Batch").clone();

       Student templateStudent = StudentRegistry.get("april21Batch") ;

       Student copy = templateStudent.clone() ;
//        sidd.setName("Siddarth");
//        sidd.setAge(21);
//        sidd.setStudentpsp(91.0);
//
//        System.out.println(sidd.getAge());




        Student intelligentSiddharth = studentRegistry.get("aprBatchIntelligentStudent").clone();


        intelligentSiddharth.setName("Siddharth");
        intelligentSiddharth.setAge(24);
        intelligentSiddharth.setStudentpsp(91.0);

        System.out.println(intelligentSiddharth.getBatch());

    }
}
