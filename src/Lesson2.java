public class Lesson2 {
    public static void main(String[] args) {
        int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
        int maxDigit = 0;
        int sum = 0;
        //Задание 2-1
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
            if (arr[i]>maxDigit) {
                maxDigit=arr[i];
            }
            sum += arr[i];
        }
        System.out.println();
        //Задание 2-2
        for (int i = 0; i < arr.length; i++){
            if (Integer.toString(arr[i]).length() == 2) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        //Задание 2-3
        System.out.println(maxDigit);
        //Задание 2-4
        System.out.println(sum);
        //Задание 2-5
        reverseArray(arr);
    }

    private static int[] reverseArray(int[] arr) {
        int reverseArr[] = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            reverseArr[i] = arr[arr.length-1-i];
            System.out.print(reverseArr[i]+" ");
        }
        return reverseArr;
    }
}
