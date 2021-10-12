// PACKAGES, ACCESS Control, IMPORT
// What is package in Java? package is a keyword in Java that is used to specify a directory structure 
// for the particular class file, but at the same time, it is also used to control access. 
// You can use a package to organize code in a meaningful directory for better navigation.

// Each class belongs to a package.
// Classes in the same package serve a similar purpose.
// Packages are just directories,
// classes in other packages/folders need to be imported.


// All classes “see” classes in the same package
// (no import needed)
// All classes “see” classes in java.lang
// Example: java.lang.String; java.lang.System

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
