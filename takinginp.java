import java.util.Scanner;
public class takinginp implements Enter {
    public static void main(String[] args){
        System.out.println("Enter val:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        System.out.println(name);
    }
}
