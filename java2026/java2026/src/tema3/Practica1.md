# Ejercicios Unidad 3 - Estructuras de almacenamiento
## EJERCICIOS - Arrays y Matrices 

---

### Nivel básico (1-4): Operaciones fundamentales 

**1. Estadísticas básicas**
* Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el menor valor.
* **Requisito:** Usar un array para almacenar los valores e implementar una función para cada tarea (media, mayor, menor), pasando el array como parámetro.

**2. Contar positivos y negativos**
* Programa Java que guarda en un array 20 números enteros generados aleatoriamente entre -100 y 100.
* A continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.

**3. Orden alterno**
* Generar 10 números enteros aleatorios.
* Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el penúltimo, el tercero, etc..
* **Pista:** Primero los guardas en un array y luego lo recorres como se indica.

**4. Intercambio de extremos**
* Crea una función que reciba como parámetro un array de 10 enteros y devuelva el mismo array donde se hayan intercambiado el primer elemento y el último elemento.

---

### Nivel intermedio (5-8): Búsqueda y filtrado 

**5. Alturas**
* Programa Java para leer la altura de $N$ personas y calcular la altura media.
* Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
* El valor de $N$ se pide por teclado y debe ser entero positivo.

**6. Filtrado por dígito final**
* Crea un array de números de un tamaño pasado por teclado; el array contendrá números aleatorios entre 1 y 300.
* Mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar que se introduce un número correcto).
* **Ejemplo:** En un array de 10 posiciones, indicando mostrar los números acabados en 5, podría salir 155, 25, etc..

**7. Eliminar elemento**
* Genera aleatoriamente un array de 10 elementos numéricos enteros. Luego pide por teclado una posición (entre 0 y 9).
* Eliminar el elemento situado en la posición dada sin dejar huecos.

**8. Contador de apariciones**
* Crea un programa que genere un array de 15 números aleatorios entre 1 y 100.
* A continuación, crea una función que reciba el array y un número objetivo, y devuelva cuántas veces aparece ese número en el array.

---

### Nivel avanzado (9-11): Manipulación y ordenación 

**9. Desplazamiento circular**
* Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace $N$ posiciones hacia la derecha ($N$ es un número introducido por el usuario).
* El desplazamiento es circular: los elementos que salen por la derecha entran por la izquierda.

**10. Clasificación de corredores**
* Realizar un programa que lea los tiempos en los que 10 corredores han acabado una carrera.
* El programa debe determinar qué corredores tienen el primer, segundo y último puesto, así como cuál es el tiempo medio en que se ha corrido la carrera.
* **Pista:** ordenarlo antes.

**11. Lotería Primitiva**
* Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
* La particularidad es que los números no deben estar repetidos.

---

### Nivel básico (12-15): Creación y recorrido de matrices 

**12. Matriz diagonal**
* Crear una tabla bidimensional de tamaño $5\times5$ y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0. Mostrarla.

**13. Matriz marco**
* Crear una matriz "marco" de tamaño $8\times6$. Una matriz "marco" es aquella en la que todos sus elementos son 0 salvo los de los bordes que deben ser 1. Mostrarla.

**14. Suma de filas**
* Crear una tabla bidimensional de tamaño $4\times5$ de números enteros (leídos desde teclado).
* Mostrar la matriz y la suma de los valores de cada fila.

**15. Estadísticas de matriz**
* Crear una matriz $5\times3$ de números enteros aleatorios (entre 1 y 100) y mostrar el menor, el mayor y la media de los elementos.

---

### Nivel intermedio (16-18): Operaciones con matrices 

**16. Suma de matrices**
* Crear dos matrices $3\times3$ de números enteros (generadas aleatoriamente entre 1 y 50), pintarlas, sumarlas y mostrar su suma.
* El resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras matrices en la misma posición.

**17. Matriz sin repetidos**
* Crea una matriz de $4\times5$ números enteros aleatorios no repetidos (entre 1 y 50).

**18. Hoja de cálculo**
* Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben introducir en un array de 4 filas por 5 columnas.
* El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
* La suma total debe aparecer en la esquina inferior derecha.

---

### Nivel avanzado (19-20): Transformaciones complejas 

**19. Matriz traspuesta**
* Crea un método que dada una determinada matriz de dimensiones $n \times m$ devuelva su matriz traspuesta (dimensiones $m \times n$).

**20. Ordenar matrices**
* Crea una matriz de enteros de dos dimensiones de $10\times10$ elementos, rellénala con números aleatorios entre 1 y 100.
* A continuación, realiza dos funciones:
    * **ordenaFilas(matriz):** que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a mayor.
    * **ordenaColumnas(matriz):** que ordene la matriz por columnas, cada columna quedará ordenada de menor a mayor, independientemente de las demás.

**21. Implementación de una Pila**
* Implementación de una Pila con un vector de 20 elementos.
* Una Pila se basa en el concepto "Primero en entrar, Último en salir" (LIFO).
* Implementa métodos para:
    * Crear una pila vacía.
    * Insertar elemento (*push*).
    * Sacar elemento (*pop* - lo muestra y lo quita).
    * Comprobar si la pila está llena.

---
