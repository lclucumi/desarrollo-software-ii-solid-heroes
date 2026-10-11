import java.util.List;

/*
 * ============================================================
 * Archivo: Avengers.java
 * ============================================================
 *
 * Avengers representa un equipo formado por varios superhéroes.
 *
 * Esta clase NO crea directamente a IronMan, Hulk o cualquier
 * otro héroe. En su lugar, recibe una lista de objetos que
 * cumplen el contrato Avenger.
 *
 * Relación con SOLID
 * ------------------
 * Aquí aplicamos Dependency Inversion Principle (D).
 *
 * Avengers no depende de implementaciones concretas como
 * IronMan o Hulk. Depende de la abstracción Avenger,
 * lo que permite incorporar nuevos miembros al equipo
 * sin modificar esta clase.
 */

public class Avengers {

    /*
     * List representa una colección de elementos.
     *
     * En este caso, la lista almacenará objetos que cumplen
     * el contrato Avenger.
     *
     * final indica que, una vez inicializada esta referencia,
     * no será reemplazada por otra lista diferente.
     */
    private final List<Avenger> members;

    /*
     * El constructor recibe la lista de miembros que harán
     * parte del equipo.
     *
     * De esta forma, Avengers no necesita crear los objetos;
     * simplemente los utiliza.
     */
    public Avengers(List<Avenger> members) {
        this.members = members;
    }

    /*
     * Recorre todos los miembros del equipo y les pide luchar.
     *
     * Este tipo de ciclo se conoce como "for-each".
     *
     * En cada iteración, la variable member representa uno de
     * los elementos almacenados en la lista members.
     */
    public void fight() {

        for (Avenger member : members) {

            /*
             * No importa si member es IronMan, Hulk, Thor
             * o cualquier otra clase que implemente Avenger.
             *
             * Todas ofrecen el método fight(), por lo que
             * Avengers puede utilizarlo sin conocer la clase
             * concreta del objeto.
             */
            member.fight();
        }
    }
}
