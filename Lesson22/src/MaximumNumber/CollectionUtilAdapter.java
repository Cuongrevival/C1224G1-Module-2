package MaximumNumber;

import java.util.*;

public class CollectionUtilAdapter implements CollectionOperations {

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>(numbers);
        return Collections.max(list);
    }
}
