package model.entities.exceptions;

public class WithdrawLimit extends RuntimeException {
    public WithdrawLimit(String message) {
        super(message);
    }
}
