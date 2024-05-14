public class HeroMagic extends Hero {
    String power;

    public HeroMagic(String name, double health) {
        super(name, health);
        this.power = "Magic";
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " is a " + this.power + " Hero.");
    }
}
