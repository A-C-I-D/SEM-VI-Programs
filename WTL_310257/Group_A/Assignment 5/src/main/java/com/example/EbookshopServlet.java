package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EbookshopServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ebookshopdb";
    private static final String DB_USER = "root"; // Change as per your DB setup
    private static final String DB_PASSWORD = "password"; // Change as per your DB setup

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Ebookshop Books</title></head><body>");
        out.println("<h1>Ebookshop Books</h1>");
        out.println(
                "<table border='1'><tr><th>Book ID</th><th>Title</th><th>Author</th><th>Price</th><th>Quantity</th></tr>");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ebookshop");

            while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("book_title");
                String author = rs.getString("book_author");
                double price = rs.getDouble("book_price");
                int quantity = rs.getInt("quantity");

                out.println("<tr><td>" + id + "</td><td>" + title + "</td><td>" + author + "</td><td>" + price
                        + "</td><td>" + quantity + "</td></tr>");
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            out.println("<tr><td colspan='5'>Error: " + e.getMessage() + "</td></tr>");
        }

        out.println("</table></body></html>");
    }
}