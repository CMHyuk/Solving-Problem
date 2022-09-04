interface Vehicle {

    void board();
}

interface IFloatable {

    void floatOnWater();
}

interface IRunnableOnGround {

    void run();
}
class Creature {

    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Creature" + " " + name;
    }
}

class Boat extends Creature implements Vehicle, IFloatable {

    private String boatName;

    public Boat(String boatName) {
        super(boatName);
        this.boatName = boatName;
    }

    @Override
    public String getName() {
        return this.boatName;
    }

    @Override
    public String toString() {
        return "Boat" + " " + boatName;
    }

    @Override
    public void board() {
        System.out.println("Many people can board " + this + ".");
    }

    @Override
    public void floatOnWater() {
        System.out.println(this + " can float on water.");
    }
}

class Car extends Creature implements Vehicle, IRunnableOnGround {
    private String carName;

    public Car(String carName) {
        super(carName);
        this.carName = carName;
    }

    @Override
    public String getName() {
        return this.carName;
    }

    @Override
    public String toString() {
        return "Car" + " " +carName;
    }

    @Override
    public void board() {
        System.out.println("A small number of people can board " + this + ".");
    }

    @Override
    public void run() {
        System.out.println(this + " can run on the ground.");
    }
}

class Duck extends Creature implements IFloatable, IRunnableOnGround {
    private String duckName;

    public Duck(String duckName) {
        super(duckName);
        this.duckName = duckName;
    }

    @Override
    public String toString() {
        return "Duck" + " " + duckName;
    }

    @Override
    public String getName() {
        return this.duckName;
    }

    @Override
    public void floatOnWater() {
        System.out.println(this + " can float on water.");
    }

    @Override
    public void run() {
        System.out.println(this + " can run on the ground.");
    }
}

public class CreatureTest {
    public static void main(String[] args) {
        Creature[] creatures = { new Boat("타이타닉"), new Car("람보르기니"), new Duck("도널드")};

        for (Creature creature : creatures) {
            System.out.println(creature.getName());
            System.out.println(creature);

            System.out.print("Vehicle? ");
            if (creature instanceof Vehicle)
                ((Vehicle) creature).board();
            else
                System.out.println("No.");

            System.out.print("Floatable on water? ");
            if (creature instanceof IFloatable)
                ((IFloatable) creature).floatOnWater();
            else
                System.out.println("No.");

            System.out.print("Runnable on the ground? ");
            if (creature instanceof IRunnableOnGround)
                ((IRunnableOnGround) creature).run();
            else
                System.out.println("No.");

            System.out.println("End of Iteration" + "\n");
        }
    }
}
