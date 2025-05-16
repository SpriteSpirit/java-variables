//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
            Задача 1.
            Необходимо присвоить переменным разные значения.
            Для решения этой задачи используйте тип переменной var.
            Выведите значения каждой переменной в консоль.
         */

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        /*
            Задача 2.
            Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4
            Для решения этой задачи используйте тип переменной var.
            Выведите в консоль новые значения переменных.
         */

        dog += 2;
        cat += 2;
        paper += 2;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        /*
            Задача 3.
            Теперь нужно уменьшить значение каждой переменной:

            dog уменьшить на 3.5;
            cat уменьшить на 1.6;
            paper уменьшить на 7639.

            Выведите в консоль новые значения переменных.
         */

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

    }
}