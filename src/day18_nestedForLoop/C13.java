package day18_nestedForLoop;

public class C13 {
    public static void main(String[] args) {

        for (char i ='A' ; i <='Z' ; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }


    }
}
