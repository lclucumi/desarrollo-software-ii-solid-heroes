
/*
 * ============================================================
 * Archivo: Avenger.java
 * ============================================================
 *
 * Avenger representa el contrato común para todos los miembros
 * que pueden formar parte del equipo de los Avengers.
 *
 * Una interfaz define QUÉ debe poder hacer un objeto,
 * pero no CÓMO debe hacerlo.
 *
 * En este caso, cualquier clase que implemente esta interfaz
 * deberá proporcionar su propia forma de luchar.
 *
 * Relación con SOLID
 * ------------------
 * Este archivo comienza a introducir el principio
 * Dependency Inversion Principle (D).
 *
 * Más adelante veremos que la clase Avengers dependerá
 * de este contrato (Avenger) y no de implementaciones
 * concretas como IronMan o Hulk.
 */

public interface Avenger {

    /*
     * Todo miembro de los Avengers debe poder luchar.
     *
     * Cada implementación decidirá cómo realizar esa acción.
     */
    void fight();
}

