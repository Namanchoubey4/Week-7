import java.util.*;
public class Main{
    public static void main(String[] args){

        //Stack (LIFO)
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Grapes");
        stack.push("Cherry");
        stack.push("Mango");
        System.out.println("Stack (LIFO) :"+stack);
        System.out.println("Top of the stack : "+stack.peek());
        System.out.println("Popped element : "+stack.pop());
        stack.pop();
        System.out.println("Stack after pop : "+stack);
        System.out.println();

        //Queue (FIFO)
        Queue<String> queue = new LinkedList<>();
        queue.offer("Naman");
        queue.offer("Raj");
        queue.offer("Aman");
        queue.offer("Harsh");
        System.out.println("Queue (FIFO) : "+queue);
        System.out.println("Front of Queue : "+queue.peek());
        queue.poll();
        System.out.println("Queue after poll : "+queue);
        System.out.println();

        //ArrayList (Dyanamic Array)
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("ArrayList : "+list);
        list.remove("Java");
        System.out.println("ArrayList after remove : "+list);
        System.out.println();

        //Set (Unique elements)
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Elements in HashSet(No duplicates) : "+set);
        System.out.println("HashSet contains 20? : "+set.contains(20));
        System.out.println();

        //HashMap (Key-Value Pairs)
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Maths",95);
        map.put("Science",85);
        map.put("English",98);
        map.put("Hindi",99);
        map.put("PE",100);
        System.out.println("HashMap (Subject -> Marks) : "+map);
        System.out.println("Marks in Subject Science : "+map.get("Science"));
        map.remove("English");
        System.out.println("HashMap after removing English : "+map);
    }
}