public class Novice extends Rank{
    Novice(int age, String name){
        this.current_exp = age;
        this.name = name;
        this.min_exp_in_years = 5;
    }
}
