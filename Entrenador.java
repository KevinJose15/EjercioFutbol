public class Entrenador extends Personal {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    // Getter y Setter
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Métodos específicos
    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo un entrenamiento.");
    }
}
