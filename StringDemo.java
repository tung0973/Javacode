public class StringDemo {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bill Gate");
        System.out.println(stringBuilder);
        
        String str ="Microsoft";
        stringBuilder.append(str);
        System.out.println(stringBuilder);

        stringBuilder.insert(9, "tung");
        System.out.println(stringBuilder);
        

    }
}
