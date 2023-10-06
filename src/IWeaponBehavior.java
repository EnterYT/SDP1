public interface IWeaponBehavior {
    public void reload_Weapon();
    public void shoot_weapon(int times_shot);

    public void add_magazine(int a);
    public void drop_magazine(int a);
    public int check_ammo();

}
