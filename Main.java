public class Main {
     public static void main(String[] args) {
        // Crear objetos de las clases derivadas
        Futbolista futbolista = new Futbolista(1, "Magico", "Gonzales", 35, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "Federación Española");
        Masajista masajista = new Masajista(3, "Carlos", "Zacapa", 40, "Fisioterapia", 15);

        // Demostrar polimorfismo y herencia
        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();

        futbolista.viajar();
        entrenador.viajar();
        masajista.viajar();

        // Métodos específicos
        futbolista.jugarPartido();
        entrenador.dirigirPartido();
        masajista.darMasaje();
    }
}
