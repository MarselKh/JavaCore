package Lesson1HW;

public class Direction {

/*    int courseDistance [];*/

    public static void main (String[] args) {

        Team team = new Team("Dinamo", member1, member2, member3, member4);
        Course course = new Course(2500, 200,3000);
/*        course.doIt(team);*/
/*        team.printInfoMembersTeam();*/

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
