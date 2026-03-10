package tema6.pruebaescrita2ev.entidades;

import java.time.LocalDate;

public class Consulta implements Facturable {

    private static long contadorId = 1; // Contador estático para generar IDs únicos

    private Long id; // (se genera automáticamente mediante un contador estático)
    private Animal animal;
    private String veterinario;
    private LocalDate fecha;
    private TipoConsulta tipo;
    private String diagnostico;
    private String tratamiento;
    private Double precioTotal;


    public Consulta(Animal animal, String veterinario, LocalDate fecha, TipoConsulta tipo, String diagnostico,
                    String tratamiento) {
        if (fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser anteriormente");
        }

        this.animal = animal;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipo = tipo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.id = contadorId++;
        this.precioTotal = animal.calcularCosteConsulta(tipo);
    }

    public Long getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consulta{");
        sb.append("id=").append(id);
        sb.append(", animal=").append(animal);
        sb.append(", veterinario='").append(veterinario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", tipo=").append(tipo);
        sb.append(", diagnostico='").append(diagnostico).append('\'');
        sb.append(", tratamiento='").append(tratamiento).append('\'');
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Genera un String con el resumen completo de la consulta: nombre del animal, propietario, veterinario, fecha,
     * tipo de consulta, diagnóstico, tratamiento y precio total
     * @return
     */
    @Override
    public String generarFactura() {
        StringBuffer sb = new StringBuffer("--- FACTURA CONSULTA ---\n");
        sb.append("ID Consulta: ").append(id).append("\n");
        sb.append("Animal: ").append(animal.getNombre()).append("\n");
        sb.append("Propietario: ").append(animal.getPropietario().getNombre()).append(" ")
                .append(animal.getPropietario().getApellidos()).append("\n");
        sb.append("Veterinario: ").append(veterinario).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Tipo de Consulta: ").append(tipo).append("\n");
        sb.append("Diagnóstico: ").append(diagnostico).append("\n");
        sb.append("Tratamiento: ").append(tratamiento).append("\n");
        sb.append("Precio Total: ").append(precioTotal).append("€\n");
        sb.append("---------------------------");
        return sb.toString();
    }
}
