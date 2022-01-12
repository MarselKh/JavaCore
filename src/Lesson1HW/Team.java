package Lesson1HW;

public class Team {
    private String nameTeam;
    Member[] membersTeam = new Member[4];

    public Team(String nameTeam, Member member1, Member member2,Member member3, Member member4) {
        this.nameTeam = nameTeam;
        creatMembers ();
        membersTeam [0] = member1;
        membersTeam [1] = member2;
        membersTeam [2] = member3;
        membersTeam [3] = member4;
        printInfoMembersTeam(membersTeam);
    }

    public void creatMembers () {
        membersTeam[0] = new Member("Ivan", 16, 3000, 500, 6000);
        membersTeam[1] = new Member("Dima", 15, 2000, 100, 2000);
        membersTeam[2] = new Member("Alena", 16, 3000, 50, 1000);
        membersTeam[3] = new Member("Ola", 17, 3000, 200, 6000);
    }

/*    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        Member[] membersTeam = new Member[4];
        Member membersTeam1 = new Member("Ivan", 16, 3000, 500, 6000);
        Member membersTeam2 = new Member("Dima", 15, 2000, 100, 2000);
        Member membersTeam3 = new Member("Alena", 16, 3000, 50, 1000);
        Member membersTeam4 = new Member("Ola", 17, 3000, 200, 6000);
        printInfoMembersTeam(Team);
*//*        infoMemberDoIt ();*//*
    }*/



    public void printInfoMembersTeam(Member[] membersTeam) {
        System.out.println("Команда " + nameTeam + " ее количество " + Member.countMember + ":");
        for (int i = 0; i < membersTeam.length; i++) {
                        System.out.println((i + 1) + " " + membersTeam[i].infoMember());
        }
    }

/*
    public void infoMemberDoIt (Course course) {
        if (course.doIt())
    }
*/

/*    public String toString() {
        String tmp = "";
        for (int i = 0; i < membersTeam.length; i++) {
            tmp += membersTeam[i].getRun() + ", ";
        }
        return nameTeam + " (" + tmp + ") ";
    }*/





/*    public void infoDoIt (Course course, Team team) {
        course.doIt();
    }*/

}

