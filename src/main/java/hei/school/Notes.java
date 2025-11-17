package hei.school;

import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Notes {
    private Student student;
    private Examen examen;
    private double score;
    private List<Historic> historic;

    public Notes(Student student, Examen examen, double score, List<Historic> historic) {
        this.student = student;
        this.examen = examen;
        this.score = score;
        this.historic = new ArrayList<>();
        historic.add(new Historic(score, "Add new note", LocalDateTime.now()));
    }

    public static class Historic {
        private double score;
        private String reason;
        private LocalDateTime dateTime;

        public Historic(double score, String reason, LocalDateTime dateTime) {
            this.score = score;
            this.reason = reason;
            this.dateTime = dateTime;
        }

        @Override
        public String toString() {
            return dateTime + ": " + score + " (" + reason + ").";
        }
    }

}
