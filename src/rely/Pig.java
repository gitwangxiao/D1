package rely;

public class Pig {
    private String name;
    private int  weight = 20;

    //构造方法
    public Pig(){}
    public Pig(String name){
        this.name = name;
    }

    //方法
    //描述一个方法，表示小猪被杀
    public void beKilled() {
        System.out.println(this.name + "被杀了，好惨呀");
    }
        //描述一个方法  让猪长肉
        //每一个月涨到前一个月的两倍
        //返回值 表示长大后猪 的体重
    public void growUp(int month){
            for(int i = 1;i<=month;i++){
                this.weight*=2;
            }

        }
     public String getName(){
        return this.name;
     }
    public int getWeight(){
        return this.weight;
    }

}
