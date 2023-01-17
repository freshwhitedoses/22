import java.util.Arrays;

public class Main {

    public static void sort(Comparable[] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j =0 ;j<i; j++) {
                if(array[j].compareTo(array[i]) > 0) {
                    Comparable tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] a = {124,2414,5315,21512,51,5521,4312};
        sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}