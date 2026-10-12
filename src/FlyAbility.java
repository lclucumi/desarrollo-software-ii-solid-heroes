
/*
 * ============================================================
 * Archivo: FlyAbility.java
 * ============================================================
 *
 * FlyAbility representa la habilidad de volar.
 *
 * Relación con SOLID
 * ------------------
 * Esta clase continúa aplicando:
 *
 * - Single Responsibility Principle (S), porque la lógica
 *   relacionada con el vuelo se encuentra separada de la clase
 *   SuperHero.
 *
 * - Open/Closed Principle (O), porque agregar una nueva habilidad
 *   no requiere modificar esta clase; basta con crear otra clase
 *   que implemente el mismo contrato (Ability).
 */

public class FlyAbility implements Ability {

    /*
     * implements indica que esta clase se compromete
     * a cumplir el contrato definido por la interfaz Ability.
     *
     * En otras palabras, FlyAbility debe implementar
     * todos los métodos declarados en Ability.
     */

    /*
     * @Override es una anotación que indica que este método
     * está implementando el método declarado en la interfaz
     * Ability.
     *
     * Esta anotación ayuda a Java a detectar errores.
     * Por ejemplo, si el método se llamara "uses()" en lugar
     * de "use()", el compilador generaría un error porque ya
     * no estaría cumpliendo correctamente el contrato.
     */
    @Override
    public void use() {

        /*
         * Esta es la implementación concreta de la habilidad.
         *
         * Mientras Ability define QUÉ debe poder hacer una
         * habilidad, FlyAbility define CÓMO se realiza esa
         * acción.
         */
        System.out.println("Volando");
    }
}