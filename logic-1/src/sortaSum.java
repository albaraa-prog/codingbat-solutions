public class sortaSum {
    public int sortaSum(int a, int b) {
        int result = 0;
        result = a + b;
        if(result >=10 && result <= 19){
            return 20;
        }else {
            return result;
        }
    }
}
