package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        System.out.println(str.replace(str.substring(1,0),"o"));

       // str=str.replace("Bugun","yarin");
       // str=str.replace("ogrendik","ogrenecegiz");
        //System.out.println(str);

       // str.replace(" ne cok","ne az");


    }
}
