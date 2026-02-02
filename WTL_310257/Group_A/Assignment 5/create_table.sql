-- Create database
CREATE DATABASE IF NOT EXISTS ebookshopdb;

-- Use the database
USE ebookshopdb;

-- Create table
CREATE TABLE IF NOT EXISTS ebookshop (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    book_title VARCHAR(255) NOT NULL,
    book_author VARCHAR(255) NOT NULL,
    book_price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL
);

-- Insert sample data
INSERT INTO ebookshop (book_title, book_author, book_price, quantity) VALUES
('Java Programming', 'Ved Asawa', 29.99, 10),
('Web Development', 'Vaibhav Kore', 39.99, 5),
('Database Systems', 'Aditya Javarat', 49.99, 8);