package tema4;

public class TestValidator {
    public static void main(String[] args) {

        System.out.println(ValidatorMailPassword.isEmailValid("pepe@gmail"));
        System.out.println(ValidatorMailPassword.isEmailValid("pepe@gmail.com"));
        System.out.println(ValidatorMailPassword.isEmailValid("pepeagmail.com"));

        System.out.println(ValidatorMailPassword.isPasswordValid("123456"));
        System.out.println(ValidatorMailPassword.isPasswordValid("JAROSO77"));
        System.out.println(ValidatorMailPassword.isPasswordValid("Jaroso2026"));
        System.out.println(ValidatorMailPassword.isPasswordValid("IESJaroso2026"));
    }
}
