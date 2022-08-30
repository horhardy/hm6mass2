public class Main {
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

     // ЗАДАНИЕ 1
        int summa = 0 ;
        for (int i = 0; i < arr.length; i++)
            summa = summa +arr[i];;

          System.out.println("Сумма трат за месяц составила " +  summa  + " рублей");

          // ЗАДАНИЕ 2

        int maxSumma = 0;
        for (int i = 0; i < arr.length; i++)

            if (maxSumma < arr[i])
                maxSumma = arr[i];
        System.out.println("Сумма трат за месяц составила " +  maxSumma   + " рублей");
        int minSumma = 120000;
        for (int i = 0; i < arr.length; i++)

            if (minSumma > arr[i])
                minSumma = arr[i];
        System.out.println("Сумма трат за месяц составила " +   minSumma  + " рублей");

        //ЗАДАНИЕ 3
        float b = 0;
        float d = 0;
        for (int i = 0; i < arr.length; i++)
            b = (b +arr[i]);
            d= b/30f;



        System.out.println("Средняя сумма трат за месяц составила " +   d  + " рублей");

        //ЗАДАНИЕ 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i  =  reverseFullName.length  - 1; i >= 0; i--)

        System.out.print( reverseFullName[i] );
















    }

}