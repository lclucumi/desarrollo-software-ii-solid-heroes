/*
 * ============================================================
 * Archivo: Hulk.java
 * ============================================================
 *
 * Hulk representa una implementación concreta del contrato
 * Avenger.
 *
 * Al implementar la interfaz Avenger, Hulk se compromete
 * a proporcionar su propia forma de luchar.
 *
 * Relación con SOLID
 * ------------------
 * Este archivo hace parte de la aplicación de
 * Dependency Inversion Principle (D).
 *
 * Avengers no dependerá directamente de Hulk,
 * sino del contrato Avenger.
 * Gracias a esto, Hulk podrá ser incorporado
 * al equipo sin modificar la clase Avengers.
 */

public class Hulk implements Avenger {

    /*
     * @Override indica que este método implementa
     * el método fight() definido en la interfaz Avenger.
     *
     * Cada clase que implemente Avenger podrá definir
     * su propia forma de luchar.
     */
    @Override
    public void fight() {
        System.out.println("Hulk pelea");
    }
}
