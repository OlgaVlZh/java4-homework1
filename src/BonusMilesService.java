public class BonusMilesService {

    public int calculate(int cost) {
        int bonusMiles; 
        if (cost >= 20) {
            bonusMiles = cost / 20;
        } else {
            bonusMiles = 0;
        }
        return bonusMiles;
    }
}
