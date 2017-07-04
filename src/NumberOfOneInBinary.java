/**
 * Created by yichunli on 2017/7/4.
 */
public class NumberOfOneInBinary {
    public int numberOf1(int n){
        int count = 0;
        while(n != 0){
            count ++;
            n = (n - 1) & n;
        }
        return count;
    }
}
