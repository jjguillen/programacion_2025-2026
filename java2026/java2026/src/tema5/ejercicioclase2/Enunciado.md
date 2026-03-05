# Sistema de Biblioteca Digital

## Clase base abstracta - ContenidoDigital
- Atributos: id, title, author, year, size
- Constructor con todo y constructor copia
- Getters y Setters
- toString
- equals por id
- Método abstracto String getTipo()
- Método abstracto void reproducir()

## Clase hija - AudioLibro
- Atributos extra: durationMins, narrator
- Implementa los métodos abstractos de ContenidoDigital
  - getTipo devuelve "AudioBook"
  - reproducir devuelve "Playing audio ..." y el título y narrador

## Clase hija - Ebook
- Atributos extra: numPages, ebookType
- Implementa los métodos abstractos de ContenidoDigital
  - getTipo devuelve "Ebook"
  - reproducir devuelve "Reading ebook ..." y el título y numPages
 

    