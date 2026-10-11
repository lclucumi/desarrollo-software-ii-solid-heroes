/*
 * ============================================================
 * Archivo: WebShooter.java
 * ============================================================
 *
 * WebShooter representa el contrato para todos los objetos
 * que tienen la capacidad de lanzar telarañas.
 *
 * ¿Dónde aparece SOLID?
 * ---------------------
 * Aquí continuamos aplicando
 * Interface Segregation Principle (I).
 *
 * En lugar de obligar a todos los superhéroes a implementar
 * las mismas operaciones, cada interfaz representa una
 * capacidad específica.
 */

public interface WebShooter {

    /*
     * Todo objeto que implemente WebShooter
     * deberá proporcionar una forma de lanzar telarañas.
     */
    void shootWeb();
}
