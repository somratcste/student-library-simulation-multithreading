package somrat.info;

import java.util.Random;

public class Student implements Runnable {

    private int id;
    private Book[] books;
    private volatile boolean read;

    public Student(int id, Book[] books) {
        this.id = id;
        this.books = books;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (!read) {
            int bookId = random.nextInt(Constants.NUMBER_OF_BOOKS);
            try {
                books[bookId].read(this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isRead () {
        return this.read;
    }

    @Override
    public String toString() {
        return "Student: " + id;
    }
}
