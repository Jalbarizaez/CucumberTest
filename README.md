# CucumberTest

# Instalaciones y dependencias

1. Java JDK utilizado Java 11
2. Si se usa en sistema operativo Windows es necesario borrar el driver de chrome actual dado que es de MacOs Y descargar el driver de Windows
  https://chromedriver.chromium.org/downloads
3. Compilacion por medio de comando: mvn clean package
4. Dependencias se encuentran en archivo pom.xml 
  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
  https://mvnrepository.com/artifact/org.testng/testng
  https://mvnrepository.com/artifact/info.cukes/cucumber-java 
  https://mvnrepository.com/artifact/info.cukes/cucumber-testng
  https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin
  
# Pasos de creación

1. Crear un proyecto vacio o utilizar el archetype maven-quick-start
2. En la carpeta test/java crear una carpeta llamada "features"
3. Dentro de la carpeta test/java/features crear el archivo "search.feature"
4. Dentro del archivo search.feature códificar el feature y el scenario en formato gherkin 
5. En la carpeta test/java crear una carpeta llamada crear carpeta llamada "steps"
6. Dentro de la carpeta test/java/steps crear una clase de Java llamada SearchSteps en la cual cada método irá asociado a un requerimiento del formato gherkin
7. En la carpeta test/java crear una clase llamada "RunCukesTest" que extienda de "AbstractTestNGCucumberTests" agregando de etiqueta @CucumberOptions(features = "src/test/java/features/search.feature" ,glue = "steps")
8. Compilar 
