# 🕸️ Enunciado: "Hackeo del Panel Criptográfico -- La Franja Exterior"

En un oscuro sector de la galaxia, las redes de información están
protegidas por paneles criptográficos casi indescifrables. Tu misión
como hacker es **descifrar el código secreto de un nodo controlado por
la Franja Exterior** antes de que la red te bloquee para siempre.

El panel funciona así:

-   El **código secreto** está compuesto por **5 símbolos**, elegidos de
    este conjunto:\
    `@  #  $  %  &  *`

-   Cada vez que introduces un intento, el sistema te devuelve
    **indicadores numéricos** para cada símbolo:  
    0 → Símbolo correcto y en la posición correcta  
    1 → Símbolo presente en el código pero en otra posición  
    2 → Símbolo no presente en el código  

```
<!-- Ejemplo -->
Código secreto:      [ @ , # , $ , % , & ]
Intento del jugador: [ @ , $ , * , % , # ]
Indicadores:         [ 0 , 1 , 2 , 0 , 1 ]
```

## Reglas del juego

1.  El programa genera un **código secreto de 5 símbolos** de forma
    aleatoria.
2.  El jugador tiene un número limitado de intentos (por ejemplo, 8)
    para adivinar la secuencia.
3.  Cada intento consiste en introducir **exactamente 5 símbolos** de
    los permitidos.
4.  Tras cada intento, el sistema muestra un **array de indicadores**
    correspondiente a cada símbolo del intento.
5.  Si el jugador descifra el código (todos los indicadores son `0`),
    desbloquea el nodo y gana.
6.  Si se acaban los intentos, el sistema revela el código secreto y el
    acceso es denegado.
7.  El juego debe usar **arrays** para almacenar el código secreto, los
    intentos y la evaluación.

## Observaciones
- Implementa validaciones para asegurar que los intentos del jugador
    contienen solo símbolos válidos y tienen la longitud correcta.
- Utiliza funciones para organizar el código, como generar el código
    secreto, evaluar los intentos y mostrar los resultados.



