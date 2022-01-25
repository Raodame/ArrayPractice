public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.print("{");
        for (int x = 0; x < array.length; x++){
            System.out.print(" " + array[x] + " ");
            if (x < array.length - 1)
                System.out.print("|");
        }
        System.out.println("}");

        for (int x = 0; x < array.length; x++)
            array[x] *= 2;

        System.out.print("{");
        for (int x = 0; x < array.length; x++) {
            System.out.print(" " + array[x] + " ");
            if (x < array.length - 1)
                System.out.print("|");
        }
        System.out.println("}");
    }
}
