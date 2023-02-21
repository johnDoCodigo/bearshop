package mindera.mindswap.porto.module1.intro.bearshop;

public class Shop {


    private int bearsCreated;

    public Bear createBear() {
        bearsCreated++;
        if (bearsCreated % 5 == 0) {
            return new CrankyBear();
        }
        if (bearsCreated % 2 == 0) {
            return new SimpleBear();
        }
        return new DrunkBear();
    }

    public boolean compare(Shop shop) {
        return this.bearsCreated > shop.bearsCreated;
    }
}
