/**
 * Created by yichunli on 2017/7/4.
 */
public class RotateArrayMinNum {

    public Integer findMinNum(int[] array){
        if(array == null){
            return null;
        }
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int mid = 0;
        while(array[leftIndex] > array[rightIndex]){
            if(rightIndex - leftIndex <= 1){
                mid = rightIndex;
                break;
            }
            mid = (leftIndex + rightIndex) / 2;
            // {1,0,1,1,1} -> {1,0,1,1,1} ,{1,1,1,0,1}
            if(array[leftIndex] == array[rightIndex] && array[leftIndex] == array[mid]){
                if(array[leftIndex + 1] != array[rightIndex - 1]){
                    mid = array[leftIndex + 1] < array[rightIndex - 1] ? (leftIndex + 1) : (rightIndex - 1);
                    break;
                } else {
                    leftIndex ++;
                    rightIndex --;
                }
            } else {
                if(array[mid] >= array[leftIndex]){
                    leftIndex = mid;
                } else {
                    if(array[mid] <= array[rightIndex])
                        rightIndex = mid;
                }
            }
        }
        return array[mid];
    }
}
