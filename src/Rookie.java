public class Rookie extends Rank{
    Rookie(int age, String name){
        this.current_exp = age;
        this.name = name;
        min_exp_in_years = 0;
    }
}
