public class Main {
    public static void main(String[] args) {

        Farm farm = new Farm();
        Sheep sheep = new Sheep("fourlegs", "Shawn", Size.SMALL, "care for wool");
        Rose rose = new Rose("whiterose", 199.90, 5, 10);
        Pig pig = new Pig("fourlegs", "Pep", Size.SMALL, "extra eat");
        Sunflower sunflower = new Sunflower("yellowsunflower", 99.90, 10, 20);
        farm.buy(sheep);
        farm.plant(rose);
        farm.buy(pig);
        farm.plant(sunflower);
        farm.toWater(0);
        farm.caress(1);
        System.out.println(farm);
    }
}