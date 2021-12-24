package Home_Works.HomeWork14;

import java.util.TreeSet;

public class TaskTreeSet {
    public static void main(String[] args) {
        //1
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        System.out.println(treeSet);

        //2
        for(String i : treeSet){
            System.out.println(i);
            //
        }
    }
}
