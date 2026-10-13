
package lms;

import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.model.Staff;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books and a DVD
        Book book1 = new Book(
                "B001", "Clean Code", "Robert C. Martin");

        Book book2 = new Book(
                "B002", "Effective Java", "Joshua Bloch");

        DVD dvd1 = new DVD(
                "D001", "Introduction to Algorithms", 120);

        // Add items to the library
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        // Create members
        Student student = new Student(
                "M001", "Nadeesha Perera");

        Staff staff = new Staff(
                "M002", "Mr. Kasun Silva");

        // Register members
        library.addMember(student);
        library.addMember(staff);

        // Display library information
        library.listItems();        // Test validation

        library.listMembers();
        library.printAllLateFees(3);

        try {
            Book invalidBook = new Book(
                    "B003", "", "Unknown Author");

            library.addItem(invalidBook);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Rejected invalid book: " + e.getMessage());
        }
    }
}
