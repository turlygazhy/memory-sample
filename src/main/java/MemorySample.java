import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MemorySample {
    public static void main(String[] args) {
        List list = new ArrayList(1000);

        IntStream.iterate(1, i -> i * 10)
                .map(i -> {
                    final String[] e = new String[i];
                    for (int j = 0; j < e.length; j++) {
                        e[j] = "fjkdsl" + j;
                    }
                    list.add(e);
                    return e.length;
                })
                .forEach(System.out::println);
    }
}
