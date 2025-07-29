public class blueTicket {
    public int blueTicket(int a, int b, int c) {
        if(a + b == 10 || c + b == 10 || c + a == 10 ){
            return 10;
        }else if((a + b) == (c + b + 10) || (a + b) == (c + a + 10)){
            return 5;
        }
        return 0;
    }
}
