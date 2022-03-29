package ksvedal.io.backend.model;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject", nullable = false)
    private String subject;

    public Subject(Long id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    private Subject() {}

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
}
