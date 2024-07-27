import java.io.*;

public class FileMain {
    public static void main(String[] args) {
        try {
            File file = new File("Numbers.txt");
            FileReader fileReader = new FileReader(String.valueOf(file));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("no found");

        }
    }
}


//Создать 2 новых вида исключений
//Один "проверяемый"
//Один "непроверяемый"

//Решить две задачи:

//Написать метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа.
//Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.

//Написать метод. В него вводится 2 числа. Метод ничего не возвращает, но если второе число больше первого,
//то бросьте проверяемое исключение.

//Если это необходимо - используйте try-catch

//** числа для метода считать из файла. оформит его чтение правильным образом