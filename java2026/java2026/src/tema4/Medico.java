package tema4;

/**
 * Crear clase Medico
 * Propiedades:
 * - nombre
 * - especialidad (enum Especialidad ->
 *     GENERAL, DIGESTIVO, OTORRINO, CARDIOLOGIA, NEUROLOGIA, TRAUMATOLOGIA)
 * - edad
 * - email
 * - telefono
 * - estado (enum Estado -> ACTIVO, INACTIVO)
 *
 * Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
 * Getters de todo
 * Setters de todo menos 'estado'
 * ToString
 * Metodos propios:
 * - baja() -> pone el estado en INACTIVO
 * - alta() -> pone el estado en ACTIVO
 *
 * En un main crea dos médicos, pon uno de baja y pinta los dos
 */

public class Medico {

    //Propiedades de instacia
    private String nombre;
    private Especialidad especialidad;
    private Integer edad;
    private String email;
    private String telefono;
    private Estado estado;

    //Propiedades de clase
    public static Integer numMedicosAlta = 0;
    public static Integer numMedicosInactivos = 0;

    //Constructor
    public Medico(String nombre, String telefono, String email, Integer edad, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
        this.especialidad = especialidad;
        this.estado = Estado.ACTIVO;
        Medico.numMedicosAlta++;
    }

    public Medico(String nombre, Especialidad especialidad, Integer edad, String email, String telefono, Estado estado) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.estado = estado;
        Medico.numMedicosAlta++;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", especialidad=").append(especialidad);
        sb.append(", edad=").append(edad);
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    //Métodos propios
    public void baja() {
        if (this.estado != Estado.INACTIVO) {
            this.estado = Estado.INACTIVO;
            Medico.numMedicosInactivos++;
            Medico.numMedicosAlta--;
        }
    }
    public void alta() {
        if (this.estado != Estado.ACTIVO) {
            this.estado = Estado.ACTIVO;
            Medico.numMedicosInactivos--;
            Medico.numMedicosAlta++;
        }
    }


    public static void main(String[] args) {
        //String nombre, String telefono, String email, Integer edad, Especialidad especialidad
        Medico med1 = new Medico("Juan Martínez",
                "123456789",
                "juanmartinez@gmail.com",
                25,
                Especialidad.DIGESTIVO);

        Medico med2 = new Medico("Isabel García", "654658998", "isagarcia@gmail.com", 44,
                Especialidad.CARDIOLOGIA);

        med1.baja();
        med2.baja();
        med2.baja();
        med1.alta();
        med1.alta();


        System.out.println(med1);
        System.out.println(med2);

        System.out.println("Médicos en alta: " + Medico.numMedicosAlta);
        System.out.println("Médicos inactivos: " + Medico.numMedicosInactivos);
    }
}
