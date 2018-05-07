import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class linklistSecBprac {

    public void getListItems(){
        LinkedList linkedList=new LinkedList();
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("B");
        linkedList.add("A");

        System.out.println(linkedList);
        getIteratedItems(linkedList);

    }
    public void getIteratedItems(LinkedList linkedList){
        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}


