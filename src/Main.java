import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть розмірність масиву: ");
        int lenght = scanner.nextInt();// Зчитування введеної розмірності масиву

        int[] array = new int[lenght];// Створєння одновимірного масиву

        for (int i = 0; i < lenght; i++)// Цикл для заповнення значеннями масиву користувачем
        {
            System.out.print("Введіть значення" + (i + 1) + "-го елемента:");
            array[i] = scanner.nextInt();
        }

        System.out.println(" ");// Порожній рядок для розділення парних та непарних чисел

        for (int i = 0; i < lenght; i++)// Цикл для перебирання всіх елементів у порядку зростання індексів
        {
            if (array[i] !=0 && array[i] % 2 == 0)// Перевірка чи елемент не дорівнює нулю та чи є воно парним
            {
                System.out.println("Парне число:" + array[i] + "(індекс" + (i + 1) +")");// Виведення парних чисел
            }
        }

        System.out.println(" ");// Порожній рядок для розділення парних та непарних чисел

        for (int i = lenght - 1; i >= 0; i--)// Цикл для перебиранняя непарних чисел, окрів нулю, в порядку зменьшення їх індексу
        {
            if (array[i] !=0 && array[i] % 2 != 0)// Перевірка чи не дорівнює елемент нулю та чи є воно непарним
            {
                System.out.println("Непарне число:" + array[i] + "(індекс" + (i + 1) +")");// Виведення непарних чисел
            }
        }
    }
}
