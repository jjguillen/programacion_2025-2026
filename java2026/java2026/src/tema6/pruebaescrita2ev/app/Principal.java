package tema6.pruebaescrita2ev.app;

import tema6.pruebaescrita2ev.entidades.*;
import tema6.pruebaescrita2ev.servicios.AnimalNoEncontradoException;
import tema6.pruebaescrita2ev.servicios.Clinica;

import java.time.LocalDate;
import java.util.List;

public class Principal {

    private static void pintarMenu(String nombre) {
        IO.println("--- " + nombre + " ---");
        IO.println("1. Listar animales registrados");
        IO.println("2. Buscar propietario por DNI");
        IO.println("3. Registrar consulta");
        IO.println("4. Ver consultas de un animal");
        IO.println("5. Ver consultas de hoy");
        IO.println("6. Calcular ingresos totales");
        IO.println("7. Salir");
        IO.print("--- Seleccione una opción: ");
    }

    private static void registrarConsulta(Clinica clinica) {
        IO.println("Introduce id del animal: ");
        Long idAnimal = 0L;
        try {
            idAnimal = Long.parseLong(IO.readln());
        } catch (NumberFormatException e) {
            IO.println("ID no válido");
            return;
        }

        Animal animal = null;
        try {
            animal = clinica.buscarAnimalPorId(idAnimal);
        } catch (AnimalNoEncontradoException e) {
            IO.println(e.getMessage());
            return;
        }

        IO.println("Introduce nombre del veterinario: ");
        String veterinario = IO.readln();

        IO.println("Introduce tipo de consulta (1. Revisiones, 2. Vacunación, 3. Cirugía, 4. Urgencias): ");
        int tipoInt = Integer.parseInt(IO.readln());
        TipoConsulta tipoConsulta = switch (tipoInt) {
            case 1 -> TipoConsulta.REVISION;
            case 2 -> TipoConsulta.VACUNA;
            case 3 -> TipoConsulta.CIRUGIA;
            case 4 -> TipoConsulta.URGENCIA;
            default -> throw new IllegalArgumentException("Tipo de consulta no válido");
        };

        IO.println("Introduce diagnóstico: ");
        String diagnostico = IO.readln();

        IO.println("Introduce tratamiento: ");
        String tratamiento = IO.readln();

        try {
            clinica.registrarConsulta(idAnimal, veterinario, LocalDate.now(), tipoConsulta, diagnostico, tratamiento);
            IO.println("Consulta registrada con éxito");
        } catch (Exception e) {
            IO.println("Error al registrar consulta: " + e.getMessage());
        }
    }

    static void main() {

        /**
         * Crea una clínica veterinaria y realiza las siguientes acciones:
         * Añade al menos 4 propietarios con sus datos
         * Añade al menos 8 animales (mezcla de AnimalDomestico y AnimalExotico) asociados a sus propietarios
         */

        Clinica clinica = new Clinica("Clínica Veterinaria Wakanda");

        Propietario prop1 = new Propietario("Juan", "Pérez", "49498888A", "juanp@gmail.com", "600123456", "Calle Falsa 123");
        Propietario prop2 = new Propietario("María", "García", "49498888B", "mariag@gmail.com", "600654321", "Avenida Siempre Viva 456");
        Propietario prop3 = new Propietario("Carlos", "López", "49498888C", "carlosl@gmail.com", "600987654", "Calle Real 789");
        Propietario prop4 = new Propietario("Ana", "Martínez", "49498888D", "anam@gmail.com", "600321654", "Avenida Central 321");

        clinica.addPropietario(prop1);
        clinica.addPropietario(prop2);
        clinica.addPropietario(prop3);
        clinica.addPropietario(prop4);

        AnimalDomestico ad1 = new AnimalDomestico("Rita", TipoAnimal.PERRO, "Teckel",
                LocalDate.of(2024,3,10), 10.5, prop1, true, true);
        AnimalDomestico ad2 = new AnimalDomestico("Mia", TipoAnimal.GATO, "Siames",
                LocalDate.of(2023,5,20), 4.2, prop2, true, false);
        AnimalDomestico ad3 = new AnimalDomestico("Luna", TipoAnimal.AVE, "Canario",
                LocalDate.of(2022,8,15), 0.3, prop3, false, true);
        AnimalDomestico ad4 = new AnimalDomestico("Max", TipoAnimal.REPTIL, "Iguana",
                LocalDate.of(2021,12,5), 2.0, prop4, false, false);

        clinica.addAnimal(ad1);
        clinica.addAnimal(ad2);
        clinica.addAnimal(ad3);
        clinica.addAnimal(ad4);

        AnimalExotico ae1 = new AnimalExotico("Kiki", TipoAnimal.AVE, "Loro",
                LocalDate.of(2020,4,25), 0.5, prop1, "Brasil", true);
        AnimalExotico ae2 = new AnimalExotico("Zazu", TipoAnimal.AVE, "Guacamayo",
                LocalDate.of(2019,6,30), 1.0, prop2, "Colombia", false);
        AnimalExotico ae3 = new AnimalExotico("Rango", TipoAnimal.REPTIL, "Camaleón",
                LocalDate.of(2021,9,10), 0.8, prop3, "Madagascar", true);
        AnimalExotico ae4 = new AnimalExotico("Invi", TipoAnimal.REPTIL, "Gecko",
                LocalDate.of(2022,11,20), 0.2, prop4, "Australia", false);

        clinica.addAnimal(ae1);
        clinica.addAnimal(ae2);
        clinica.addAnimal(ae3);
        clinica.addAnimal(ae4);

        int opcion = 0;
        do {
            pintarMenu(clinica.getNombre());
            opcion = Integer.parseInt(IO.readln());

            switch (opcion) {
                case 1 -> clinica.listarAnimales();
                case 2 ->  {
                    IO.println("Introduce DNI del propietario: ");
                    String dni = IO.readln();
                    try {
                        Propietario p = clinica.buscarPropietarioPorDni(dni);
                        IO.println("Propietario encontrado: " + p.getNombre() + " " + p.getApellidos());
                        IO.println("Animales asociados:");
                        for (Animal a : p.getAnimales()) {
                            IO.println(a.getNombre() + " - " + a.getRaza());
                        }
                    } catch (Exception e) {
                        IO.println(e.getMessage());
                    }
                }
                case 3 -> registrarConsulta(clinica);
                case 4 -> {
                    IO.println("Introduce id del animal: ");
                    try {
                        Long idAnimal = Long.parseLong(IO.readln());
                        List<Consulta> consultas = clinica.buscarConsultasPorAnimal(idAnimal);
                        for (Consulta cons : consultas) {
                            IO.println(cons.generarFactura());
                        }
                    } catch (Exception e) {
                        IO.println("ID incorrecto: " + e.getMessage());
                    }
                }
                case 5 -> clinica.listarConsultasDeHoy();
                case 6 -> IO.println("Ingresos totales: " + clinica.calcularIngresosTotales() + "€");
                case 7 -> IO.println("Saliendo...");
                default -> IO.println("Opción no válida");
            }
        } while (opcion != 7);



    }
}
