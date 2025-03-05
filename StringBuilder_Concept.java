package SDET_Strings;
// string builder is a class of java which is used to create mutable string in not synchronized way .


public class StringBuilder_Concept {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        StringBuffer sbf = new StringBuffer("hey");// string buffer creation.
        sb.append(" "+"java");// append function.
        System.out.println(sb);

        sb.insert(1,"vikash");// insert at given index value.
        System.out.println(sb);

        sb.replace(0,3,"vikash");
        System.out.println(sb);// it replace the string from start to end index value given by you.

        sb.deleteCharAt(0);// it will delete the character present at the index value.
        System.out.println(sb);


        System.out.println(sbf.append("boy"));

    }
}
