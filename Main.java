import java.util.*;
public class Main{
    public static String check(int n){
        if(n>0){
            return "Positive";
        }
        else if(n<0){
            return "Negative";
        }
        return "Zero";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String c=check(n);
        System.out.println(c);
        switch (n){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
            default:{
                System.out.println("No days Exceeded");
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        int m=n;
        System.out.println();
        while(m>0){
            System.out.print(m+" ");
            m--;
        }
        System.out.println();
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k<=3);
    }
}