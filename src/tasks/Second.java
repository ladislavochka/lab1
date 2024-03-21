package tasks;

import java.util.Scanner;

public class Second {
    private int length;
    private int[] array;

    public Second() {
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

    public void runTask() {
        int wrongIndex = -1;// Змінна для індексу першого елемента, який порушив послідовність

        for (int i = 0; i < length - 1; i++)//  Цикл для перебирання елементів масиву
        {
            if ((array[i] >= 0 && array[i + 1] >= 0) || (array[i] < 0 && array[i + 1] < 0))// Умова для знаходження порушного елемента, якщо наступний елемент має той самий знак, що і поточний
            {
                wrongIndex = i + 1;// Збереження індексу
                break;//Вихід з циклу
            }
        }

        if (wrongIndex == -1) // Якщо цикл не порушився , що виводимо нуль
        {
            System.out.println("0");
        } else // В іншому випадку виводимо значення порушного елемента та його індекс
        {
            System.out.println("Перший порушений елемент: " + array[wrongIndex] + ", порядковий номер: " + (wrongIndex + 1));
        }
    }
}
