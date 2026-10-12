import java.util.List;

public class SuperHero {
    private String name;
    private List<Ability> abilities;

    public SuperHero(String name, List<Ability> abilities) {
        this.name = name;
        this.abilities = abilities;
    }

    public void useAbility() {

        System.out.println(name + " usando sus habilidades");

        for (Ability ability : abilities) {
            ability.use();
        }
    }
}