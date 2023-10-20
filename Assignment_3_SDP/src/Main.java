public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerList();

        StringList stringList = new StringListAdapter(integerList);

        stringList.addString("25");
        integerList.addInteger(-22);
        stringList.addString("-32");
        integerList.addInteger(57);

        for (Integer integer: integerList.getIntegers()) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (String string: stringList.getStrings()) {
            System.out.print(string + " ");
        }
    }
}