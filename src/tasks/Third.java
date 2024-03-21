package tasks;

import java.util.Scanner;

public class Third {
    int rows;
    int columns;
    private final int[][] matrix;


    public Third() {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть кількість рядків матриці: ");
        waitNextInt(scanner);
        rows = scanner.nextInt();// Зчитування кількості рядків введених користувачем

        System.out.print("Введіть кількість стовпців матриці: ");
        waitNextInt(scanner);
        columns = scanner.nextInt();// Зчитування кількості стовпців введених користувачем

        matrix = new int[rows][columns];// Створення двовимірного масиву

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++)// Цикл для послідовного заповнення елементів матриці
        {
            for (int j = 0; j < columns; j++) {
                System.out.print("Елемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                waitNextInt(scanner);
                matrix[i][j] = scanner.nextInt();// Зчитування введених значень користувачем
            }
        }
    }

    private void waitNextInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("спробуй ще");
            System.out.print("Введіть розмірність масиву: ");
        }
    }

    private void processMatrix() {
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
            } else// Якщо всі елементи невід'ємні, присвоюємо 1
            {
                for (int i = 0; i < rows; i++)// Цикл для перебору елементів поточного стовпця
                {
                    matrix[i][j] = 1;// Присвоювання значення один елементу
                }
            }
        }
    }

    private void displayMatrix() {
        System.out.println("Результат:");
        for (int i = 0; i < rows; i++)// Цикл для виведення отриманної матриці
        {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void RunTask() {
        processMatrix();
        displayMatrix();
    }
}
