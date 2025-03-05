package SDET_Strings;
// we are finding the largest string lexographically!

public class Largest_String {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","banana"};

        String largest= fruits[0];
        for (String fruit : fruits) {
            if (largest.compareTo(fruit) < 0) {
                largest = fruit;
            }
        }
        System.out.println(largest);
    }
}
