package mindera.mindswap.porto.module1.intro.bearshop;

public final class SimpleBear extends Bear {

    public SimpleBear() {
        super(BearTypes.SIMPLE_BEAR);
    }


    @Override
    public String die() {
        return "I've died";
    }

   /* @Override
    public String toString() {
        return super.toString() + " I really like to eat honey.";
    }
*/

}
