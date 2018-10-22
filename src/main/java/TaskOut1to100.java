import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOut1to100
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        
        list.stream()
                .filter(i -> i % 3 != 0 && i % 5 != 0)
                .forEach(System.out::println);

        list.stream()
               .filter(i -> i % 3 == 0 )
               .map((i) -> i + " Hello").collect(Collectors.toList())
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i % 5 == 0)
                .map((i) -> i + " World").collect(Collectors.toList())
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i % 3 == 0 && i % 5 == 0)
                .map((i) -> i + "HelloWorld").collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
