package exception.example;

public class VotingDemo {
    public static void main(String[] args) {
        Voting voting = new Voting();
        try {
            voting.checkEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("2");
        }
    }
}

class Voting {
    public void checkEligibility (int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("You are not eligible to vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super((msg));
    }
}