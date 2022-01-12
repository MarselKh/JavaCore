package Lesson1HW;


public class Course {
/*    private String nameCourse;*/
/*    private int distanceRun;
    private int distanceSwim;
    private int distanceCycle;*/
    int [] stages;

    public Course(int distanceRun, int distanceSwim, int distanceCycle) {
/*        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.distanceCycle = distanceCycle;*/
        int[] stages = new int[3];
        stages [0] = distanceRun;
        stages [1] = distanceSwim;
        stages [2] = distanceCycle;
    }

/*    public void doIt(Team team) {
        for (int i = 0; i < team.membersTeam.length; i++) {
            if (distanceRun >= team.membersTeam[i].getRun() || distanceSwim >= team.membersTeam[i].getSwin() ||
                    distanceCycle >= team.membersTeam[i].getCycle()) {
                Member.passStage = true;
            }

        }

       *//* return true;*//*
    }*/

}
