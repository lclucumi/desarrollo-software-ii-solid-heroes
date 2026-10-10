
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        SuperHero superman = new SuperHero("Superman",
        List.of(
            new FlyAbility(),
            new SuperStrength()
        ));

        superman.useAbility();

        FlyingHero hero = new Spiderman();
        hero.fly();

        Avengers avengers = new Avengers(
            List.of(
                new IronMan(),
                new Hulk(),
                new Thor()
            )
        );
        avengers.figth();
    }
}