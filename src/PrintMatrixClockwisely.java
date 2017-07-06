/**
 * Created by yichunli on 2017/7/5.
 */
public class PrintMatrixClockwisely {
    public void printMatrixClockwisely(int[][] array){
        if(array == null)
            return;
        int start = 0;
        while(array[0].length > start * 2 && array.length > start * 2){
            printOneCircle(array, start);
            start ++;
        }
    }

    private void printOneCircle(int[][] array, int start){
        for(int i = start; i < array[0].length - start; i ++){
            System.out.print(array[start][i] + " ");
        }
        if(array.length - 1 - start > start) {
            for(int i = start + 1; i < array.length - 1- start; i++){
                System.out.print(array[i][array[0].length - 1 - start] + " ");
            }
        }
        if(array[0].length - start - 1 > start && array.length - start - 1 > start){
            for(int i = array[0].length - start - 1; i > start; i--){
                System.out.print(array[array.length - start - 1][i] + " ");
            }
        }
        if(array.length - 1 - start > start && array[0].length - 1 - start > start) {
            for(int i = array.length - 1 - start; i > start; i--){
                System.out.print(array[i][start] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        PrintMatrixClockwisely test = new PrintMatrixClockwisely();
        test.printMatrixClockwisely(array);
    }
}
