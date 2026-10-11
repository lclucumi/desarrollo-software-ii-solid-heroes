/*
 * ============================================================
 * Archivo: IronMan.java
 * ============================================================
 *
 * IronMan representa una implementación concreta del contrato
 * Avenger.
 *
 * Al implementar la interfaz Avenger, IronMan se compromete
 * a proporcionar su propia forma de luchar.
 *
 * Relación con SOLID
 * ------------------
 * Este archivo hace parte de la aplicación de
 * Dependency Inversion Principle (D).
 *
 * La clase Avengers no dependerá directamente de IronMan,
 * sino del contrato Avenger.
 *
 * Gracias a esto, en el futuro será posible incorporar
 * nuevos miembros al equipo sin modificar la clase Avengers.
 */

public class IronMan implements Avenger {

    /*
     * @Override indica que este método implementa
     * el método fight() definido en la interfaz Avenger.
     *
     * Aunque todos los Avengers implementan el mismo método,
     * cada uno puede definir su propio comportamiento.
     */
    @Override
    public void fight() {
        System.out.println("Iron Man pelea");
    }
}
