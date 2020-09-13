package edu.eci.cvds.servlet.model;

/**
 * @author Iván Camilo Rincón Saavedra
 * @author Leonardo Galeano Garzón
 * @version 9/12/2020
 */
public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;


    public Todo(){ }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }




}

