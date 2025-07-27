public class endUp {
    public String endUp(String str) {
        if(str.length() < 3){
            return str.toUpperCase();
        }
        String lastStr = str.substring(str.length() - 3, str.length());
        String del = str.substring(0, str.length() - 3);
        return del + lastStr.toUpperCase();
    }

}
