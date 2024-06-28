package Lesson_2;

public class Inch {
    public static void main(String[] args) {
        double numberInInches = 20;
        System.out.println("Сантиметів становить: " + convertToCentimeters(numberInInches));
    }

    public static double convertToCentimeters(double valueInInches) {
        return valueInInches * 2.54;
    }

}