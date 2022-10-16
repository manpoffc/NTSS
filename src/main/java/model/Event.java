package model;

import java.util.Date;

public class Event{


    private String eventName;
    private String eventTheme;
    private String eventSlogan;
    private String eventLocation;
    private Date eventDuration;

    public Event() {
    }

    public Event(String eventName, String eventTheme, String eventSlogan, String eventLocation, Date eventDuration) {
        this.eventName = eventName;
        this.eventTheme = eventTheme;
        this.eventSlogan = eventSlogan;
        this.eventLocation = eventLocation;
        this.eventDuration = eventDuration;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTheme() {
        return eventTheme;
    }

    public void setEventTheme(String eventTheme) {
        this.eventTheme = eventTheme;
    }

    public String getEventSlogan() {
        return eventSlogan;
    }

    public void setEventSlogan(String eventSlogan) {
        this.eventSlogan = eventSlogan;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(Date eventDuration) {
        this.eventDuration = eventDuration;
    }
}