package practise22;

import java.util.ArrayList;
import java.util.List;
//array数组是有固定size不可以更改[],arraylist是可以更改size的可以随意添加和删除
//for each循环是在数组发生,array或arraylist.
//list是abstract， list有两个实现类，arraylist是其中之一
//array大小是固定的，arraylist的大小是动态变化的。arraylist提供了更多的方法和特性，比如添加全部addAll(),删除全部removeAll(),返回迭代器iterator()等等。
//

class Value{
    private int i;
    public void set(int i)
    {
        this.i = i;
    }
    public int get()
    {
        return i;
    }


}
public class NoteBook {
    //容器，定义时要给出容器类型和元素类型
    private ArrayList<String> notes = new ArrayList<String>();
    public void add(String s)
    {
        notes.add(s);
        notes.size();
    }

    public  void addLocation(String s,int location)
    {
        notes.add(location,s);
    }
    public int getSize()
    {

        return notes.size();
    }

    public String getNotes(int index){
        return notes.get(index);
    }

    public static void main(String[] args){
//        NoteBook nb = new NoteBook();
//        nb.add("yes");
//        nb.add("no");
//        nb.addLocation("if",2);
//        for(int i=0;i<nb.getSize();i++)
//        {
//            System.out.println(nb.getNotes(i));
//        }
//        //数组
//        String[] a = new String[2];
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=nb.getNotes(i);
//
//        }
//        for (String s:a)
//        {
//            System.out.println(s);
//        }
    //notes,toArray(a)
//        for (String s:nb)
//        {
//            System.out.println(s);
//        }
        Value[] a = new Value[10];
        for( int i=0; i<a.length;i++)
        {
            a[i]= new Value();
            a[i].set(i);

        }
        for (Value x:a)
        {
            System.out.println(x.get());
            x.set(0);
        }
        ArrayList<String> lst1= new ArrayList();
        lst1.add("hdh");
        lst1.add("ss");
        for (String s:lst1)
        {
            System.out.println(s);
        }
    }



}
