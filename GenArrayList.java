import java.util.ArrayList; 
import java.util.Collections; 

public class GenArrayList<E extends Comparable<? super E>> { 
    private final ArrayList<E> data; 

    public GenArrayList() { 
        data = new ArrayList<>(); 
    } 

    public void addData(E values) { 
        data.add(values); 
    }
 
    public void display() { 
        Collections.sort(data); 
        for (int i = 0; i < data.size();i++) { 
            System.out.printf(data.get(i) + " "); 
        } 
        System.out.println(); 
    } 

    public void editData(String kode, E values) {
        data.add(values);
    }
 
    public void removeData(String kode) {
        if (kode.charAt(0) == 'A' || kode.charAt(0) == 'B'){
            data.removeIf(value -> ((ATK) value).getKode().equals(kode));
        } else {
            data.removeIf(value -> ((Bag) value).getKode().equals(kode));
        }
    }
} 
