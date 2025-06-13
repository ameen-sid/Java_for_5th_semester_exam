package Tutorials;

class Students {

    private int roll;

    public void setRoll(int n) {
        this.roll = n;
    }

    public void getRoll() {
        System.out.println("Roll No: " + this.roll);
    }
}

class Test extends Students {

    float marks1, marks2;

    public void setMarks(float m1, float m2) {

        this.marks1 = m1;
        this.marks2 = m2;
    }

    public void getMarks() {

        System.out.println("Marks 1: " + this.marks1);
        System.out.println("Marks 2: " + this.marks2);
    }
}

interface Sports {

    final float sportMarks = 6.0f;
    abstract void getSport();
}

class Result extends Test implements Sports {

    private float total;

    public void getSport() {
        System.out.println("Sport Marks: " + sportMarks);
    }

    public void display() {

        this.total = marks1 + marks2 + sportMarks;

        getRoll();
        getMarks();
        getSport();

        System.out.println("Total Marks: " + this.total);
    }
}

public class Interfaces {

    public void mainFunction() {

        Result aa = new Result();
        aa.setRoll(101);
        aa.setMarks(30.5f, 35.9f);
        aa.display();
    }
}
