package contains;

public class Car {
    public String brand;
    public String color;
    public String type;
    public Wheel wheel;

    //构造方法
    public Car(){
    }
    public Car(String brand,String color,String type,Wheel wheel){
        this.brand=brand;
        this.color= color;
        this.type= type;
        this.wheel= wheel;
    }
    //方法
    public void showCar(){
        System.out.println("这是一辆"+brand+"牌"+type+"型号"+color+""+"的汽车");
        System.out.println("车上搭载这"+wheel.brand+"牌的"+wheel.size+"尺寸"+wheel.color+"颜色的车轮子");
        wheel.turn();
    }
}
