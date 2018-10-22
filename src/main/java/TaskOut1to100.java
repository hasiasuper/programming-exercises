public class TaskOut1to100
{
    public static void main(String[] args)
    {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]%3==0 && array[i]%5==0)
                System.out.println("HelloWorld");
                else
            if (array[i]%3==0)
                System.out.println("Hello");
            else
            if (array[i]%5==0)
                System.out.println("World");
            else
            System.out.println(array[i]);
        }
    }
}
