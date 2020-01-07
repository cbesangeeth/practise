package sutherland;


import java.util.*;

public class ListProg {

    public static void main(String args[]) {

        List<String> myList = new ArrayList<String>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(" " + value);
            if (value.equals("2"))
                myList.remove(value);
        }
    }
}