import java.util.*;

public class Main{
    public static void main(String[] args){
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cow");
        animals.add("Cat");
        animals.addFirst("Tiger");
        animals.add("Lion");
        animals.add("Elephant");
        System.out.println("Animals : "+animals);

        System.out.println("First Animal : "+animals.getFirst());
        System.out.println("Last Animal : "+animals.getLast());

        animals.remove("Cat");
        System.out.println("After removing Cat :"+animals);
    }
}