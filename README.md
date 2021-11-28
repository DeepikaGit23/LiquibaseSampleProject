# LiquibaseSampleProject
Sample project for Database management and schema changes using liquibase.
1.In application.properties set: 
spring.liquibase.change-log=classpath:db/changelog/changelog-master.xml
and create changelog-master
2. Dependency
   <dependency>
       <groupId>org.liquibase</groupId>
       <artifactId>liquibase-core</artifactId>
   </dependency>
   <dependency>
       <groupId>org.liquibase</groupId>
       <artifactId>liquibase-maven-plugin</artifactId>
        <version>3.4.2</version>
   </dependency>
 3. Plugin
    <plugin>
        <groupId>org.liquibase</groupId>
        <artifactId>liquibase-maven-plugin</artifactId>
        <configuration>
        <propertyFile>src/main/resources/application.properties</propertyFile>
        <propertyFileWillOverride>true</propertyFileWillOverride>
        </configuration>
     </plugin>

# Swagger
Important points to remember
1. Annotation
    @EnableSwagger2 from import springfox.documentation.swagger2.annotations.EnableSwagger2;
2. Dependencies needed
    <!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger2 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>

3. Url's to try swagger
    for Json format: http://localhost:8080/v2/api-docs
    for html page: http://localhost:8080/swagger-ui.html
