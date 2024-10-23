package com.example.lasalleapp.ui.theme.utils

import com.example.lasalleapp.ui.theme.models.*

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val communities = listOf(
    Community(1, "https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2, "https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3, "https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg"),
    Community(4, "https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5, "https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg")
)

val materias = listOf(
    Materia(1,"Android",9.8,10.0,10.0,9.96),
    Materia(2,"Redes",8.5,8.50,9.50,9.1),
    Materia(3,"Ingles",8.0,8.3,10.0,9.26),
    Materia(4,"Imagenes",0.0,10.0,10.0,8.0),
    Materia(5,"Matematicas",9.0,10.0,10.0,9.8),
)

val alumno = listOf(
    Alumno("Diego Andrés Gómez Vázquez","ISSC",5,9.2)
)
val pays = listOf(
    Payments("Enero",paid = true),
    Payments("Febrero",paid = true),
    Payments("Marzo",paid = true),
    Payments("Abril",paid = true),
    Payments("Mayo",paid = true),
    Payments("Junio",paid = true),
    Payments("Julio",paid = true),
    Payments("Agosto",paid = false),
    Payments("Septiembre",paid = false),
    Payments("Octubre",paid = false),
    Payments("Noviembre",paid = false),
    Payments("Diciembre",paid = false)
)
