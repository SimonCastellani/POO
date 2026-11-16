package tp1.ejercicio04;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(1500.50);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
