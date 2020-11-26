import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        listDemo();
        setDemo();
        sortedSetDemo();
        mapDemo();
    }

    private static void mapDemo() {
        System.out.println("---Map Demo---");
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("Bob", "Marley");
        for (String key : map.keySet()) {
            System.out.println("["+key+":"+map.get(key)+"]");
        }
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println("["+e.getKey()+":"+e.getValue()+"]");
        }
    }

    private static void sortedSetDemo() {
        System.out.println("---Sorted Set Demo---");
        SortedSet<String> set = new TreeSet<>();
        set.add("Ann");
        set.add("Will");
        set.add("Chris");
        set.add("Ann");
        set.forEach(System.out::println);
    }

    private static void setDemo() {
        System.out.println("---Set Demo---");
        Set<String> set = new HashSet<>();
        set.add("Ann");
        set.add("Will");
        set.add("Chris");
        set.add("Ann");
        set.forEach(System.out::println);
    }

    private static void listDemo() {
        System.out.println("---List Demo---");
        List<String> list = new LinkedList<>();
        list.add("Bill");
        list.add("Ann");
        list.add("Will");
        list.add("Chris");
        list.forEach(System.out::println);
    }
}
