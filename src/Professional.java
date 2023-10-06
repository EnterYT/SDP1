public class Professional extends Rank{
    Professional(int age, String name){
        this.current_exp = age;
        this.name = name;
        this.min_exp_in_years = 15;
    }
}
