import java.util.Scanner;
public class Second
{
    public static void task2()
    {
        Scanner scanner = new Scanner(System.in);// Об'єкт для зчитування вводу користувача

        System.out.print("Введіть розмірність масиву: ");
        int Lenght = scanner.nextInt();// Зчитування розмірності масиву
        int[] array = new int[Lenght];// Створення масиву

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < Lenght; i++)// Цикл для заповнення користувачем масиву
        {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();// Зчитування введеного значення елемента масиву
        }

        int WrongIndex = -1;// Змінна для індексу першого елемента, який порушив послідовність

        for (int i = 0; i < Lenght - 1; i++)//  Цикл для перебирання елементів масиву
        {
            if ((array[i] >= 0 && array[i + 1] >= 0) || (array[i] < 0 && array[i + 1] < 0))// Умова для знаходження порушного елемента, якщо наступний елемент має той самий знак, що і поточний
            {
                WrongIndex = i + 1;// Збереження індексу
                break;//Вихід з циклу
            }
        }

        if (WrongIndex == -1) // Якщо цикл не порушився , що виводимо нуль
        {
            System.out.println("0");
        }
        else // В іншому випадку виводимо значення порушного елемента та його індекс
        {
            System.out.println("Перший порушений елемент: " + array[WrongIndex] + ", порядковий номер: " + (WrongIndex + 1));
        }
    }
}
