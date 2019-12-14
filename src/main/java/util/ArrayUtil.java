package util;

public class ArrayUtil {
    public static String printIntArray(int[] array) {
        StringBuilder sb = new StringBuilder("");
        sb.append("[");
        for (int i = 0; i < array.length - 1; i++) {
            sb.append(array[i] + ", ");
        }
        sb.append(array[array.length - 1] + "]");
        return sb.toString();
    }
}
