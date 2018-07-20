package com.example.sunrinton.interpeople;

public class ComplainedData {

    String dateandaddr;
    String complain;

    public ComplainedData(String dateandaddr, String complain) {
        this.dateandaddr = dateandaddr;
        this.complain = complain;
    }

    public String getDateandaddr() {
        return dateandaddr;
    }

    public void setDateandaddr(String dateandaddr) {
        this.dateandaddr = dateandaddr;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
}
