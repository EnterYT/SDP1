public class GunWeapon implements IWeaponBehavior{
    private int max_ammo = 12;
    private int current_ammo = 0;
    public int extra_magazine = 0;
    @Override
    public void reload_Weapon() {
        if (extra_magazine > 0) {
            current_ammo = max_ammo;
            System.out.println("Weapon Reloaded");
        }
        else {
            System.out.println("No Magazines for reload is left");
        }
    }

    @Override
    public void shoot_weapon(int times_shot) {
        for (int i = times_shot; i == 0; i--){
            if (current_ammo == 0){
                reload_Weapon();
            }
            else {
                System.out.println("Bang!");
            }
        }
    }

    @Override
    public void add_magazine(int amount){
        extra_magazine += amount;
        System.out.println("Now you have " + extra_magazine + "left");
    }

    @Override
    public void drop_magazine(int amount){
        extra_magazine -= amount;
        if (extra_magazine < 0)
            extra_magazine = 0;
    }

    @Override
    public int check_ammo(){
        return current_ammo;
    }
}
