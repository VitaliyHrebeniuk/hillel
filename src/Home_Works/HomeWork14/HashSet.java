package Home_Works.HomeWork14;

import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {
        //1
        java.util.HashSet<String> hashSet = new java.util.HashSet<String>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        System.out.println(hashSet);

        //2
        Iterator<String> i = hashSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
