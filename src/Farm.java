import java.util.ArrayList;

public class Farm {
    ArrayList <Flower> flowers = new ArrayList (5);
    ArrayList <Animal> barn = new ArrayList (20);

    public void plant (Flower flower){
        flowers.add(flower);
    }
    public void reap (Flower flower){
        flowers.remove(flower);
    }
    public void buy (Animal animal){
        barn.add(animal);
        int bigAnimals = 0;
        for (Animal a : barn){
            if (a.getSize().equals(Size.BIG) && bigAnimals < 10){
                bigAnimals++;
            }else if (bigAnimals > 10){
                System.out.println("Ve stodole uz je maximalni pocet velkych zvirat");
                barn.remove(animal);
            }
        }
    }
    public void sell (Animal animal){
        barn.remove(animal);
    }
    public void toWater (int flower){
        flowers.get(flower).setChanceOfGrowth(flowers.get(flower).chanceOfGrowth++);
    }
    public void caress (int animal){
        System.out.println("Prave jste pohladil " + barn.get(animal).getName());
    }

    @Override
    public String toString() {
        return "Farm{" +
                "flowers=" + flowers +
                ", barn=" + barn +
                '}';
    }
}
