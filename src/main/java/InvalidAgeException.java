/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prudvi
 */
class InvalidAgeException extends Exception {

    InvalidAgeException(String errorMessage) {
       super(errorMessage);
    }
    public  InvalidAgeException(String message, Throwable cause) {
   super(message, cause);
}
    
}
