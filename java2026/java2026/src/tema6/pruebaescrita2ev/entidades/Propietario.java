package tema6.pruebaescrita2ev.entidades;

import java.util.ArrayList;

public class Propietario extends Persona {

    private String direccion;
    private ArrayList<Animal> animales;

    public Propietario(String nombre, String apellidos, String dni, String email, String telefono, String direccion) {
        super(nombre, apellidos, dni, email, telefono);
        this.direccion = direccion;
        this.animales = new ArrayList<>();
    }

    public Propietario(Propietario propietario) {
        super(propietario.getNombre(), propietario.getApellidos(), propietario.getDni(), propietario.getEmail(), propietario.getTelefono());
        this.direccion = propietario.getDireccion();
        this.animales = new ArrayList<>(propietario.getAnimales());
        //this.animales = propietario.getAnimales(); //MAL
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propietario{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", animales=").append(animales.size());
        sb.append('}');
        return sb.toString();
    }

    /**
     * Añade un animal a la lista del propietario.
     * @param a
     */
    public void addAnimal(Animal a) {
        animales.add(a);
    }

}
