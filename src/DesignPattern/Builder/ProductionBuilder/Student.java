package DesignPattern.Builder.ProductionBuilder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    long id ;
    int gradYear;
    String phoneNumber;

    static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
    }

     static class Builder {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private long id ;
        private int gradYear;
        private String phoneNumber;

        public Student build(){
            if(getGradYear() > 2022){
                throw new IllegalArgumentException("Grad year cannot be greater than 2020");
            }
            return new Student(this);
        }



        //-----------------------------------------------------------------------



        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getPsp() {
            return psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public long getId() {
            return id;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp)
        {
            this.psp = psp;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }
    }

}


