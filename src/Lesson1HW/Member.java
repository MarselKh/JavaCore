package Lesson1HW;

public class Member {
    private String name;
    private int age;
    private int run;
    private int swin;
    private int cycle;
    static boolean passStage;
    static int countMember;

    public Member(String name, int age, int run, int swin, int cycle) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.swin = swin;
        this.cycle = cycle;
        passStage = false;
        countMember++;
    }


    public String infoMember () {
        return  this.name + " из команды " + passStage + " возраст " + this.age + " " +
                this.run + " " + this.swin  + " " + this.cycle;
    }

    public int getRun() {
        return run;
    }

    public int getSwin() {
        return swin;
    }

    public int getCycle() {
        return cycle;
    }
}
