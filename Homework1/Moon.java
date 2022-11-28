package Java_Homework.Homework1;

// Сила тяжести на Луне составляет около 17% земной.
// Напишите программу, которая вычислила бы ваш вес на Луне.

public class Moon {
    public static void main(String[] args) {
        double myWeight = 56;      // Мой вес
		double moonGravity = 17;   // Сила притяжения на Луне
		double earthGravity = 100; // Сила притяжение на Земле
		double moonWeight;         // Переменная которая будет хранить в себе вес на Луне
        
        moonWeight = (moonGravity / earthGravity) * myWeight;
              
        System.out.print("Мой вес на Луне равен: " + moonWeight + " кг.");
 
    }
}
