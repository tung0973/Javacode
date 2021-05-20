public class Rectangle{

    private int width ;
    private int height ;
    
    public Rectangle(){
        this.height =3;
        this.width =7;
    }
    public Rectangle(int width, int height){
        this.height=height;
        this.width=width;
    }

    public int getHeight(){
        return this.height;
    }
    public void setHeight(int value){
        this.height=value;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int value){
        this.width=value;
    }
    public double getA(){
        return width*height;
    }
    public double getP(){
        return 2*(width+height);
    }
    public void display(){

        for(int i=0;i<this.height;i++){
            for(int j=0;j<this.width;j++){
                System.out.print("*");
            }System.out.println();
        }
        
    }

}
