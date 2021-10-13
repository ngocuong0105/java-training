package src; // NAME OF PACKAGE SHOULD ALWAYS BE DECLEARED
// Access Control
// Public vs Private
// - Public: others can use this
// - Private: only the class can use this
// public/private applies to any field or method !!!!!

// Why access control
// sorta protect private info
// clarify how others should use your class
// keep implementation separate from interface

public class CreditCard {
    private String cardNumber;
    private double expenses;
    public void charge(double amount) {
        expenses = expenses + amount;
    }
    public String getCardNumber(String password) {
        if (password.equals("SECRET")) {
            return cardNumber;
        }
        return "Wrong pass";
    }
}
