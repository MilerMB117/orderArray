//algorithm to organize array
//MilerMenjure
//Java
import java.util.*;
public class App {
    static boolean compareData(Integer a, Integer b) {
        //Compares whether they are even or odd,
        // and sorts them in order
        if ((a & 1) == (b & 1)) {
            return a < b;
        }

        // Sort if one even and odd
        return (a & 1) < (b & 1);
    }

    static void separateData(Integer[] array, int N) {
        // Sort comparator - Separating
        Arrays.sort(array, new Comparator < Integer > () {

            @Override
            public int compare(Integer a, Integer b) {
                // whether even or odd
                // and we will grade them in the requested order
                if ((a & 1) == (b & 1)) {
                    return a < b ? -1 : 1;
                }

                // Sort if one even and odd
                return ((a & 1) < (b & 1)) ? -1 : 1;
            }

        });

        for (int i = 0; i < N; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    // main
    public static void main(String[] args) {
        Integer arr[] = {10,20,17,23,1,40,53,23,55,18};
        int N = arr.length;
        separateData(arr, N);
    }
}
