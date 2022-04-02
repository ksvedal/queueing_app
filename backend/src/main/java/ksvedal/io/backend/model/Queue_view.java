package ksvedal.io.backend.model;

import javax.persistence.*;

@Entity
public class Queue_view {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject")
    private String subject;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "assignment")
    private int assignment;

    @Column(name = "room")
    private String room;

    @Column(name = "table")
    private String table;

    @Column(name = "comment")
    private String comment;

    public Queue_view(Long id,
                 String subject,
                 String username,
                 int assignment,
                 String room,
                 String table,
                 String comment) {
        this.id = id;
        this.subject = subject;
        this.username = username;
        this.assignment = assignment;
        this.room = room;
        this.table = table;
        this.comment = comment;
    }

    public Queue_view() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject_id() {
        return subject;
    }

    public void setSubject_id(String subject_id) {
        this.subject = subject_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
