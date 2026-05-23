package SDET_Strings;

public class RemoveDublicates {

    static void main() {
        String str = "Programming";
        String res = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(res.indexOf(ch)!=-1){ //indexOf return index value if char exist else return -1
                continue;
            }
            res+=ch;
        }
        System.out.println(res);
    }

}
