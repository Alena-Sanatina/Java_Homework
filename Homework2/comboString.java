package Java_Homework.Homework2;

// Напишитепрограмму для объединения данной строки с самим
// собой заданное количество раз
// (количество и строку мы вводим)

public class comboString {
    public static void main(String[] args) {
        String ourStr1 = "Плюсую";
        String ourStr2 = comboStr(ourStr1, 5);
        System.out.println("Заданная строка:" + ourStr1);
        System.out.println("Получившаяся строка: " + ourStr2);
    }
    public static String comboStr(String ourStr1, int n) {
        StringBuilder x = new StringBuilder(ourStr1.length() * n);
        for (int i = 1; i <= n; i++) {
           x.append(ourStr1);
        }
        return x.toString();
    }
}