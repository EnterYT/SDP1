public class Equipment {
    String name;
    IWeaponBehavior weapon;
    IArmorBehavior armor;
    Equipment(IWeaponBehavior weapon, IArmorBehavior armor, Troop troop){
        this.name = troop.name;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void show_content(){
        System.out.println("Troop name: " + name);
        System.out.println("Used weapon: " + weapon);
        System.out.println("Put armor: " + armor);
    }
}
