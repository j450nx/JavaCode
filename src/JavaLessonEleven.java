import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
public class JavaLessonEleven {

    public static void main(String[] args) {
        
        ArrayList arrayListOne;
        
        arrayListOne = new ArrayList();
        
        ArrayList arrayListTwo = new ArrayList();
        
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Felipe Baller");
        names.add("Khalil Chatoo");
        names.add("Victor Xiong");
        
        names.add(2, "Jack Ryan");
        
        names.set(0, "Jack Daniels");

        names.remove(3);
        
        // names.removeRange(0,1);
        
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        System.out.println(names);
          
        for(String i : names) {
            System.out.println(i);
        }
        
        Iterator indivItems = names.iterator();
        
        while(indivItems.hasNext()) {
            System.out.println(indivItems.next());
        }
        
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();
        nameCopy.addAll(names);
        
        String paulYoung = "Paul Young";
        names.add(paulYoung);
        if(names.contains(paulYoung)) {
            System.out.println("Paul is here");
        }
        
        if(names.containsAll(nameCopy)) {
            System.out.println("Everything in nameCopy is in names");
        }
        
        if(nameCopy.containsAll(names)) {
            System.out.println("Everything in names is in nameCopy");
        }
        // Copies names to nameCopy then added paulYoung to names
        
        names.clear();
        if(names.isEmpty()) {
            System.out.println("ArrayList is empty");
        }
       
        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();
        System.out.println(Arrays.toString(moreNames));
        
        
    }
}
