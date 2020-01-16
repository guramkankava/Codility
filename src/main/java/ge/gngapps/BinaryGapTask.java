package ge.gngapps;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class BinaryGapTask {



    public static void main(String[] args) {
//        String binaryString = Integer.toBinaryString(20);
//        System.out.println(binaryString);
//        System.out.println("======Last index of=======");
//        System.out.println(binaryString.lastIndexOf('1'));
//        System.out.println("======Substring=======");
//        System.out.println(binaryString.substring(0, binaryString.lastIndexOf('1') + 1));
        //System.out.println("====AFTER====");
//        String[] split = binaryString.split("0");
//        if() {
//            
//        }
//        for(String portion : split) {
//            System.out.println(portion);
//        }
        System.out.println(solution(0));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        if(N < 0) {
            throw new InvalidParameterException("Parameter must be positive number");
        }
        
        String nAsBinary = Integer.toBinaryString(N);
        
        // Check for binary gap
        if(nAsBinary.split("0").length <= 1) {
            return 0;
        }

        return Arrays.stream(nAsBinary.substring(0, nAsBinary.lastIndexOf('1') + 1).split("1")).mapToInt(String::length).max().getAsInt();
    }
}
