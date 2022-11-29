package Java_Homework.Homework2;


// Напишите программу, чтобы проверить, содержит ли данная строка только цифры.
// (с возможностью ввода или нет решайте сами)

public class stringDigits {
    public static void main(String[] args) {
        String digitString1 ="12345678912345678";
        String digitString2 ="12g454g48544545454";
        System.out.println("Первая строка:" + " " + digitString1);
        boolean result1 = testDigits(digitString1);
        System.out.println(result1);
        System.out.println("Вторая строка:" + " " + digitString2);
        boolean result2 = testDigits(digitString2);
        System.out.println(result2);
    }
    public static boolean testDigits(String digitString) {
        for (int i = 0; i < digitString.length(); i++) {
            if (!Character.isDigit(digitString.charAt(i))) {
                return false;
            }
        }
        return true;
    }
 }

 

