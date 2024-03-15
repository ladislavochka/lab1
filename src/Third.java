import java.util.Scanner;

public class Third
{
    public static void task3()
    {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть кількість рядків матриці: ");
        int rows = scanner.nextInt();// Зчитування кількості рядків введених користувачем

        System.out.print("Введіть кількість стовпців матриці: ");
        int columns = scanner.nextInt();// Зчитування кількості стовпців введених користувачем

        int[][] matrix = new int[rows][columns];// Створення двовимірного масиву

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++)// Цикл для послідовного заповнення елементів матриці
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print("Елемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();// Зчитування введених значень користувачем
            }
        }

        for (int j = 0; j < columns; j++)// Цикл для передору стовпців матриці
        {
            boolean allNegative = true;
            for (int i = 0; i < rows; i++)// Внутрішній цикл для перебору рядків в кожному стовпці
            {
                if (matrix[i][j] >= 0)// Перевірка на всі негативні значення елементів у поточному стовпці
                {
                    allNegative = false;
                    break;
                }
            }
            if (allNegative)// Якщо всі елементи від'ємні, присвоюємо 0
            {
                for (int i = 0; i < rows; i++)// Цикл для перебору елементів поточного стовпця
                {
                    matrix[i][j] = 0;// Присвоювання нульового значення елементу
                }
            }
            else// Якщо всі елементи невід'ємні, присвоюємо 1
            {
                for (int i = 0; i < rows; i++)// Цикл для перебору елементів поточного стовпця
                {
                    matrix[i][j] = 1;// Присвоювання значення один елементу
                }
            }
        }

        System.out.println("Результат:");
        for (int i = 0; i < rows; i++)// Цикл для виведення отриманної матриці
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
