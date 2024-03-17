import java.util.Scanner;

public class Fourth
{
    public static void task4()
    {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть розмірність квадратної матриці: ");
        int Lenght = scanner.nextInt();// Зчитування введеної розмірності квадратної матриці користувачем
        int[][] matrix = new int[Lenght][Lenght];// Створення двовимірного масиву

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < Lenght; i++)// Цикл для введення значень матриці користувачем
        {
            for (int j = 0; j < Lenght; j++)
            {
                System.out.print("Елемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();// Зчитуванння введених значень користувачем
            }
        }

        int max = Integer.MIN_VALUE;//Змінна для зберігання максимального значення серед елементів нижче побічної діагоналі
        int min = Integer.MAX_VALUE;//Змінна для зберігання мінімального значення серед елементів вище головної діагоналі

        for (int i = 0; i < Lenght; i++)// Цикл для перебору рядків матриці
        {
            for (int j = 0; j < Lenght; j++)// Внутрішній цикл для перебору стовпців матриці
            {
                if (i + j > Lenght - 1 && matrix[i][j] > max)// Якщо поточний елемент знаходиться нижче побічної діагоналі і більший за максимальний
                {
                    max = matrix[i][j];// Присвоєння максимального значення
                }
                if (i < j && matrix[i][j] < min)// Якщо поточний елемент знаходиться вище головної діагоналі і менший за мінімальний
                {
                    min = matrix[i][j];// Оновлення мінімального значення
                }
            }
        }

        System.out.println("Результат:");
        for (int i = 0; i < Lenght  ; i++)// Цикл для виведення отриманної матриці
        {
            for (int j = 0; j < Lenght; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

            System.out.println("Максимальний серед елементів нижче побічної діагоналі: " + max);
            System.out.println("Мінімальний серед елементів вище головної діагоналі: " + min);

    }
}
