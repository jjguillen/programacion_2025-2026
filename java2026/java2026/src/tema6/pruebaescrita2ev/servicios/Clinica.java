package tema6.pruebaescrita2ev.servicios;

import tema6.pruebaescrita2ev.entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clinica {

    private String nombre;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Animal> animales;
    private ArrayList<Consulta> consultas;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.propietarios = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Añade un propietario a la clínica
     * @param p
     */
    public void addPropietario(Propietario p) {
        propietarios.add(p);
    }

    /**
     * Añade un animal a la clínica
     * @param a
     */
    public void addAnimal(Animal a){
        animales.add(a);
    }

    /**
     * Muestra todos los animales registrados con su estado actual
     */
    public void listarAnimales() {
        for(Animal a : animales) {
            IO.println("  Id: " + a.getId() + " - " + a.getNombre() + " - " + a.getTipo() + " - " + a.getRaza() + " - "
                    + a.getEstado());
        }
    }

    /**
     * Muestra todas las consultas cuya fecha sea la de hoy
     */
    public void listarConsultasDeHoy() {
        for(Consulta a : consultas) {
            if (a.getFecha().isEqual(LocalDate.now())) {
                IO.println(a.generarFactura());
            }
        }
    }

    /**
     * Busca y devuelve el propietario con ese DNI. Si no existe, lanza una excepción personalizada PropietarioNoEncontradoException
     * @param dni
     * @return
     */
    public Propietario buscarPropietarioPorDni(String dni) throws PropietarioNoEncontradoException {
        for(Propietario p : propietarios) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        throw new PropietarioNoEncontradoException("No se ha encontrado ningún propietario con el DNI: " + dni);
    }

    /**
     * Busca y devuelve el animal con ese id. Si no existe, lanza AnimalNoEncontradoException
     * @param id
     * @return
     */
    public Animal buscarAnimalPorId(Long id) throws AnimalNoEncontradoException {
        for(Animal a : animales) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        throw new AnimalNoEncontradoException("No se ha encontrado ningún animal con el ID: " + id);
    }


    /**
     * Busca el animal por id (usando buscarAnimalPorId), crea la consulta y la añade a la lista. Devuelve true si se
     * realizó correctamente. Captura las excepciones necesarias y devuelve false en caso de error.
     */
    public boolean registrarConsulta(Long idAnimal, String veterinario, LocalDate fecha, TipoConsulta tipo,
                                     String diagnostico, String tratamiento) {
        boolean respuesta = false;

        try {
            Animal animal = this.buscarAnimalPorId(idAnimal);
            Consulta nuevaConsulta = new Consulta(animal, veterinario, fecha, tipo, diagnostico, tratamiento);
            consultas.add(nuevaConsulta);
            respuesta = true;
        } catch (AnimalNoEncontradoException e) {
            IO.println(e.getMessage());
        }

        return respuesta;
    }

    /**
     * Devuelve todas las consultas de un animal
     * @param idAnimal
     * @return
     */
    public ArrayList<Consulta> buscarConsultasPorAnimal(Long idAnimal) {
        ArrayList<Consulta> resultado = new ArrayList<>();
        for(Consulta c : consultas) {
            if (c.getAnimal().getId().equals(idAnimal)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    /**
     * Devuelve todas las consultas del tipo indicado
     * @param tipo
     * @return
     */
    public ArrayList<Consulta> buscarConsultasPorTipo(TipoConsulta tipo) {
        ArrayList<Consulta> resultado = new ArrayList<>();
        for(Consulta c : consultas) {
            if (c.getTipo().equals(tipo)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    /**
     * Calcula el total de ingresos de la clínica sumando el precio total de todas las consultas
     * @return
     */
    public double calcularIngresosTotales() {
        double total = 0;
        for(Consulta c : consultas) {
            total += c.getPrecioTotal();
        }
        return total;
    }


}
