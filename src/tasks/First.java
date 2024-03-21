package tasks;

import java.util.Scanner;

public class First {
    private int length;
    private int[] array;

    public First() {
        Scanner scanner = new Scanner(System.in);  // Об'єкт для зчитування вводу користувача


        System.out.print("Введіть розмірність масиву: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("спробуй ще");
            System.out.print("Введіть розмірність масиву: ");
        }
        length = scanner.nextInt();  // Зчитування введеної розмірності масиву

        array = new int[length];  // Створєння одновимірного масиву

        for (int i = 0; i < length; i++)  // Цикл для заповнення значеннями масиву користувачем
        {
            System.out.print("Введіть значення" + (i + 1) + "-го елемента:");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("спробуй ще");
                System.out.print("Введіть розмірність масиву: ");
            }
            array[i] = scanner.nextInt();
        }
    }

    private void printEvenNumbers() {
        for (int i = 0; i < length; i++)// Цикл для перебирання всіх елементів у порядку зростання індексів
        {
            if (array[i] != 0 && array[i] % 2 == 0)// Перевірка чи елемент не дорівнює нулю та чи є воно парним
            {
                System.out.println("Парне число:" + array[i] + "(індекс" + (i + 1) + ")");// Виведення парних чисел
            }
        }
    }

    private void printOddNumbers() {
        for (int i = length - 1; i >= 0; i--)// Цикл для перебиранняя непарних чисел, окрів нулю, в порядку зменьшення їх індексу
        {
            if (array[i] != 0 && array[i] % 2 != 0)// Перевірка чи не дорівнює елемент нулю та чи є воно непарним
            {
                System.out.println("Непарне число:" + array[i] + "(індекс" + (i + 1) + ")");// Виведення непарних чисел
            }
        }
    }

    public void runTask() {
        System.out.println(" ");// Порожній рядок для розділення парних та непарних чисел
        printEvenNumbers();
        System.out.println(" ");// Порожній рядок для розділення парних та непарних чисел
        printOddNumbers();
    }
}
