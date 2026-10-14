public class Spiderman extends FlyingHero {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Spiderman no puede volar");
    }
}