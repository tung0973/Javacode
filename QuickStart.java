import java.util.Scanner;

public class QuickStart {

   

    public static void main(String[] args){
        String str ="hello java core application";//6 byte vi can byte sau cung de ket thuc chuoi 
        System.out.println("chuoi vua nhap"+str);
        
        String urName;
        Scanner banPhim= new Scanner(System.in);
        System.out.println("Nhap ten cua ban ");
        urName = banPhim.nextLine();
        System.out.print("Ten ban la: "+urName);
    }
}
