package AccessModifier;

public class Student {
    private String name ;
    int batch_id ;
    protected double psp;
    public String universityName ;

    void changeBatch(int newBatch_id){
        name = "Naman";
        batch_id = newBatch_id;
        psp = 90.0;
        universityName = "abc";
    }

    void print(){
        System.out.println("name " + name);
        System.out.println("batch_id" + batch_id);
        System.out.println("psp " + psp);
        System.out.println("universityName "+ universityName);
    }
}
