import java.util.Scanner;
public class HelloMyName {
    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        String name;//test

        System.out.println("Enter your user name");
        name=sc.next();
        String password;
        System.out.println("enter your password");
        password=sc.next();
        System.out.println("Hello "+name+" , Welcome to CSC 200 class! and your password is "+password);
        sc.close();
    }
}
