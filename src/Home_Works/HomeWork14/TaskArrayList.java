package Home_Works.HomeWork14;

import java.util.*;

public class TaskArrayList {
    public static void main(String[] args) {

        //1
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        System.out.println(list);

        //2
        for (String i : list){
            System.out.println(i);
        }

        //3
        list.add(0,"Black");
        System.out.println(list);

        //4
        String a = list.get(2);
        System.out.println(a);

        //5
        list.set(0,"Pink");
        System.out.println(list);

        //6
        list.remove(2);
        System.out.println(list);

        //7
        if(list.contains("Pink")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        //8
        Collections.sort(list);
        System.out.println(list);

        //9
        List<String> list2 = new java.util.ArrayList<String>();
        list2.add("golova");
        list2.add("uho");
        Collections.copy(list, list2);
        System.out.println(list);

        //10
        Collections.shuffle(list);
        System.out.println(list);

        //11
        Collections.reverse(list);
        System.out.println(list);

        //12
        List<String> second_list = list.subList(0,1);
        System.out.println(second_list);

        //13
        List<String> list3 = new java.util.ArrayList<String>();
        for (String e : list)
            list3.add(list2.contains(e) ? "Yes" : "No");
        System.out.println(list3);

        //14
        Collections.swap(list, 0,1);
        System.out.println(list);

        //15
        List<String> all_list = new java.util.ArrayList<String>();
        all_list.addAll(list);
        all_list.addAll(list2);
        System.out.println(all_list);

        //16
        List<String> clone_list = (List<String>) list.clone();
        System.out.println(clone_list);

        //17
        list.removeAll(list);
        System.out.println(list);

        //18
        System.out.println(list.isEmpty());

        //19
        list.add("Black");
        list.trimToSize();
        System.out.println(list);

        //20
        list.ensureCapacity(3);
        System.out.println(list);

        //21
        list.set(0,"golova");
        System.out.println(list);

        //22
        list.add("a");
        list.add("b");
        list.add("c");
        int size = list.size();
        for(int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }




    }
}
