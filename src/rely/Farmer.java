package rely;

public class Farmer {//农夫

    //农夫养猪
    //参数--几个月  返回值-->是一头猪
    public Pig feedPig(int month){
        Pig pig = new Pig("小花");
        pig.growUp(month);
        return pig;
    }
}
