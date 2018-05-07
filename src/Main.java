import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        listSecBprac listSecBprac=new listSecBprac();
        listSecBprac.getlistitems();
        linklistSecBprac linklistSecBprac=new linklistSecBprac();
        linklistSecBprac.getListItems();
        setprac setprac=new setprac();
        setprac.getSetItems();

        ArrayList<Integer> integerArrayList= listSecBprac.getInteger();
        for(Integer integer:integerArrayList)
            System.out.println(integer);
    }
}
