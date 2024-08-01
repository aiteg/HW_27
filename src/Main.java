public class Main {
    public static void main(String[] args) {

        ComplexTask complexTask = new ComplexTask("Грант", "Получить грант в MetaLabs", 100, "Не выполнено");
        SimpleTask subTask1 = new SimpleTask("Посещяемость", "Без единого пропуска" , 90, "Не выполнено");
        SimpleTask subTask2 = new SimpleTask("Домашнее задание", "Сдавать тз вовремя" , 80, "Не выполнено");
        SimpleTask subTask3 = new SimpleTask("Активность на руке", "Готовиться к уроку заранее, и отвечать на вопросы" , 94, "Не выполнено");

        complexTask.addSubTask(subTask1);
        complexTask.addSubTask(subTask2);
        complexTask.addSubTask(subTask3);

        System.out.println(complexTask.toString());
        complexTask.allSubTasksCompleted(); //

        System.out.println(complexTask.toString());

        System.out.println("Всего комплексных задач: " + (ComplexTask.getTaskCounter() - ComplexTask.getSubTasksCounter()));
        System.out.println("Всего подзадач: " + ComplexTask.getSubTasksCounter());
        System.out.println("Всего задач: " + ComplexTask.getTaskCounter());
    }
}
