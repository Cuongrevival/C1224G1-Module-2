import java.util.HashSet;
import java.util.Set;

public class encodestring {
    public static java.util.ArrayList<Integer> insert_even_values(java.util.HashMap<Integer, Integer> hashMap) {
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<Integer>();
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get
                    (i) % 2 == 0){
                arrayList.add(hashMap.get(i));
            }
        }
        return arrayList;
    }
}