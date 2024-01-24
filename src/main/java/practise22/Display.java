package practise22;

public class Display {
    private int value=0;
    private int limit=0;
    //因为limit 的数值可能不同，所以要建一个构造函数在每一次建立
    //一个对象的时候可以对他进行更改
    Display(int limit)
    {
        this.limit = limit;

    }

    void setValue()
    {
        value+=1;
        if(value==limit)
        {
            value =0;
        }
    }

    int getValue()
    {
        return value;
    }



}
