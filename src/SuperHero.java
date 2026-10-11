import java.util.List;

/*
 * ============================================================
 * Archivo: SuperHero.java
 * ============================================================
 *
 * SuperHero representa un superhéroe dentro del sistema.
 *
 * Relación con SOLID
 * ------------------
 * Aquí observamos cómo la clase deja de implementar
 * directamente las habilidades y pasa a trabajar con
 * el contrato Ability.
 *
 * Esto ayuda a separar responsabilidades (S)
 * y facilita agregar nuevas habilidades (O).
 */

public class SuperHero {

    /*
     * Nombre del superhéroe.
     */
    private String name;

    /*
     * Lista con las habilidades que posee el superhéroe.
     *
     * No almacenamos clases concretas como FlyAbility
     * o SuperStrength, sino objetos que cumplen
     * el contrato Ability.
     */
    private List<Ability> abilities;

    /*
     * El constructor recibe el nombre del héroe
     * y las habilidades que tendrá.
     */
    public SuperHero(
            String name,
            List<Ability> abilities
    ) {
        this.name = name;
        this.abilities = abilities;
    }

    /*
     * Recorre todas las habilidades del superhéroe
     * y ejecuta cada una de ellas.
     */
    public void useAbilities() {

        System.out.println(name + " usa sus habilidades:");

        /*
         * Este ciclo recorre cada elemento
         * almacenado en la lista abilities.
         */
        for (Ability ability : abilities) {

            /*
             * No importa cuál sea la habilidad concreta.
             * Mientras cumpla el contrato Ability,
             * podrá utilizarse.
             */
            ability.use();
        }
    }
}
