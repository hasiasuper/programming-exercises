import java.util.stream.IntStream;

public class TaskOut1to100
{
    public static void main(String[] args)
    {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach(i -> {
            if(i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
            if(i % 3 == 0)
                System.out.println("Hello");
            if(i % 5 == 0)
                System.out.println("World");
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("HelloWorld");
        });
    }
}
