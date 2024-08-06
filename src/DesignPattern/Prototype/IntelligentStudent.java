package DesignPattern.Prototype;

public class IntelligentStudent extends Student{
    public int iq;
    public IntelligentStudent(){
    }
    public IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iq = s.iq;
    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
