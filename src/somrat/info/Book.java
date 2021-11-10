package somrat.info;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Book {

    private int id;
    private Lock lock;

    public Book(int id) {
        this.id = id;
        this.lock = new ReentrantLock();
    }

    public void read(Student student) throws InterruptedException {
        // it tries to read books if it doesn't then the thread is going to disable
        lock.lock();
        System.out.println(student + " starts reading " + this);

        // student read the books for 2 sec
        Thread.sleep(2000); // milliseconds

        // release the lock
        lock.unlock();
        System.out.println(student + " has finished reading " + this);
    }

    @Override
    public String toString() {
        return "Book: " + id;
    }
}
