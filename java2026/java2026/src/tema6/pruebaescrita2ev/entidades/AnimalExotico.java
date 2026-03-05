package tema6.pruebaescrita2ev.entidades;

import java.time.LocalDate;

public class AnimalExotico extends Animal {

    private String paisOrigen;
    private boolean requierePermisoCITES;

    public AnimalExotico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso,
                         Propietario propietario, String paisOrigen, boolean requierePermisoCITES) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.paisOrigen = paisOrigen;
        this.requierePermisoCITES = requierePermisoCITES;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public boolean isRequierePermisoCITES() {
        return requierePermisoCITES;
    }

    public void setRequierePermisoCITES(boolean requierePermisoCITES) {
        this.requierePermisoCITES = requierePermisoCITES;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalExotico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append(", paisOrigen='").append(paisOrigen).append('\'');
        sb.append(", requierePermisoCITES=").append(requierePermisoCITES);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Aplica los mismos precios base que AnimalDomestico, pero con un suplemento del 25% por ser animal exótico.
     * Si además requiere permiso CITES, se añaden 15€ fijos adicionales.
     * @param tipo
     * @return
     */
    @Override
    public double calcularCosteConsulta(TipoConsulta tipo) {
        double precioBase = 0;
        switch (tipo) {
            case REVISION -> precioBase = 20;
            case VACUNA -> precioBase = 30;
            case CIRUGIA -> precioBase = 150;
            case URGENCIA -> precioBase = 80;
        }

        precioBase *= 1.25; // Suplemento del 25% por ser animal exótico

        if (requierePermisoCITES) {
            precioBase += 15; // Añadir 15€ fijos adicionales si requiere permiso CITES
        }

        return precioBase;
    }


}
