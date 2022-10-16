package model;
public class EventProposal{

    private String eventID;
    private String eventName;
    private String eventProposal;
    private String paymentDetails;

    public EventProposal() {
    }

    public EventProposal(String eventID, String eventName, String eventProposal, String paymentDetails) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventProposal = eventProposal;
        this.paymentDetails = paymentDetails;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventProposal() {
        return eventProposal;
    }

    public void setEventProposal(String eventProposal) {
        this.eventProposal = eventProposal;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}