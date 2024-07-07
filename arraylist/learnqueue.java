import java.util.*;
public class learnqueue{
    public static void main(String args[]){
        Queue <Integer> queue= new LinkedList<>();
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