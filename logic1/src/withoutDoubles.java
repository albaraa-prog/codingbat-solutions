public class withoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1 == die2){
            if(die1 == 6 && die2 == 6){
                return die1 + 1;
            }
            return (die1 + die2) + 1;
        }
        return die1 + die2;
    }
}
