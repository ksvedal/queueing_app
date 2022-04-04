package ksvedal.io.backend.model;

import javax.persistence.*;

/**
 * Subject object to contain subject information.
 */
@Entity
public class Subject {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "assignments")
    private int assignment;

    @Column(name = "active")
    private int active;

    public Subject(Long id, String subject, int assignment, int active) {
        this.id = id;
        this.subject = subject;
        this.assignment = assignment;
        this.active = active;
    }

    public Subject() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
