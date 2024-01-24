package practise22;

//在代码中，硬编码的东西越少越好，那种条件越多返回值越多会非常丑，所以
//选好接口很重要，接口就是容器
//尽可能的白程序的硬编码解成框架加数据的结构
//容器可以直接输出
//e.g System.out.println(hasmap,set,arraylist,array的对象名字
//这些容器也可以to.string, 但是类需要建立一个方法， return i
//for..each 可以用在各种容器里，（set,arraylisy,array) for(Integer k: Hashmap.keyset)

import java.util.ArrayList;
//我们创造出一个新的类，就是创造出一个新的类型，成为一个type,所以在
//创建数组或者arraylist 声明类型时就可以用ArrayList<Item> items = new ArrayList<Item>();
//Item[] ie =new Item[10];
//也可以说成cd是item的子类型
//子类的对象可以赋给父类的对象
//vehicle v1 = new vehicle(); vehicle v2 = new car(); vehicle3 = new biycle();
public class Database {
    ArrayList<Item> items = new ArrayList<Item>();
    public void add(Item item)
    {
        items.add(item);
    }

    public void list()
    {//在用item.print的时候，item这个print函数并没有值，因为是多态的
        //当item是cd，调用cd里的print
        //override覆盖： 子类和父类中存在名称相同和参数表完全相同的函数时
        //通过父类的变量调用存在覆盖关系的函数时，会调用变量当时所管理的
        //对象所属的类的函数，当时是cd (CD类）
        for(Item item:items)
        {
            item.print();
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "items=" + items +
                '}';
    }

    public static void main(String[] args)
    {
        Database db = new Database();
        db.add(new CD("abc","dd",4,60,false,"ddd"));
        db.list();
        //CD cd = new CD(...)
        //database.ad(cd);//因为item函数认为CD就是item类的一种
        //任何Item及其子类都可以由Item这个变量管理

    }


}
//java中的对象变量是多态的，他能保存不止一种类型的对象，
//他可以保存声明类型的对象或者声明类型的子类的对象
//当把子类的对象赋给父类的变量时，就发生了向上造型
//Item item: Item是声明类型是静态的， item是动态的，他可能叫CD,DVD，
//把一个类型的对象赋给另外类型的变量就是向上造型，变量指向另外一个对象
//静态类型的对象去管理了动态类型和静态类型不符的那个对象 叫做造型

//向上造型：拿一个子类的对象，当作父类的对象来用
//item=cd: 可以理解为这个item被理解为cd,cd是CD这个类型的对象，
//item属于这个类型
//CD cc = (CD)item: 这个是可行的是因为item在item=cd这一步被确定为属于CD
//这一类，此时（CD）item是合理的

//object 所有的类都是继承object
//toString(), equals()
