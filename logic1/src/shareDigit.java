public class shareDigit {
    public boolean shareDigit(int a, int b) {
        if(a / 10 == b / 10 || a % 10 == b % 10 || a / 10 == b % 10 || a % 10 == b / 10){
            return true;
        }
        return false;
    }
}
