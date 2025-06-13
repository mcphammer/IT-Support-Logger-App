package com.example.itsupportlogger;

public class LogEntry {
    public String date, problem, actions, resolution;

    public LogEntry(String date, String problem, String actions, String resolution) {
        this.date = date;
        this.problem = problem;
        this.actions = actions;
        this.resolution = resolution;
    }
}