package Java_Homework.Homework3;

// - Создать массив на 20 чисел.
// - Ввести в него значения с клавиатуры.
// - Создать два массива на 10 чисел каждый.
// - Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
// - Вывести второй отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наибольших чисел)
// - Вывести первый отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наименьших чисел)
// - * Объяснение задачи. В начале у нас 3 массива,
//  а в резульате будет 2 массива, где один массив должен содиражть наибольшие числа, 
// а другой наименьшие. Нужно решить где и сколько лучше всего сортировать массивы.
//  К примеру (как вариант решения и доп объяснения, мы можем сложить все массивы в один, отсортировать,
//  и создать 2 массива разделив массив из 40 элементов на 2 массива)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class arraysMaxMin {
    public static void main(String[] args) throws Exception {
        int [] bigArray = new int [20];
        int [] smallArray1 = new int [10];
        int [] smallArray2 = new int [10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i < bigArray.length; i++)
        {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        smallArray1 = Arrays.copyOfRange(bigArray, 0, 9);
        smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);

        for (int i=0; i < smallArray2.length; i++)
        {
            System.out.println(smallArray2[i]);
        }
    }
}