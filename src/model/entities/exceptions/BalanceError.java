package model.entities.exceptions;

public class BalanceError extends RuntimeException {
  public BalanceError(String message) {
    super(message);
  }
}
