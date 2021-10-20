package se.jonas;

public final class App {
    public static void main(String[] args) {

        Account acc = new Account("1234567890");
        while (true) {
            String namn = System.console().readLine();
            if(acc.setNamn(namn) == true){
                
            }
            
        }
    }
}
