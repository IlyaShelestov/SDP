import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    private List<Integer> integerList = new ArrayList<>();

    public void addInteger(Integer integer) {
        integerList.add(integer);
    }

    public List<Integer> getIntegers() {
        return integerList;
    }
}
