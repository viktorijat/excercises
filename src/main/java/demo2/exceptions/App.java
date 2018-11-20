package demo2.exceptions;

class UserException extends Exception {}
class AgeOutOfLimitException extends UserException {}

public class App {

    public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {

        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered");
        }
    }

    public static void main(String[] args) throws UserException {
        App t = new App();
        t.doRegister("Matthew", 60);
    }
}
