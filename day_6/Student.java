package day_6;


// we can achieve encapsulation using private variable or getter and setter.
// if we cant use encapsulation -> anyone can change data , no validation, or security risk.


class Student {
    private int age;   // data hidden

    public void setAge(int age) {
        if (age > 0) {
            System.out.println("Not Eligible");
        }
    }

    public int getAge() {
        return age;
    }
}

