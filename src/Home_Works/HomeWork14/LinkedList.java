package Home_Works.HomeWork14;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList<S> {
    public static void main(String[] args) {
        //1
        java.util.LinkedList<String> linked_list = new java.util.LinkedList<>();
        linked_list.add("a");
        linked_list.add("b");
        linked_list.add("c");
        System.out.println(linked_list);

        //2
        for(String i : linked_list){
            System.out.println(i);
        }

        //3
        Iterator a = linked_list.listIterator(0);
        while (a.hasNext()){
            System.out.println(a.next());
        }

        //4
        Iterator iterator = linked_list.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //5
        linked_list.add(1,"golova");
        System.out.println(linked_list);

        //6
        linked_list.addFirst("uho");
        linked_list.addLast("dva uha");
        System.out.println(linked_list);

        //7
        linked_list.offerFirst("blalba");
        System.out.println(linked_list);

        //8
        linked_list.offerLast("asdf");
        System.out.println(linked_list);

        //9
        java.util.LinkedList<String> linked_list2 = new java.util.LinkedList<>();
        linked_list2.add("1");
        linked_list2.add("2");
        linked_list2.add("3");
        linked_list.addAll(1, linked_list2);
        System.out.println(linked_list);

        //10
        System.out.println("First: " + linked_list.getFirst() + "; Last: " + linked_list.getLast());

        //11
        for(int i = 0;i < linked_list.size();i++){
            System.out.println("Index: " + i + " " + linked_list.get(i));
        }

        //12
        System.out.println(linked_list.remove(1));

        //13
        linked_list.removeFirst();
        System.out.println(linked_list);
        linked_list.removeLast();
        System.out.println(linked_list);

        //14
        linked_list.clear();
        System.out.println(linked_list);

        //15
        linked_list.add("1");
        linked_list.add("2");
        linked_list.add("3");
        Collections.swap(linked_list,0,2);
        System.out.println(linked_list);

        //16
        Collections.shuffle(linked_list);
        System.out.println(linked_list);

        //17
        java.util.LinkedList<String> linked_list3 = new java.util.LinkedList<>();
        linked_list3.addAll(linked_list);
        linked_list3.addAll(linked_list2);
        System.out.println(linked_list3);

        //18
        linked_list3 = (java.util.LinkedList<String>)linked_list.clone();
        System.out.println(linked_list3);

        //19
        linked_list.pop();
        System.out.println(linked_list);

        //20
        String peek = linked_list.peekFirst();
        System.out.println(peek);

        //21
        String peekLast = linked_list.peekLast();
        System.out.println(peekLast);

        //22
        if (linked_list.contains("1")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        //23
        List<String> arrayList = new ArrayList<String>(linked_list);
        System.out.println(arrayList);

        //24
        java.util.LinkedList<String> linkedList4 = new java.util.LinkedList<String>();
        for (String i : linked_list)
            linkedList4.add(linked_list2.contains(i) ? "Yes" : "No");
        System.out.println(linkedList4);

        //25
        linked_list.removeAll(linked_list);
        System.out.println(linked_list);

        //26
        linked_list2.set(1,"golova");
        System.out.println(linked_list2);
    }
}
