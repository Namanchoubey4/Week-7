import java.util.*;

/*public class Main{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Jhon");
        names.add("Elice");
        names.add("Rojer");
        names.add("Rox");

        System.out.println("Names: "+names);

        for(int i=names.size()-1;i>=0;i--){
            System.out.println(names.get(i));
        }
    }
}*/
/*public class Main{
    public static void main(String[] args){
        Set<String> colors = new HashSet<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");
        colors.add("Orange");

        for(String color : colors){
            System.out.println(color);
        }
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        Map<Integer, String> ages = new TreeMap<>();

        ages.put(22, "Naman");
        ages.put(23, "Joe");
        ages.put(21, "Kal");

        for (Integer key : ages.keySet()) {
            System.out.println("Key: " + key + ", Value: " + ages.get(key));
        }
        }
    }
*/
public class Main{
    public static void main(String[] args){
        List<String> words = Arrays.asList("Apple","banana","Apple","Orange","banana","Apple");
        Map<String,Integer> freqMap = new HashMap<>();

        for(String word : words){
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}