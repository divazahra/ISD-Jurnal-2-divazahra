import java.util.ArrayList;
import java.util.Collection;

public class Main { 
    public static void main(String[] args) { 
        GenArrayList<ATK> items = new GenArrayList<>();
        GenArrayList<Bag> items1 = new GenArrayList<>();

        items.addData(new ATK("A001", "Pulpen", "Joyko", 70));
        items.addData(new ATK("A003", "Pensil", "Kenko", 30));
        items.addData(new ATK("A002", "Pulpen", "Kokoro", 28));
        items.addData(new ATK("B001", "Buku", "Komik", 76));
        items.addData(new ATK("B002", "Buku", "Novel", 21));
        items1.addData(new Bag("C001", "Tas", "Dora", 23));
        items1.addData(new Bag("C002", "Tas", "Barbie", 46));
        items1.addData(new Bag("C005", "Tas", "Batman", 11));
        items1.addData(new Bag("C004", "Tas", "Patrick", 45));
        items1.addData(new Bag("C003", "Tas", "Boot", 25));

        System.out.println("Isi data ATK: ");
        items.removeData("A001");
        items1.removeData("C002");
        items.display();

        System.out.println("Isi data Bag: ");
        items1.display();
    } 
} 
 
