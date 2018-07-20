package com.example.sunrinton.interpeople;

public class LoginData {
    String apartment;
    String dong;
    String ho;

    public LoginData(String apartment, String dong, String ho) {
        this.apartment = apartment;
        this.dong = dong;
        this.ho = ho;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }
}