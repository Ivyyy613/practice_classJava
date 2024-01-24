package practise22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SetAndHash {
    //容器可以直接打印出值，使用system.out.println(a)就可以直接打出
    //但是在类里面就出需要使用public String toString(){return ""+i;}

    private int i;
    public void setInt(int i){this.i = i;}
    public  int get(){return  i;}
    //在类中想要直接打印出类对象的值就可以写出这样一个函数
    //这个是自动涵盖之前的tostring函数
    //不需要调用，系统会自动调用，当在使用System.out.println(hs);
    //他就和容器一样可以直接调用println.
    public String toString(){return ""+i;}
    private HashMap<Integer,String> hashmm= new HashMap<Integer,String>();
    public SetAndHash(){
        //往hashmap里放东西是put,
        hashmm.put(1,"penny");
        hashmm.put(3,"isis");
    }

    public String getName(Integer i)
    {
        if (hashmm.containsKey(i))
        {
            return hashmm.get(i);
        }
        else

            return "there is no";

    }

    public static void main(String[] args)
    {
        //set是无序的，无法使用get（index）来获得某个位置上的数
        //并且set会把每次添加的重复的元素给抹盖掉。
        HashSet<String> b = new HashSet<String>();
        b.add("aa");
        b.add("cc");
        b.add("aa");
        System.out.println(b);
        for(String i:b)
        {
            System.out.println(i);
        }
        ArrayList<String> a = new ArrayList<String >();
        a.add("dd");
        a.add("vv");
        System.out.println(a);

        //硬编码的东西越少越好
        SetAndHash hs = new SetAndHash();
        hs.setInt(10);
        System.out.println(hs);
        System.out.println(a.toString());
        //一个key 一个value
        SetAndHash haa = new SetAndHash();
        haa.getName(1);
        System.out.println(haa.getName(6));
        //hashmap里面的东西都没法直接给出个数， 因此需要.keyset().size->求个数
        //任何容器都可以直接输出
        System.out.println(haa.hashmm);
        //Hashmap进行遍历，转换成set-》.keyset()
        for (Integer k: haa.hashmm.keySet()) {
            String s = haa.getName(k);
            System.out.println(s);

        }

    }


}
