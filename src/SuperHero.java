import java.util.List;

public class SuperHero {
    private final String name; 
    private final List<Ability> abilities;

    public SuperHero(String name, List<Ability> abilities) {
        this.name = name;
        this.abilities = abilities;
    }

    public void useAbility() {
        System.out.println(name + " usa sus habilidades");

        for (Ability ability : abilities) {
            ability.use();
        }
    }
 }