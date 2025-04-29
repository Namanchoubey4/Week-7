import java.util.*;

public class Main{
    public static void main(String[] args){
        Vector<Integer> number = new Vector<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        System.out.println("Numbers : "+number);
        System.out.println("First Number : "+number.firstElement());
        number.removeElementAt(2);
        System.out.println("After removing third element : "+number);
    }
}