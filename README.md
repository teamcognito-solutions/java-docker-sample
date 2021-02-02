# Docker Build Command
docker build -t vendorauth .

# Docker Run Command
docker run -d -p 8080:8080 --name vendorauth --link mysql-standalone vendorauth

# Docker MySQL Run
docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=sus_v -e MYSQL_USER=hoichoi -e MYSQL_PASSWORD=root -d mysql

# Layered JAR
 <build>
      <plugins>
        <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <version>2.4.2</version>
          <configuration>
            <layers>
              <enabled>true</enabled>
            </layers>
          </configuration>
        </plugin>
      </plugins>
    </build>

# application.properties
Change the IP/Docker Container Name
Change User & Password
spring.jpa.hibernate.ddl-auto=create