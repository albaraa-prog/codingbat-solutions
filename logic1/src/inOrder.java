public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk){
            return c > b && b > a;
        }else{
            return c > b;
        }
    }
}
