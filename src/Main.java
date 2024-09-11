import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Banana");
        lists.add("Orange");
        lists.add("Apple");
        lists.add("Pear");
//лямбда...
//        Collections.sort(lists, (o1,o2) -> o1.compareTo(o2));
        Collections.sort(lists, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(lists);

        MyFunctionalInterface myFunc= (r1,r2) -> r1+r2;

        int summa= myFunc.sum(12,21);
        System.out.println(summa);
        StringUtil sUtil= new StringUtil();

        StringActions stringActions = new StringActions() {
            @Override
            public String concat(String str1, String str2) {
                return str1+str2;
            }

            @Override
            public int countChars(String str) {
                int sum=str.toCharArray().length;
                return sum;
            }

            @Override
            public char findChar(char c) {
                return 0;
            }
        };
        System.out.println(stringActions.countChars("strs"));


    }
}
