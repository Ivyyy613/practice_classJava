package practise22;

public class Vendingmachine {
    //初始值为0，如果不赋值
    int price;
    int balance;
    int total;

    //构造函数
    //类里面的每个方法加构造函数同称为成员函数
    Vendingmachine()//构造函数：如果有一个成员函数名字和类相同，、
    //则在创建这个类的每个对象会自动调用函数
    {
        total = 11;
    }
    //函数重载： 一个类有多个构造函数，只要他们参数不一样
    //创建对象时，得出不同参数时，就会自动调用不同的构造函数
    //一个类里面同名但是参数不一样的函数构成了重载关系
    Vendingmachine(int price)
    {
        this.price = price;

    }

    void showPromt()
    {
        System.out.println("welcome");
    }

    void inserMoney(int amount)
    {
        balance = balance+amount;
    }

    void showBalance()
    {
        System.out.println(balance);
    }
    void setPrice()
            //更改原始参数
    {
        this.price = price;
        showPromt();
    }

    void getFood()
    {
        if (balance>=price)
        {
            balance-=price;
            System.out.println("here you are");
            total+=price;
        }
    }

}
