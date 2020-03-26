package rely;

public class Test {
    public static void main(String[] args){
        //创建农夫
        Farmer farmer = new Farmer();
        //农夫做一件事——》养猪
        Pig pig = farmer.feedPig(5);
        //创建屠夫
        Butcher butcher = new Butcher();
        butcher.killPig(pig);
    }
}
