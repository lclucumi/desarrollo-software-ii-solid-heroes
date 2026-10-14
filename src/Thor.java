
/*
 * ============================================================
 * Archivo: Thor.java
 * ============================================================
 *
 * Thor representa un nuevo miembro del equipo de Avengers.
 *
 * ¿Dónde aparece SOLID?
 * ---------------------
 * Este archivo nos permite comprobar Dependency Inversion
 * Principle (D).
 *
 * Para agregar un nuevo héroe no fue necesario modificar
 * Avengers.java. Bastó con crear una nueva implementación
 * del contrato Avenger.
 */

public class Thor implements Avenger {

    /*
     * Cada miembro del equipo define
     * su propia forma de luchar.
     */
    @Override
    public void fight() {
        System.out.println("Thor pelea");
    }

}
