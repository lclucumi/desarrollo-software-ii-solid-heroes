package examples.lsp;
/*
 * ============================================================
 * Archivo: SpiderMan.java
 * ============================================================
 *
 * SpiderMan hereda de FlyingHero.
 *
 * Relación con SOLID
 * ------------------
 * Este ejemplo nos ayuda a entender
 * Liskov Substitution Principle (L).
 *
 * Si SpiderMan no puede cumplir el comportamiento esperado
 * de FlyingHero, entonces esta herencia no representa
 * un buen diseño.
 */

public class Spiderman extends FlyingHero {

    /*
     * @Override indica que este método reemplaza
     * la implementación heredada de FlyingHero.
     */
    @Override
    public void fly() {

        /*
         * Spider-Man no puede volar.
         *
         * Si una parte del programa espera un FlyingHero
         * y recibe un SpiderMan, el comportamiento esperado
         * deja de cumplirse.
         */
        throw new UnsupportedOperationException(
                "Spider-Man no puede volar"
        );
    }
}
