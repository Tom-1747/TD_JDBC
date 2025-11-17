package hei.school;

import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String title;
    private Course course;
    private LocalDateTime date;
    private int coef;

    public Examen(int id, String title, Course course, LocalDateTime date, int coef) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.date = date;
        this.coef = coef;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getCoef() {
        return coef;
    }
}
