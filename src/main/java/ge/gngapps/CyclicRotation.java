package ge.gngapps;

public class CyclicRotation {

    public static void main(String[] args) {
        int [] source = new int [] {1,2,3,4,5};
        for(int ae : solution(source, 4)) {
            System.out.print(ae);
        }
    }

    public static int[] solution(int[] source, int rotatinCount) {
        if(source.length == 0 || rotatinCount < 1) {
            return source;
        }

        int [] resultArray = new int[source.length];
        for(int rotationIndex = 0; rotationIndex < rotatinCount ; rotationIndex ++) {

            int lastElement = source[source.length - 1];

            resultArray[0] = lastElement;

            System.arraycopy(source, 0, resultArray, 1, source.length -1);

            System.arraycopy(resultArray, 0, source, 0, source.length);
        }

        return resultArray;
    }
}
