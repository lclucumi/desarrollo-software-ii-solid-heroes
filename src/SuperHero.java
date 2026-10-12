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
     * Constructor de SuperHero.
     *
     * Recibe las habilidades desde afuera en lugar de crearlas
     * aquí dentro, así SuperHero no depende de clases concretas
     * como FlyAbility o SuperStrength.
     */

    public SuperHero(String name, List<Ability> abilities) {
        this.name = name;
        this.abilities = abilities;
    }

    /*
     * Recorre todas las habilidades del superhéroe
     * y ejecuta cada una de ellas.
     */

    public void useAbility() {

        System.out.println(name + " usando sus habilidades");

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