package practise22;

public class Item {
    private String comment;
    private  String title;

    private int numofTracks;
    private int playingTime;
    private boolean gotIt;



    public Item(String title, int numofTracks, int playingTime, boolean gotIt, String comment) {
        this.title = title;

        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }
    public void print()
    {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Item{" +
                "comment='" + comment + '\'' +
                ", title='" + title + '\'' +
                ", numofTracks=" + numofTracks +
                ", playingTime=" + playingTime +
                ", gotIt=" + gotIt +
                '}';
    }
}

