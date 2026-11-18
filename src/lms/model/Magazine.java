package lms.model;

public class Magazine extends LibraryItem{
    public Magazine(String id, String title) {
        super(id, title);
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 5.0;
    }
}
