/*
 * ============================================================
 * Archivo: FlyingHero.java
 * ============================================================
 *
 * Esta clase representa un héroe cuya característica principal
 * es que puede volar.
 *
 * En este punto del ejemplo todavía NO estamos mostrando
 * una buena solución de diseño.
 *
 * El objetivo es construir un escenario que nos permita
 * comprender el principio de Sustitución de Liskov (L)
 * mediante un ejemplo sencillo.
 *
 * Relación con SOLID
 * ------------------
 * Este archivo prepara el ejemplo para estudiar
 * Liskov Substitution Principle (L).
 *
 * En el siguiente paso crearemos una clase SpiderMan
 * que heredará de FlyingHero para analizar si realmente
 * esa sustitución tiene sentido.
 */

public class FlyingHero {

    /*
     * Este método representa el comportamiento esperado
     * de cualquier héroe que pueda volar.
     *
     * Más adelante veremos qué ocurre cuando una clase
     * hereda de FlyingHero, pero no puede cumplir
     * correctamente esta operación.
     */
    public void fly() {
        System.out.println("Volando");
    }
}
