package Sort.javaapi.builtin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {
    public static void main(String[] args) {
        System.out.println("==== Sort Integer ====");
        List<Integer> numList = new ArrayList<>(Arrays.asList(40, 15, 34, 21, 66, 53));
        System.out.println("원본 : " + numList);

        Collections.sort(numList);
        System.out.println("오름차순 : " + numList);

        Collections.sort(numList, Comparator.reverseOrder());
        System.out.println("내림차순 : " + numList);

        

        System.out.println("==== Sort String ====");
        List<String> strList = new ArrayList<>(Arrays.asList("d", "A", "C", "F", "a"));
        System.out.println("원본 : " + strList);

        Collections.sort(strList);
        System.out.println("오름차순 : " + strList);

        Collections.sort(strList, Comparator.reverseOrder());
        System.out.println("내림차순 : " + strList);

        Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 무시 오름차순 : " + strList);

        Collections.sort(strList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("대소문자 무시 내림차순 : " + strList);
    }
}