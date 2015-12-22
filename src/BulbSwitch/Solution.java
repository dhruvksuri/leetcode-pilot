public class Solution {
    public int bulbSwitch(int n) {
        if(n <= 0){
            return 0;
        }
        int ret = 0;
        for(long i = 1; i * i <= n; i++){
            ret ++;
        }
        return ret;
    }
}