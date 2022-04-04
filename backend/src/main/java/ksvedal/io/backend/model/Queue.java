package ksvedal.io.backend.model;

import javax.persistence.*;

/*
* Queue model with information about the subject, user and extra info the user entered.
 */
@Entity
public class Queue {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subject_id")
    private Long subject_id;

    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name = "room")
    private String room;

    @Column(name = "table")
    private String table;

    @Column(name = "assignment")
    private String assignment;

    @Column(name = "comment")
    private String comment;

    public Queue(Long id,
                 Long subject_id,
                 Long user_id,
                 String room,
                 String table,
                 String assignment,
                 String comment) {
        this.id = id;
        this.subject_id = subject_id;
        this.user_id = user_id;
        this.room = room;
        this.table = table;
        this.assignment = assignment;
        this.comment = comment;
    }

    public Queue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
