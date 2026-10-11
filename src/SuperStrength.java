/*
 * ============================================================
 * Archivo: SuperStrength.java
 * ============================================================
 *
 * SuperStrength representa la habilidad de utilizar
 * superfuerza.
 *
 * Al igual que FlyAbility, esta clase implementa
 * el contrato Ability.
 *
 * ¿Dónde aparece SOLID?
 * ---------------------
 * Esta clase continúa aplicando:
 *
 * - Single Responsibility Principle (S), porque la lógica
 *   relacionada con la superfuerza se encuentra separada
 *   de la clase SuperHero.
 *
 * - Open/Closed Principle (O), porque podemos agregar
 *   nuevas habilidades creando nuevas implementaciones
 *   de Ability, sin modificar las existentes.
 */

public class SuperStrength implements Ability {

    /*
     * Implementación concreta de la habilidad
     * de utilizar superfuerza.
     */
    @Override
    public void use() {
        System.out.println("Superfuerza");
    }
}
