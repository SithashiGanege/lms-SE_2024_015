
package lms;

import lms.model.Staff;
import lms.model.Magazine;
import lms.model.Book;
import lms.model.DVD;
import lms.model.Student;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("B001", "Clean Code", "Robert C. Martin");

        Book book2 = new Book("B002", "Effective Java", "Joshua Bloch");

        DVD dvd1 = new DVD("D001", "Introduction to Algorithms", 120);

        Magazine magazine1= new Magazine("M104", "Lankadipa");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(magazine1);

        Student student = new Student(
                "M001", "Nadeesha Perera");

        Staff staff = new Staff(
                "M002", "Kasun Silva");

        library.addMember(student);
        library.addMember(staff);

        library.listItems();

        library.listMembers();
        library.printAllLateFees(3);

        library.printFeeFor(dvd1, staff, 3);
        library.printFeeFor(book1, student, 3);

        library.streamIfPossible(dvd1);
        library.streamIfPossible(book1);

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
