import java.util.Set;
import java.util.TreeSet;

public class setprac {
    public void getSetItems(){
       Set set=new TreeSet();
        set.add("S");
        set.add("E");
        set.add("A");
        System.out.println(set);
        getForEach(set);


    }
    public void getForEach(Set set){
        for (Object s:set)
            System.out.println(s);
    }
}
