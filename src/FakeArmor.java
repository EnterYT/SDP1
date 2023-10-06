public class FakeArmor implements IArmorBehavior{
    private int durability;
    FakeArmor(){
        durability = 100;
    }

    @Override
    public int checkDurability() {
        return 0;
    }

    @Override
    public void getDamage() {
        durability -= 15;
    }

    private boolean isBroken(){
        return durability <= 0;
    }

    private void breakArmor(){
        System.out.println("Armor is broken");
    }
}

