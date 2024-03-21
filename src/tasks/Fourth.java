package tasks;

import java.util.Scanner;

public class Fourth
{
    int max, min;

    private final int length;
    private final int[][] matrix;


    public Fourth() {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть розмірність квадратної матриці: ");
        waitNextInt(scanner);
        length = scanner.nextInt();// Зчитування кількості рядків введених користувачем

        matrix = new int[length][length];// Створення двовимірного масиву

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < length; i++)// Цикл для послідовного заповнення елементів матриці
        {
            for (int j = 0; j < length; j++) {
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

    private void calculateMaxMin(){
        max = Integer.MIN_VALUE;//Змінна для зберігання максимального значення серед елементів нижче побічної діагоналі
        min = Integer.MAX_VALUE;//Змінна для зберігання мінімального значення серед елементів вище головної діагоналі

        for (int i = 0; i < length; i++)// Цикл для перебору рядків матриці
        {
            for (int j = 0; j < length; j++)// Внутрішній цикл для перебору стовпців матриці
            {
                if (i + j > length - 1 && matrix[i][j] > max)// Якщо поточний елемент знаходиться нижче побічної діагоналі і більший за максимальний
                {
                    max = matrix[i][j];// Присвоєння максимального значення
                }
                if (i < j && matrix[i][j] < min)// Якщо поточний елемент знаходиться вище головної діагоналі і менший за мінімальний
                {
                    min = matrix[i][j];// Оновлення мінімального значення
                }
            }
        }

    }

    private void displayResult(){
        System.out.println("Результат:");
        for (int i = 0; i < length  ; i++)// Цикл для виведення отриманної матриці
        {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Максимальний серед елементів нижче побічної діагоналі: " + max);
        System.out.println("Мінімальний серед елементів вище головної діагоналі: " + min);
    }

    public void runTask(){
        calculateMaxMin();
        displayResult();
    }
}
