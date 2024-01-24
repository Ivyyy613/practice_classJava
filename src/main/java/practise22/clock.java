package practise22;
//上面表达的时所编译单元的包名称，如果成员函数public那他可以
//跨包进行访问如果时friendly,那就不可以访问只能在此编译单元进行访问
//如果要挎包，就要进行import display(包的名字）.Display(类的名字）。
//static函数： 通过一个对象修改static变量，其他的对象的变量也会更改。
//static成员变量甚至可以直接Dispaly.变量更改，static是类变量，可以直接受类管理
//static函数可以直接调用static函数
class A{
    //在一个编译单元里（点JAVA文件）只能有一个public class,其他的
    //class不可公共，只能在这个编译单元使用。
    public static int fivw;

}

public class clock {
    //private是针对类不是对象，priate是指除了这个类之外的都不能访问
    private Display hours = new Display(24);
    private Display mins = new Display(60);
    public void start()
            //public那都可以访问
            //如果是不带任何void start在同一个目录也可以访问==friendly
    {
        while(true) {

//%XYd：十进制数，输出 Y 位，不足 Y 位就补 X 。如果本身大于 Y 位，正常输出。
            mins.setValue();
            if (mins.getValue() == 0) {
                hours.setValue();
            }
            System.out.printf("%02d:%02d\n", hours.getValue(), mins.getValue());
        }
    }
}
