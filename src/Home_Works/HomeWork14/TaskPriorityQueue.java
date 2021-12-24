package Home_Works.HomeWork14;

import java.util.PriorityQueue;

public class TaskPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("1");
        priorityQueue.add("2");
        priorityQueue.add("3");
        System.out.println(priorityQueue);

        //2
        for(String i : priorityQueue){
            System.out.println(i);
        }
    }
}
