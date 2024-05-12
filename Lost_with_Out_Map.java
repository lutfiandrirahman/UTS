
public class Lost_with_Out_Map {

    public static int[] map(int[] arr) {
        int[] doubledArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArray[i] = arr[i] * 2;
        }
        return doubledArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int[] doubledArray = map(originalArray);
        for (int num : doubledArray) {
            System.out.print(num + " ");
        }
    }
}
