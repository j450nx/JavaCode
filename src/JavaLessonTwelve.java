import java.util.Arrays;
import java.util.LinkedList;

class JavaLessonTwelve {
    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();
        
        LinkedList<String> names = new LinkedList<String>();
        
        names.add("Felipe Baller");
        names.add("Khalil Chatoo");
        
        names.addLast("Victor Xiong");
        
        names.addFirst("Jason Liu");
        
        names.add(0, "Jacob Adams");
        
        names.set(2, "Paul Newman");
        
        names.remove(4);
        names.remove("Jacob Adams");
        
//        for (String name : names) {
//            System.out.println(name);
//        }
        
//        System.out.println("\nFirst index: " + names.get(0));
//        
//        System.out.println("Last index: " + names.getLast());
        
        LinkedList<String> nameCopy = names;
//        System.out.println("nameCopy: " + nameCopy);
        
//        if(names.contains("Jason Liu")) {
//            System.out.println("Jason is here");
//        }
        
//        if(names.containsAll(nameCopy)) {
//            System.out.println("Collections are same");
//        }
        
//        System.out.println("Jason at index: " + names.indexOf("Jason Liu"));
//        System.out.println("List is empty: " + names.isEmpty());
//        System.out.println("How many: " + names.size());
//        System.out.println("Look without error: " + names.peek());
//        System.out.println("Remove first element: " + nameCopy.poll());
//        System.out.println("nameCopy: " + nameCopy);
//        System.out.println("Remove first element: " + nameCopy.pollLast());
//        System.out.println("nameCopy: " + nameCopy);
        
        nameCopy.push("Jason Liu");
        nameCopy.pop();
        
        for(String name : names) {
            System.out.println(name);
        }
        
        Object[] nameArray = new Object[3];
        nameArray = names.toArray();
        System.out.println(Arrays.toString(nameArray));
        
        names.clear();
        
    }
}