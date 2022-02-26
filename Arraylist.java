import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
 
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
 
        System.out.println(al);

        al.remove(1);    //Removing element present at Specified index from ArrayList
        System.out.println(al);


        al.remove(new Integer(30));  //Removing Specified element from ArrayList using remove(Object)
        System.out.println(al);

        Iterator itr = al.iterator();   //Removing all elements from ArrayList using Iterator

        while (itr.hasNext()) {
 
            int x = (Integer)itr.next();
            itr.remove();
        }
        System.out.print(al);

    }
}
