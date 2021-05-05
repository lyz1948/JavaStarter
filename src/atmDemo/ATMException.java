package atmDemo;

public class ATMException extends Exception {

  String message;

  ATMException(String msg) {
    this.message = msg;
  }

  public String toString() {
    return this.message;
  }
}
