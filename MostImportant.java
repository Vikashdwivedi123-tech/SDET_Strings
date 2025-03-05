package SDET_Strings;
// String is immutable and it is for security region. means the object can't modify.

public class MostImportant {
    public static void main(String[] args) {
        String name1="vikash";
        String name2 = "vikash";
        System.out.println(name1==name2);//'==' operator check the reference variable is pointing to the same object or not!.
        System.out.println(name1.equals(name2));//here .equal method check the value only.

        // ==
        // create different object same value.
        String a = new String("dwivedi");
        String b = new String("dwivedi");
        System.out.println(a==b);// it should be give false
        System.out.println(a.equals(b));// it will check value only and return true.

    }
}
