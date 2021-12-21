package Home_Works.HomeWork14;

public class TreeSet {
    public static void main(String[] args) {
        //1
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<String>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        System.out.println(treeSet);

        //2
        for(String i : treeSet){
            System.out.println(i);
        }
    }
}
