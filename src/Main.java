import java.util.List;

/*
 * ============================================================
 * Archivo: Main.java
 * ============================================================
 *
 * Main es el punto de entrada del programa.
 *
 * Cuando ejecutamos una aplicación Java sencilla,
 * la ejecución comienza en el método main().
 *
 * Este archivo nos permitirá crear objetos y comprobar
 * cómo interactúan entre sí.
 */

public class Main {

    /*
     * Todo programa Java comienza su ejecución
     * en el método main().
     *
     * Desde aquí crearemos nuestros objetos
     * y utilizaremos sus métodos.
     */
    public static void main(String[] args) {

        // ====================================================
        // SUPERHÉROES
        // ====================================================

        /*
         * Creamos un objeto llamado superman.
         *
         * La palabra reservada new indica que estamos creando
         * una nueva instancia de la clase SuperHero.
         *
         * El constructor recibe:
         * 1. El nombre del superhéroe.
         * 2. Una lista con las habilidades que tendrá.
         */
        SuperHero superman = new SuperHero(
                "Superman",
                List.of(
                        new FlyAbility(),
                        new SuperStrength()
                )
        );
        /*
        * List.of(...) crea una lista con los objetos indicados.
        *
        * En este caso estamos creando una lista con dos habilidades:
        * FlyAbility y SuperStrength.
        *
        * Esa lista será enviada al constructor de SuperHero.
        */

        /*
         * En este caso, Superman tendrá únicamente
         * las habilidades de volar y usar superfuerza.
         *
         * Relación con SOLID
         * ------------------
         * Aquí observamos el resultado de aplicar
         * Single Responsibility Principle (S)
         * y Open/Closed Principle (O).
         *
         * SuperHero ya no implementa directamente
         * las habilidades.
         *
         * En su lugar, recibe objetos que cumplen
         * el contrato Ability.
         */

        superman.useAbilities();

        System.out.println();

        // ====================================================
        // EJEMPLO TEMPORAL PARA L
        // ====================================================

        /*
         * Estas líneas se utilizaron únicamente para explicar
         * Liskov Substitution Principle (L).
         *
         * Si se desean probar nuevamente, basta con
         * descomentarlas.
         */

        // FlyingHero hero = new SpiderMan();
        // hero.fly();

        // ====================================================
        // AVENGERS
        // ====================================================

        /*
         * Ahora construiremos el equipo de Avengers.
         *
         * Fíjense que Avengers NO crea internamente
         * a IronMan, Hulk o Thor.
         *
         * Nosotros creamos esos objetos y luego
         * se los entregamos mediante el constructor.
         */
        Avengers avengers = new Avengers(
                List.of(
                        new IronMan(),
                        new Hulk(),
                        new Thor()
                )
        );

        /*
         * Relación con SOLID
         * ------------------
         * Aquí observamos Dependency Inversion Principle (D).
         *
         * Avengers recibe una lista de objetos que cumplen
         * el contrato Avenger.
         *
         * Gracias a esto, podemos agregar nuevos héroes
         * (como Thor) sin modificar la clase Avengers.
         */

        avengers.fight();

        /*
         * Pregunta para reflexionar:
         *
         * ¿Qué ocurriría si mañana agregamos
         * CaptainAmerica o BlackWidow?
         *
         * ¿Sería necesario modificar Avengers.java?
         */
    }
}
