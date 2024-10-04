import java.util.Scanner;

public class Main {
    int a=17;;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a =  sc.nextLong() ;
        long count =0 ;
           long num  =(long) 9*(long)Math.pow(10,a-1);


        if(a == 1){
            System.out.println(5);
        }
        else{
            System.out.println(num / 2);
        }
    }
}