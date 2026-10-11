package examples.isp;
/*
 * ============================================================
 * Archivo: Flyable.java
 * ============================================================
 *
 * Flyable representa el contrato para todos los objetos
 * que tienen la capacidad de volar.
 *
 * Esta interfaz surge después de identificar que una interfaz
 * demasiado grande puede obligar a una clase a depender de
 * operaciones que realmente no necesita.
 *
 * Relación con SOLID
 * ------------------
 * Aquí aplicamos Interface Segregation Principle (I).
 *
 * En lugar de tener una única interfaz con muchas operaciones,
 * se crean interfaces más pequeñas y enfocadas en una capacidad
 * específica.
 */

public interface Flyable {

    /*
     * Todo objeto que implemente Flyable
     * debe proporcionar una forma de volar.
     *
     * La implementación concreta se definirá
     * en las clases que implementen esta interfaz.
     */
    void fly();
}
