package contains;

public class Wheel {
    public String brand;
    public String color;
    public int size;


    public Wheel(){ }
    public Wheel(String brand,String color,int size){
        this.brand = brand;
        this.color= color;
        this.size = size;

    }


    public void turn() {
        System.out.println("车子转起来了");
    }
}