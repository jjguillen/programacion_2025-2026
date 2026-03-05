package tema6.pruebaescrita2ev.entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Animal {

    private static long contadorId = 1; // Contador estático para generar IDs únicos

    protected Long id; // (se genera automáticamente con un contador estático)
    protected String nombre;
    protected TipoAnimal tipo;
    protected String raza;
    protected LocalDate fechaNacimiento;
    protected double peso;
    protected EstadoAnimal estado; // (se inicializa a ALTA por defecto)
    protected Propietario propietario;

    public Animal(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso, Propietario propietario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.propietario = propietario;
        this.propietario.addAnimal(this);
        this.id = contadorId++;
        this.estado = EstadoAnimal.ALTA; // Inicializar el estado a ALTA por defecto
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Coste de la consulta: se calcula en función del tipo de consulta y del tipo de animal.
     * Cada combinación de tipo de consulta y tipo de animal tiene un coste específico.
     * @param tipo
     * @return
     */
    public abstract double calcularCosteConsulta(TipoConsulta tipo);


    /**
     * calcula y devuelve la edad del animal en años a partir de fechaNacimiento
     * @return
     */
    public long getEdadAnios() {
        return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        //return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }



}
