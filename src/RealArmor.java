public class RealArmor implements IArmorBehavior{
    int durability;
    RealArmor(){
        durability = 100;
    }

    @Override
    public int checkDurability() {
        return 0;
    }

    @Override
    public void getDamage() {
        durability -= 5;
        if (isBroken())
            breakArmor();
    }

    private boolean isBroken(){
        return durability <= 0;
    }

    private void breakArmor(){
        System.out.println("Armor is broken");
    }
}
