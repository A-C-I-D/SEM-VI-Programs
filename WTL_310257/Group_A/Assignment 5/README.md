# Ebookshop Servlet Sample

This is a simple Java Servlet program that demonstrates database connectivity using JDBC and displays the contents of an ebookshop table.

## Prerequisites

- Java 11 or higher
- Apache Tomcat 9 or higher
- MySQL Server
- Maven

## Setup Instructions

1. **Install MySQL Server** and start it.

2. **Create the database and table:**
   - Open MySQL command line or a MySQL client (like MySQL Workbench).
   - Run the SQL script `create_table.sql` to create the database, table, and insert sample data.

3. **Update Database Credentials:**
   - In `EbookshopServlet.java`, update the `DB_URL`, `DB_USER`, and `DB_PASSWORD` constants with your MySQL credentials.

4. **Build the Project:**
   - Open a terminal in the project root.
   - Run `mvn clean package` to build the WAR file.

5. **Deploy to Tomcat:**
   - Copy the generated `target/ebookshop-servlet-1.0-SNAPSHOT.war` to Tomcat's `webapps` directory.
   - Start Tomcat.

6. **Access the Application:**
   - Open a browser and go to `http://localhost:8080/ebookshop-servlet-1.0-SNAPSHOT/books`
   - You should see a table displaying the books from the database.

## Project Structure

- `pom.xml`: Maven configuration
- `src/main/java/com/example/EbookshopServlet.java`: The servlet class
- `src/main/webapp/WEB-INF/web.xml`: Web application configuration
- `create_table.sql`: SQL script to set up the database

-