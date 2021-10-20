package se.jonas;

public class Account {

    private String kontonummer;
    private String namn;
    private int saldo;

    public Account(String kontonummer) {
        super();
        this.kontonummer = kontonummer;
    }

    public boolean setNamn(String namn) {
        if (namn.length() < 3) {
            return false;
        }
        else {
            this.namn = namn;
            return true;
        }
    }
}