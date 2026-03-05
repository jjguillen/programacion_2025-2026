package tema6.pruebaescrita2ev.entidades;

import java.time.LocalDate;

public class AnimalDomestico extends Animal {

    private boolean castrado;
    private boolean tieneChip;

    public AnimalDomestico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso,
                           Propietario propietario, boolean castrado, boolean tieneChip) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.castrado = castrado;
        this.tieneChip = tieneChip;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalDomestico{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append(", castrado=").append(castrado);
        sb.append(", tieneChip=").append(tieneChip);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Aplica los siguientes precios base según el tipo de consulta: REVISION 20€, VACUNA 30€, CIRUGIA 150€,
     * URGENCIA 80€. Si el animal está castrado se aplica un descuento del 10% sobre el precio final.
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

        if (castrado) {
            precioBase *= 0.9; // Aplica un descuento del 10%
        }

        return precioBase;
    }
}
