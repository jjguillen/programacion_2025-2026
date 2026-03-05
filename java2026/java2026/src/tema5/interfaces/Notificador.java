package tema5.interfaces;

public interface Notificador {
    void notificarPorEmail(String mensaje, String destinatario);
    void notificarPorSMS(String mensaje, String destinatario);
}
