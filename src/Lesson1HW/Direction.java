package Lesson1HW;

public class Direction {


    public static void main (String[] args) {
        Member[] membersTeam = new Member[4];
        membersTeam[0] = new Member("Ivan", 16, 2500, 500, 6000);
        membersTeam[1] = new Member("Dima", 15, 2000, 100, 2000);
        membersTeam[2] = new Member("Alena", 16, 3000, 50, 1000);
        membersTeam[3] = new Member("Ola", 17, 3000, 200, 6000);

        Course course = new Course(2000, 200,3000);
        course.doIt(membersTeam);
        printInfoMembersTeam(membersTeam);
    }

    public static void printInfoMembersTeam(Member[] membersTeam) {
        System.out.println("Количество участников  " + Member.countMember + ":");
        for (int i = 0; i < membersTeam.length; i++) {
            System.out.println((i + 1) + " " + membersTeam[i].infoMember() + Member.passStage);
        }
    }


}





/*
2. Добавить класс Team, который будет содержать:
        название команды;
        массив из четырех участников — в конструкторе можно сразу всех участников указывать);
        метод для вывода информации о членах команды, прошедших дистанцию;
        метод вывода информации обо всех членах команды.
        3. Добавить класс Course (полоса препятствий), в котором будут находиться:
        массив препятствий;
        метод, который будет просить команду пройти всю полосу.
        В итоге должно получиться похожее:
public static void main(String[] args) {
        Course c = new Course(...); // Создаем полосу препятствий
        Team team = new Team(...); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
        }*/
