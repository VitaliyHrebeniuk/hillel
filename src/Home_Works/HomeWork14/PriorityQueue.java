package Home_Works.HomeWork14;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<String> priorityQueue = new java.util.PriorityQueue<String>();
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
