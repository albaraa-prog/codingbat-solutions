public class love6 {
    public boolean love6(int a, int b) {
        if(a + b == 6){
            return true;
        }else if(a == 6 || b == 6){
            return true;
        }else if (Math.abs(a-b) == 6){
            return true;
        }else {
            return false;
        }
    }
}
