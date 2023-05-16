package Array;

public class ArrayOfNumbers {
    public int[] arrayNumber(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
