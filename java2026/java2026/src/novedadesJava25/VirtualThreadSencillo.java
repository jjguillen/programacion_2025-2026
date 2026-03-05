package novedadesJava25;

import java.time.LocalTime;
import java.util.Random;

public class VirtualThreadSencillo {
    static void main() throws InterruptedException {

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;

            Thread.startVirtualThread(() -> {
                try {
                    int sleepTime = 500 + random.nextInt(1500);

                    System.out.printf(
                            "[%s] 🚀 Inicio tarea %d (sleep %d ms)%n",
                            LocalTime.now(),
                            taskId,
                            sleepTime
                    );

                    Thread.sleep(sleepTime); // Simula I/O bloqueante

                    System.out.printf(
                            "[%s] ✅ Fin tarea %d en %s%n",
                            LocalTime.now(),
                            taskId,
                            Thread.currentThread()
                    );

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Esperamos un poco para que todas las tareas terminen
        Thread.sleep(3000);
        System.out.println("🎯 Todas las tareas lanzadas");

    }
}
