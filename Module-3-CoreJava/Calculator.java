import java.util.*;

public class Calculator {
    public static void main(String args[]){
        int n1,n2,op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        n1=sc.nextInt();
        System.out.println("Enter Second Number:");
        n2=sc.nextInt();
        System.out.println("Enter Operator : ");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplaction\n4.Division");
        op=sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Addition Result : "+(n1+n2));
                break;
            case 2:
                System.out.println("Subtraction Result : "+(n1-n2));
                break;
            case 3:
                System.out.println("Multiplaction Result : "+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Division by zero is not allowed");
                }else{
                    System.out.println("Division Result : "+(n1/n2));
                }
            default:
                System.out.println("Wrong Input");
        }
        sc.close();
    }
}
