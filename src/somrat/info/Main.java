package somrat.info;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student[] students;
        Book[] books;
        ExecutorService executorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_STUDENTS);

        try {
            books = new Book[Constants.NUMBER_OF_BOOKS];
            students = new Student[Constants.NUMBER_OF_STUDENTS];

            for (int i=0; i<Constants.NUMBER_OF_BOOKS; i++) {
                books[i] = new Book(i);
            }

            for (int i=0; i<Constants.NUMBER_OF_STUDENTS; i++) {
                students[i] = new Student(i, books);
                executorService.execute(students[i]);
            }

            Thread.sleep(Constants.SIMULATION_RUNNING_TIME);

            for (Student student: students) {
                // helps to run method going to break infinite while loop
                student.setRead(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            while (!executorService.isTerminated()) {
                // we are waiting 1 sec then try again until terminate the all service
                Thread.sleep(1000);
            }
        }
    }
}
