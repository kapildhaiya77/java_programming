/*import java.util.*;
public class priorityqueue {
    public static void main(String args[]){
        Queue <Integer> queue= new PriorityQueue<>();
        queue.offer(99);
        queue.offer(50);
        queue.offer(77);
        queue.offer(91);
        System.out.println(queue);

        System.out.println( queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);



       


    }
}*/
import java.util.*;
public class priorityqueue {
    public static void main(String args[]){
        Queue <Integer> queue= new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(99);
        queue.offer(50);
        queue.offer(77);
        queue.offer(91);
        System.out.println(queue);

        System.out.println( queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);



       


    }
}

