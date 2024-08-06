package IntroToOOP;

public class Student {
    String name;
    String batchName;
    int age;
    double psp;

    void changeBatch(String newBatch){
        batchName = newBatch;
    }
    void giveMockInterview(){
        System.out.printf("Giving Mock Interview");
    }
}
