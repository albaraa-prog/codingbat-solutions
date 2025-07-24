public class cigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars >= 40 && cigars <= 60){
                return true;
            } else {
                return false;
            }
        }else if(!isWeekend){
            return true;
        } else {
            return false;
        }
    }
}
