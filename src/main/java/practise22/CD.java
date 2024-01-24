package practise22;

public class CD extends Item{
    //因为要在构造器中用到所以要先初始化

    private String artlist;

    public CD(String title, String artlist, int numofTracks, int playingTime, boolean gotIt, String comment) {
        super(title,numofTracks,playingTime,gotIt,comment);
        this.artlist = artlist;

        this.comment = comment;
    }

    private String comment;

    public void print() {
        System.out.println("the ");
        super.print();//指的是调用父类的print
    }

    @Override
    public String toString() {
        return "CD{" +
                "artlist='" + artlist + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
