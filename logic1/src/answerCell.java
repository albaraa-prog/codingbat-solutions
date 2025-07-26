public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning && isMom && !isAsleep){
            return true;
        }else if(!isMorning && !isAsleep){
            return true;
        }
        return false;
    }
}
