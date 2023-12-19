import java.sql.SQLOutput;

public class Lab07 {
    public static void main(String[] args) {
        Set testSet1 = new Set();
        testSet1.add(1);
        testSet1.add("Aut");
        testSet1.add(15);
        System.out.println("1 is in testSet1?: " + testSet1.contains(1));
        testSet1.remove(1);
        System.out.println("1 have in testSet1?: " + testSet1.contains(1));
        System.out.println("Is testSet1 empty?: " + testSet1.isEmpty());
        System.out.println("Size of testSet1: " + testSet1.size());

        testSet1.clear();
        System.out.println("Size of testSet1 after clear: " + testSet1.size());
    }
}
