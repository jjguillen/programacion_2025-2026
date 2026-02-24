## Crea una clase genérica ColaMensajes de Notificables

Una cola es una estructura FIFO (First In First Out).

```java
class ColaMensaje<T extends Notificable> 
```

### Internamente será un ArrayList de tipo T.
### Métodos:
- insertar(T): añade un elemento al final de la lista.
- T sacar(): devuelve el elemento al principio de la lista y lo elimina.
- pintar(): imprime todas las notificaciones de la lista.

### Ejemplo main:
- Crea una Cola de Notificacion
- Añádeles varias notificaciones.
- Elimina algún elemento de la cola y vuelve a mostrar su contenido.
