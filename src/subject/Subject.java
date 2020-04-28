package subject;

import java.util.Random;

public class Subject {

    private String nameSubject;
    private double mark;
    private boolean passed;

    public Subject()
    {

    }

    public double getMark() {
        return mark;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public Subject(String nSubject)
    {
        Random number = new Random();
        this.nameSubject = nSubject;
        this.mark = 2 + number.nextDouble() * 3;
        this.passed = passed_or_not();
    }

    private boolean passed_or_not()
    {
        if(this.mark <= 2)
        {
            return false;
        }
        else return true;
    }
}
