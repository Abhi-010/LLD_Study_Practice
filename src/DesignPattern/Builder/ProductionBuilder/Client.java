package DesignPattern.Builder.ProductionBuilder;

import java.io.BufferedReader;

public class Client {
    public static void main(String[] args){
        //Builder b = new Builder();
//        Builder b = Student.getBuilder();
//        b.setAge(12);
//        b.setName("Naman");
//        b.setGradYear(2012);
// Student s = b.build();



        Student s1 = Student.getBuilder()
                    .setAge(12)
                        .setName("Naman")
                                .setPsp(89.0)
                                        .setUniversityName("KIIT").build();

        System.out.println("DEBUG");

        Student.Builder builder = new Student.Builder();
        Student s = builder.setAge(34).build();


    }
}
