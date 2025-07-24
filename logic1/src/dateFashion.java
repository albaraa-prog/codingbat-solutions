public class dateFashion {
    public int dateFashion(int you, int date) {
        if (you >= 8 || date >= 8){
            return 2;
        } else if(you >= 3 && you < 8 || date >= 3 && date < 8){
            return 1;
        } else {
            return 0;
        }
    }
}
