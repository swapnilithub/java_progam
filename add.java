import java.util.Scanner;
public class add {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int n =sc.nextInt();
        System.out.println("Enter 2nd value:");
        int b = sc.nextInt();
        int add=n+b;
        System.out.println(add);
    }
}
