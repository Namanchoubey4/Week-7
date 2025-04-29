import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        // In Set or HashSet , they do not follow insertion order.
        Set<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("White");
        colors.add("Orange");
        //colors.add("Black");
        System.out.println("Colors : " + colors);

        System.out.println("Colors contains Green ? : " + colors.contains("Green"));
        colors.remove("Blue");
        System.out.println("After removing blue : " + colors);

        Set<String> name = new HashSet<>();
        name.add("Naman");
        name.add("Raj");
        name.add("Ayush");
        System.out.println("Set of names : "+name);
        System.out.println("Contains Naman? : "+name.contains("Naman"));

        Set<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");


        System.out.println("Fruits : "+fruits);
        System.out.println("Contains Apple? :"+fruits.contains("Apple"));
        fruits.add("Papaya");
        fruits.remove("Apple");
        System.out.println("After removing Apple : "+fruits);

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers : "+numbers);
        System.out.println("First number : "+((TreeSet<Integer>)numbers).first());
        System.out.println("Last number : "+((TreeSet<Integer>)numbers).last());

        Queue<Integer> num = new PriorityQueue<>();

        num.offer(10);
        num.offer(20);
        num.offer(30);

        System.out.println("Priority Queue: "+num);
        System.out.println("Peek: "+num.peek());
        num.poll();
        //System.out.println("Poll: "+num.poll());
        System.out.println("After Poll: "+num);

        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack: "+stack);
        System.out.println("Pop: "+stack.pop());
        System.out.println("After Pop: "+stack);

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");

        System.out.println("Queue: "+queue);
        System.out.println("Poll:"+queue.poll());
        System.out.println("After poll: "+queue);

        Map<String,Integer> ages = new HashMap<>();

        ages.put("Naman",22);
        ages.put("Raj",35);
        ages.put("Harsh",22);

        System.out.println("Ages: "+ages);
        System.out.println("Naman's age : "+ages.get("Naman"));
        ages.remove("Raj");
        System.out.println("After removing Raj: "+ages);

        Map<String,String> capitals = new LinkedHashMap<>();
        capitals.put("India","Delhi");
        capitals.put("MP","Bhopal");
        capitals.put("UP","Lucknow");
        capitals.put("Rajasthan","Jaipur");
        capitals.put("Haryana","Chandigarh");

        System.out.println("Capitals: "+capitals);
        capitals.put("Germany","Berlin");
        System.out.println("After adding Germany:"+capitals);

        Map<Integer,String> scores = new TreeMap<>();
        scores.put(85,"Naman");
        scores.put(68,"Rahul");
        scores.put(0,"Aman");
        scores.put(99,"Priyanshu");

        System.out.println("Scores: "+scores);
        System.out.println("Lowest Score: "+((TreeMap<Integer,String>)scores).firstEntry());
        System.out.println("Highest Score: "+((TreeMap<Integer,String>)scores).lastEntry());

        Map<String,Integer> population = new Hashtable<>();
        population.put("New York",8409000);
        population.put("Los Angeles",3898000);
        population.put("Chicago",2716000);

        System.out.println("Population : "+population);
        System.out.println("Population of Los angeles: "+population.get("India"));
        population.remove("Chicago");
        System.out.println("After removing Chicago: "+population);
    }
}