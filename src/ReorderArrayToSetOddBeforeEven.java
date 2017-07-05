/**
 * Created by yichunli on 2017/7/5.
 */
public class ReorderArrayToSetOddBeforeEven{
    public static void order(int[] arr) {
        if(arr == null || arr.length == 0)
            return;
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            while(start < end && !isEven(arr[start]))
                start ++;
            while(start < end && isEven(arr[end]))
                end --;
            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }


    public static boolean isEven(int num){
            if(num % 2 == 0)
                return true;
            else
                return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ReorderArrayToSetOddBeforeEven reorderArrayToSetOddBeforeEven = new ReorderArrayToSetOddBeforeEven();
        reorderArrayToSetOddBeforeEven.order(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
