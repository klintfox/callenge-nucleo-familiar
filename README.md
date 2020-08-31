# Challenge Núclero Familiar

### Descripción
A continuación encontrará diferentes enunciados con sus respectivas especificaciones. Cada enunciado pretende medir unas habilidades particulares, por lo que esperamos pueda ser resuelta en su mayoría y/o de acuerdo a la experiencia previa que disponga para tal fin. En otras palabras, cada ítem dentro de la prueba técnica es opcional y solo pretende evaluar el nivel de conocimientos en cada una de las herramientas propuestas.

- 1. Defina una estructura de datos para almacenar información básica de una persona y su núcleo familiar. La estructura de datos puede implementar cualquiera de los siguientes motores de bases de datos: MySql, SqlServer, MongoDb, Oracle, u SQLLite.

- 2. Implemente un servicio REST que involucre operaciones CRUD sobre las entidades propuestas para el numeral anterior. Por favor tener en cuenta preferiblemente los siguientes lineamientos para el servicio:

  - a. La arquitectura de la solución debe ser basada en Microservicios
  - b. Utilice el framework sprint boot.
  - c. Puede utilizar Eclipse, IntelliJ, o cualquier otro IDE de preferencia.

- d. Desacoplamiento de componentes en paquetes o capas independientes (Entities, Repository, Dtos, Controllers, Services, etc).
- e. Incluir manejo de Excepciones con registro de auditoría.
- f. Incluir auditoría asincrónica para los parámetros de entrada y de salida de cada servicio. La información de auditoría debe tener persistencia en el motor de base de datos utilizado en el numeral 1 de este requerimiento.
  - g. Evalúe la viabilidad de utilizar clases o métodos genéricos si considera que esto puede ayudar en la optimización y/o reducción de código fuente.
  - h. Documente el código en la mayor medida que considere (de acuerdo a estándares de codificación conocidos)
  - i. Tener en cuenta los estándares de desarrollo y manuales de buenas prácticas de codificación.

- 3. Ejecute una prueba sobre cada microservicio, capturando en imágenes la evidencia de ejecución de cada método y/u operación (una imagen por operación). Estás imágenes deben estar ubicadas en la ruta del código fuente, bajo una carpeta con el nombre

“Evidencias”. Puede utilizar postman, soap-ui o cualquier otra herramienta de pruebas que desee.

### Entregables:
Como entregable final, se espera un documento comprimido (formato ZIP) con los siguientes ítems
  - Código fuente de los microservicios.
  - Imágenes de evidencia de pruebas ejecutadas a los microservicios.
  - Archivos de scripts de la base de datos o estructura de datos utilizada para la prueba.

El documento final debe ser enviado por correo electrónico o en lo sucesivo responder al correo de solicitud de la prueba, indicando la Url de acceso al recurso compartido.
