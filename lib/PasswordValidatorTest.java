package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "1234" ;
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2 : รหัสผ่านทั้งหมดควรจะเป็นตัวเล็กจะ WEAK
            pw = "abcdefgh" ;
        PasswordStrength result2 = PasswordValidator.validate("abcdefgh");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed : All lowercase is INVALID.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED : Expected WEAK but got"+result2);
        }

          // Test Case 3 : รหัสผ่านทั้งหมดควรจะเป็นตัวอักษรพิมพ์ใหญ่ เเเละ ตัวพิมพ์เล็ก MEDIUM
            pw = "ABCDEFGH" ;
        PasswordStrength result3 = PasswordValidator.validate("ABCDEFGH");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed : All uppercase is MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED : Expected WEAK but got"+result3);
        }
       
         // Test Case 4 : รหัสผ่านทั้งหมดเป็นตัวใหญ่ ตัวเล้ก ตัวเลข ตัวอักษรควรจะเป้น STRONG
            pw = "/*-+=&^%$#@!" ;
        PasswordStrength result4 = PasswordValidator.validate("/*-+=&^%$#@!");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 : "+pw+" : Passed : All special charcters are INVALID.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED : Expected WEAK but got"+result4);
        }
       

        System.out.println("--------------------------------");
    }
}
