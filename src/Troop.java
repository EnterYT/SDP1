public class Troop {
    Rank rank;
    String name;

    Troop(int exp_in_years, String name){
        this.name = name;
        if(exp_in_years < 5){
            this.rank = new Rookie(exp_in_years, name);
        } else if (exp_in_years < 10) {
            this.rank = new Novice(exp_in_years, name);
        } else if (exp_in_years < 15) {
            this.rank = new Ameteur(exp_in_years, name);
        }
        else {
            this.rank = new Professional(exp_in_years, name);
        }
    }

    public int show_troop_exp(){
        return rank.current_exp;
    }
    public Rank showTroopRank(){
        return rank;
    }
}
