public class more14 {
    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for(int num: nums){
            if(num == 1){
                ones++;
            }else if(num == 4){
                fours++;
            }
        }
        return ones > fours;
    }
}
