import java.util.Scanner;

public class Lesson21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Ввод 2-мерного массива==================");
        int[][] arr = new int[4][3];
        int[] sumInRows = new int[4];
        int[] sumInCols = new int[3];
        int[][] array = {{1,2,3},{1,2,3},{1,2,3}};
        for (int i = 2; i <= 10; ) {

            i *= 2;

            System.out.print("+ ");

            i--;

        }

        for (int i=0; i<4; i++) {
            int tempSumRow = 0;
            for (int j=0; j<3; j++) {
                System.out.print("Введите " + (j+1) + " элемент " + (i+1) + " строки: ");
                int el = sc.nextInt();
                arr[i][j] = el;
                tempSumRow += el;
                switch (j) {
                    case 0 :
                        sumInCols[0]+=el;
                        break;
                    case 1 :
                        sumInCols[1]+=el;
                        break;
                    case 2 :
                        sumInCols[2]+=el;
                        break;
                    default:
                        break;
                }
            }
            sumInRows[i]=tempSumRow;
        }
        System.out.println("===========Подсчет сумм в строках и столбцах и средних арифметических==================");
        for (int i=0; i<sumInRows.length; i++) {
            System.out.println("Line " + (i+1) + ": " + sumInRows[i]);
            System.out.println("Целое среднее арифметическое в строке = " + sumInRows[i]/3);
        }
        for (int i=0; i<sumInCols.length; i++) {
            System.out.println("Col " + (i+1) + ": " + sumInCols[i]);
            System.out.println("Целое среднее арифметическое в колонке = " + sumInCols[i]/4);
        }
        System.out.println("===========Перевернутый одномерный массив из 2-мерного==================");
        int[] reverseArray = new int[12];
        int k = 0;
        for (int i=3; i>=0; i--){
            for (int j=2; j>=0;j--){
                reverseArray[k]=arr[i][j];
                System.out.print(reverseArray[k]+ " ");
                k++;
            }
        }
        System.out.println();
        System.out.println("===========Замена четных на 0, нечетных на 1==================");
        for (int[] row : arr){
            for (int el : row){
                el = (el % 2 == 0) ? 0 : 1;
                System.out.print(el + " ");
            }
            System.out.println();
        }

    }
}
