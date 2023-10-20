import java.util.ArrayList;
import java.util.List;

public class StringListAdapter implements StringList{
    IntegerList integerList;

    public StringListAdapter(IntegerList integerList) {
        this.integerList = integerList;
    }

    @Override
    public void addString(String string) {
        integerList.addInteger(Integer.parseInt(string));
    }

    @Override
    public List<String> getStrings() {
        List<String> stringList = new ArrayList<>();
        for (Integer integer: integerList.getIntegers()) {
            stringList.add(integer.toString());
        }
        return stringList;
    }
}
