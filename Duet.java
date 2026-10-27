
public class Duet {

    public static <T extends Comparable<? super T>> T min(T first, T second) {
        if (first.compareTo(second) <= 0) {
            return first;
        }
        return second;
    }

    public static <T extends Comparable<? super T>> T max(T first, T second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
