package library;

public class SemSaldoException extends Exception {

    @Override
    public String getMessage() {
        return "Sem saldo para efetuar o saque";
    }
}
