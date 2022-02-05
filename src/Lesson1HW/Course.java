package Lesson1HW;


public class Course {
    private int distanceRun;
    private int distanceSwim;
    private int distanceCycle;

    public Course(int distanceRun, int distanceSwim, int distanceCycle) {
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        this.distanceCycle = distanceCycle;
    }

    public void doIt(Member[] membersTeam) {
        //Вариант 2
        for (int i = 0, j = 0, k = 0; i < membersTeam.length && j < membersTeam.length && k < membersTeam.length; i++, j++,k++) {
            int tmpRun = 0;
            int tmpSwim = 0;
            int tmpCycle = 0;
            tmpRun += membersTeam[i].getRun();
            tmpSwim += membersTeam[i].getSwin();
            tmpCycle += membersTeam[i].getCycle();
            if (tmpRun >= distanceRun && tmpSwim >= distanceSwim && tmpCycle >= distanceCycle) {
                Member.passStage = "Прошел этап";
            } else {
                Member.passStage = "Не прошел этап";
            }
        }
/*        Вариант 1
                for (int i = 0; i < membersTeam.length; i++) {
                if (distanceRun >= membersTeam[i].getRun() && distanceSwim >= membersTeam[i].getSwin() &&
                        distanceCycle >= membersTeam[i].getCycle()) {
                    Member.passStage = true;
                } else {
                    Member.passStage = false;

            }
        }*/
    }

}
