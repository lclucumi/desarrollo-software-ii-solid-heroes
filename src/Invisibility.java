/*
 * ============================================================
 * Archivo: Invisibility.java
 * ============================================================
 *
 * Invisibility representa una nueva habilidad que puede
 * tener un superhéroe.
 *
 * Al igual que FlyAbility y SuperStrength, esta clase
 * implementa el contrato Ability.
 *
 * Relación con SOLID
 * ------------------
 * Aquí aplicamos Open/Closed Principle (O).
 *
 * En lugar de modificar las clases que ya existían,
 * agregamos una nueva implementación del contrato Ability.
 *
 * Esto permite extender el comportamiento del sistema
 * sin modificar las implementaciones que ya estaban
 * funcionando correctamente.
 */

public class Invisibility implements Ability {

    /*
     * @Override indica que este método implementa
     * el método use() definido en la interfaz Ability.
     *
     * Cada habilidad implementa este método de manera
     * diferente según el comportamiento que representa.
     */
    @Override
    public void use() {
        System.out.println("Invisibilidad");
    }
}