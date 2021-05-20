public class Client {
    public static void main(String[] args){
        Rectangle reca ;
        
        reca= new Rectangle(7,3);

        reca.display();
        System.out.println("Dien Tich La  "+reca.getA());
        System.out.println("Chu Vi La  "+reca.getP());
    }
}