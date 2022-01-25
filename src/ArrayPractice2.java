public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] array = randomArray(10);
        printArray(array);
    }

    public static int[] randomArray(int size){
        int[] array = new int[size];
        for (int x = 0; x < array.length; x++)
            array[x] = (int)(Math.random() * 10) + 1;
        return array;
    }

    public static void printArray(int[] array){
        System.out.print("{");
        for (int x = 0; x < array.length; x++) {
            System.out.print(" " + array[x] + " ");
            if (x < array.length - 1)
                System.out.print("|");
        }
        System.out.println("}");
    }

    public static int getInteger()
}
