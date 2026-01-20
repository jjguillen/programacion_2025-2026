package tema5.ejercicios.ejercicioclase.expediente;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class Expediente {

    private static Integer totalAlumnado = 0;

    private final Integer id = (++totalAlumnado + 10000);
    private String nombre;
    private String apellidos;
    private Sexo sexo;
    private LocalDate fechaNacimiento;
    private Integer curso;
    private ArrayList<NotasCurso> calificaciones;

    public Expediente(String nombre, String apellidos, Sexo sexo, LocalDate fechaNacimiento, Integer curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.calificaciones = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Integer getCurso() {
        return curso;
    }

    public ArrayList<NotasCurso> getCalificaciones() {
        return calificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", curso=").append(curso);
        sb.append(", calificaciones=").append('\n');
        for(NotasCurso n : calificaciones)
            sb.append(n).append('\n');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }

    //----------------------------------------------------------
    public Integer getEdad() {
        //return LocalDate.now().getYear() - fechaNacimiento.getYear();
        return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }







}
