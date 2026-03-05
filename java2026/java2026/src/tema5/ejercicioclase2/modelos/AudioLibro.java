package tema5.ejercicioclase2.modelos;

public class AudioLibro extends ContenidoDigital {

    private Integer durationMins;
    private String narrator;

    public AudioLibro(String title, String author, Integer year, Integer size, Integer durationMins, String narrator) {
        super(title, author, year, size);
        this.durationMins = durationMins;
        this.narrator = narrator;
    }

    public AudioLibro(AudioLibro otro) {
        super(otro);
        this.durationMins = otro.durationMins;
        this.narrator = otro.narrator;
    }

    public Integer getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(Integer durationMins) {
        this.durationMins = durationMins;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AudioLibro{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append(", durationMins=").append(durationMins);
        sb.append(", narrator='").append(narrator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "AudioBook";
    }

    @Override
    public void reproducir() {
        IO.println("Playing audio ... " + this.title + " by " + this.author);
    }


}
