package examples.isp;
/*
 * ============================================================
 * Archivo: SuperPowers.java
 * ============================================================
 *
 * Este ejemplo se utiliza únicamente para explicar
 * Interface Segregation Principle (I).
 *
 * La interfaz reúne capacidades que no todos los
 * superhéroes necesitan.
 *
 * Más adelante veremos cómo dividir este contrato
 * en interfaces más pequeñas y específicas.
 */

public interface SuperPowers {

    /*
     * Todo objeto que implemente esta interfaz
     * quedará obligado a implementar fly().
     */
    void fly();

    /*
     * También quedará obligado a implementar shootWeb().
     *
     * Aquí aparece el problema:
     * ¿Tiene sentido que Superman implemente shootWeb()?
     */
    void shootWeb();
}
