import java.util.Scanner;

public class howellUni {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int tt ;
        System.out.println("Is it your first attemp ?"+"1=Yes");
        tt = sc.nextInt();
        if(tt !=1 ){
            System.out.println("Don't waste time");
        }else{
            System.out.println("Choose a subject");
            System.out.println("1.Aptitude");
            System.out.println("2.English");
            System.out.println("3.Math");
            System.out.println("4.General Knowledge");
            System.out.println("5.Exit");
            
        }
    }
    
}