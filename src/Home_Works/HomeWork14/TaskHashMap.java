package Home_Works.HomeWork14;

import java.util.*;
import java.util.Iterator;

public class TaskHashMap {
    public static void main(String[] args) {
        //1
        HashSet<String> golova = new HashSet<String>();
        golova.add("1");
        golova.add("2");
        golova.add("3");
        System.out.println(golova);

        //2
        Iterator<String> i = golova.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
