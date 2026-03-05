package novedadesJava25;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Executors;

public class VirtualThread {

    /**
     *  La clase Thread creaba un nuevo hilo asociado a un hilo de ejecución
     *  del Sistema Operativo
     *  La nueva clase VirtualThread hace hilos virtuales en la JVM. Puedes
     *  crear miles de hilos virtuales y no saturar el SO ni la máquina
     */


    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 20; i++) {
                executor.submit(() -> {
                    try {
                        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("http://species-in-pieces.com/"))
                                .build();

                        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                        System.out.println("Request completado " + response.statusCode());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
        }
    }
}
