package ge.gngapps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int [] source = new int [] {1,2,3,1,3,1,1,2,2};
        int [] source2 = new int [] {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solutionByMap(source));
    }

    public static void solution(int[] source) {

    }

    public static Integer solutionByList(int[] source) {
        List<Integer> result = new ArrayList<>();
        for (int element : source) {
            int index;
            if((index = result.indexOf(element)) >= 0) {
                result.remove(index);
            } else {
                result.add(element);
            }
        }
        return result.get(0); 
    }

    public static Integer solutionByMap(int[] source) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : source) {
            if(result.containsKey(element)) {
                result.remove(element);
            } else {
                result.put(element, element);
            }
        }
        return new ArrayList<Integer>(result.values()).get(0);
    }

    public static Integer solutionByBinary(int[] source) {
        int result = source[0];
        for (int index = 1; index < source.length; index++) {
            result = result ^ source[index]; 
        }
        return result;
    }
}
