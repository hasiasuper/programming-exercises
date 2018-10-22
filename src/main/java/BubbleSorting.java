public class BubbleSorting {

    public static void main(String[] args)
    {
        int temp;
        int temp2 = 0;
        int a = 0;
        int b = 100;
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = a + (int) (Math.random() * b);
        }

        System.out.println("До сортировки:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        while (true)
        {
            if (temp2!=array.length)
            {
                for (int i = 0; i < array.length - 1; i++)
                {
                    if (array[i] > array[i + 1])
                    {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        temp2 = 0;
                    }
                    else
                        temp2 = temp2 + 1;
                }
            }

            if (temp2 == array.length)
                break;
        }

        System.out.println("\nПосле сортировки:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
