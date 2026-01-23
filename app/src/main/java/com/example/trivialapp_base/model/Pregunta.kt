package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(
            Pregunta("¿Campeón mundial fútbol 2010?", "Deportes", "Facil", "Brasil", "Alemania", "España", "Italia", "España"),
            Pregunta("¿Rey de los dioses griegos?", "Mitología", "Facil", "Zeus", "Hades", "Poseidón", "Ares", "Zeus"),
            Pregunta("¿Hueso más largo del cuerpo?", "Anatomía", "Medio", "Fémur", "Tibia", "Húmero", "Radio", "Fémur"),
            Pregunta("¿Capital de Francia?", "Geografía", "Facil", "Madrid", "París", "Berlin", "Roma", "París"),
            Pregunta("¿Fórmula del agua?", "Ciencia", "Facil", "H2O", "CO2", "O2", "H2O2", "H2O"),
            Pregunta("¿Autor del Quijote?", "Literatura", "Facil", "Cervantes", "Quevedo", "Lope", "Góngora", "Cervantes"),
            Pregunta("¿Rey de los dioses griegos?", "Mitología", "Facil", "Zeus", "Hades", "Poseidón", "Ares", "Zeus"),
            Pregunta("¿Capital de España?", "Geografía", "Facil", "Barcelona", "Madrid", "Sevilla", "Valencia", "Madrid"),
            Pregunta("¿Color del caballo blanco de Santiago?", "Cultura", "Facil", "Negro", "Blanco", "Marrón", "Gris", "Blanco"),
            Pregunta("¿Cuántos días tiene una semana?", "General", "Facil", "5", "6", "7", "8", "7"),
            Pregunta("¿Animal que dice miau?", "General", "Facil", "Perro", "Vaca", "Gato", "Caballo", "Gato"),
            Pregunta("¿Planeta donde vivimos?", "Ciencia", "Facil", "Marte", "Venus", "Tierra", "Júpiter", "Tierra"),
            Pregunta("¿Idioma hablado en Brasil?", "Geografía", "Facil", "Español", "Portugués", "Francés", "Inglés", "Portugués"),
            Pregunta("¿Resultado de 2+2?", "Matemáticas", "Facil", "3", "4", "5", "6", "4"),
            Pregunta("¿Capital de Italia?", "Geografía", "Facil", "Milán", "Roma", "Venecia", "Nápoles", "Roma"),
            Pregunta("¿Mes después de enero?", "General", "Facil", "Febrero", "Marzo", "Diciembre", "Abril", "Febrero"),
            Pregunta("¿Instrumento con teclas?", "Música", "Facil", "Guitarra", "Piano", "Violín", "Flauta", "Piano"),
            Pregunta("¿Animal más grande del mundo?", "Naturaleza", "Facil", "Elefante", "Ballena azul", "Tiburón", "Jirafa", "Ballena azul"),
            Pregunta("¿Forma de una rueda?", "General", "Facil", "Cuadrada", "Circular", "Triangular", "Rectangular", "Circular"),
            Pregunta("¿Capital de Alemania?", "Geografía", "Facil", "Berlín", "Múnich", "Hamburgo", "Frankfurt", "Berlín"),
            Pregunta("¿Estación más fría?", "General", "Facil", "Verano", "Otoño", "Invierno", "Primavera", "Invierno"),
            Pregunta("¿Cuántas patas tiene una araña?", "Biología", "Facil", "6", "8", "10", "12", "8"),
            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Medio", "Picasso", "Van Gogh", "Da Vinci", "Dalí", "Da Vinci"),
            Pregunta("¿Planeta más grande?", "Ciencia", "Medio", "Tierra", "Marte", "Júpiter", "Saturno", "Júpiter"),
            Pregunta("¿Año descubrimiento América?", "Historia", "Medio", "1492", "1500", "1485", "1992", "1492"),
            Pregunta("¿Moneda de Japón?", "Economía", "Medio", "Yuan", "Won", "Yen", "Dólar", "Yen"),
            Pregunta("¿Hueso más largo del cuerpo?", "Anatomía", "Medio", "Fémur", "Tibia", "Húmero", "Radio", "Fémur"),
            Pregunta("¿Río más largo del mundo?", "Geografía", "Medio", "Amazonas", "Nilo", "Yangtsé", "Misisipi", "Amazonas"),
            Pregunta("¿Autor de Harry Potter?", "Literatura", "Medio", "Tolkien", "Rowling", "Lewis", "King", "Rowling"),
            Pregunta("¿Capital de Canadá?", "Geografía", "Medio", "Toronto", "Vancouver", "Ottawa", "Montreal", "Ottawa"),
            Pregunta("¿Metal líquido a temperatura ambiente?", "Química", "Medio", "Hierro", "Mercurio", "Plomo", "Aluminio", "Mercurio"),
            Pregunta("¿País con más población?", "Geografía", "Medio", "EEUU", "India", "China", "Rusia", "India"),
            Pregunta("¿Sistema operativo de Google?", "Tecnología", "Medio", "iOS", "Windows", "Android", "Linux", "Android"),
            Pregunta("¿Lenguaje más usado en Android?", "Programación", "Medio", "Java", "Swift", "Kotlin", "C++", "Kotlin"),
            Pregunta("¿Capital de Australia?", "Geografía", "Medio", "Sídney", "Melbourne", "Canberra", "Perth", "Canberra"),
            Pregunta("¿Número de continentes?", "Geografía", "Medio", "5", "6", "7", "8", "7"),
            Pregunta("¿Autor de La Odisea?", "Literatura", "Medio", "Homero", "Sófocles", "Platón", "Aristóteles", "Homero"),
            Pregunta("¿Gas más abundante en la atmósfera?", "Ciencia", "Medio", "Oxígeno", "Nitrógeno", "CO2", "Hidrógeno", "Nitrógeno"),
            Pregunta("¿Capital de Argentina?", "Geografía", "Medio", "Córdoba", "Rosario", "Buenos Aires", "Mendoza", "Buenos Aires"),
            Pregunta("¿Año llegada del hombre a la Luna?", "Historia", "Medio", "1965", "1969", "1972", "1980", "1969"),
            Pregunta("¿Océano más grande?", "Geografía", "Medio", "Atlántico", "Índico", "Pacífico", "Ártico", "Pacífico"),
            Pregunta("¿Número atómico del oxígeno?", "Química", "Medio", "6", "8", "10", "12", "8"),
            Pregunta("¿Elemento químico Au?", "Química", "Dificil", "Plata", "Oro", "Cobre", "Aluminio", "Oro"),
            Pregunta("¿Velocidad de la luz?", "Física", "Dificil", "300.000 km/s", "150.000 km/s", "1000 km/s", "Mach 1", "300.000 km/s"),
            Pregunta("¿Autor de La República?", "Filosofía", "Dificil", "Aristóteles", "Sócrates", "Platón", "Descartes", "Platón"),
            Pregunta("¿Capital de Mongolia?", "Geografía", "Dificil", "Astana", "Ulan Bator", "Taskent", "Bishkek", "Ulan Bator"),
            Pregunta("¿Año caída del Imperio Romano?", "Historia", "Dificil", "395", "410", "476", "500", "476"),
            Pregunta("¿Constante de Planck?", "Física", "Dificil", "6.63×10⁻³⁴", "9.8", "3×10⁸", "1.6×10⁻¹⁹", "6.63×10⁻³⁴"),
            Pregunta("¿Lenguaje compilado por la JVM?", "Programación", "Dificil", "Swift", "Kotlin", "Python", "JavaScript", "Kotlin"),
            Pregunta("¿Número de huesos del cuerpo humano adulto?", "Anatomía", "Dificil", "200", "206", "210", "215", "206"),
            Pregunta("¿Autor de Crimen y Castigo?", "Literatura", "Dificil", "Tolstói", "Dostoievski", "Kafka", "Chejov", "Dostoievski"),
            Pregunta("¿Capital de Sri Lanka?", "Geografía", "Dificil", "Colombo", "Sri Jayawardenepura Kotte", "Kandy", "Galle", "Sri Jayawardenepura Kotte"),
            Pregunta("¿Unidad de resistencia eléctrica?", "Física", "Dificil", "Voltio", "Ohmio", "Amperio", "Watio", "Ohmio"),
            Pregunta("¿Año Revolución Francesa?", "Historia", "Dificil", "1776", "1789", "1812", "1848", "1789"),
            Pregunta("¿Padre de la teoría de la relatividad?", "Ciencia", "Dificil", "Newton", "Galileo", "Einstein", "Tesla", "Einstein"),
            Pregunta("¿Metal más conductor?", "Física", "Dificil", "Cobre", "Plata", "Oro", "Aluminio", "Plata"),
            Pregunta("¿Teorema de Pitágoras aplica a?", "Matemáticas", "Dificil", "Triángulos equiláteros", "Triángulos rectángulos", "Círculos", "Cuadrados", "Triángulos rectángulos"),
            Pregunta("¿Número primo más pequeño?", "Matemáticas", "Dificil", "1", "2", "3", "5", "2"),
            Pregunta("¿Capital de Burkina Faso?", "Geografía", "Dificil", "Bamako", "Niamey", "Uagadugú", "Lomé", "Uagadugú"),
            Pregunta("¿Partícula con carga negativa?", "Física", "Dificil", "Protón", "Neutrón", "Electrón", "Positrón", "Electrón"),
            Pregunta("¿Autor del Principia Mathematica?", "Ciencia", "Dificil", "Einstein", "Newton", "Galileo", "Kepler", "Newton"),
            Pregunta("¿Número de cromosomas humanos?", "Biología", "Dificil", "44", "46", "48", "50", "46")

        )
    }
}