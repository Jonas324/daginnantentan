package se.jonas;

public class Account {

    private String kontonummer;
    private String namn;
    private int saldo;

    public Account(String kontonummer, String namn) throws Exception {
        super();
        this.kontonummer = kontonummer;
        if(this.setNamn(namn)){
            throw new Exception("Fel");
        }
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

    public WithdrawlStatus withdraw(int belopp){
        if (belopp > 3000) return WithdrawlStatus.MAX_BELOPP_3000_PER_DAY;
        if (belopp < 300) return WithdrawlStatus.SALDO_TOO_LOW;
        else return WithdrawlStatus.OK;
    }
}