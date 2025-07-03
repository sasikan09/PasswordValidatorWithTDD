package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความยากง่ายของรหัสผ่านที่เป็น String
     * @param password string ที่ต้องการตวรจสอบ
     * @return ส่งกลับความยากของรหัสหรือความภูกต้อง(Invaild)
     * @throws IllegalArgumentException ถ้ารหัสผ่านมีค่า null หรือ empty
     */
   
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if(password==null || password.length()<8)
        return PasswordStrength.INVALID;

        boolean digit = false ;
        boolean uppercase = false ;
        boolean special = false ;
        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                digit = true ;
            }
             if(Character.isUpperCase(c)){
               uppercase = true ;
            }
             if(!Character.isLetterOrDigit(c)){
                special = true ;
            }
        }
        if(digit&&uppercase&&special){
            return PasswordStrength.STRONG;
        }else if((digit && uppercase )|| (digit && special) || (special &&  uppercase)){
            return PasswordStrength.MEDIUM;
        }else if(!digit || !uppercase || !special){
            return PasswordStrength.WEAK;
        }else{
            return PasswordStrength.INVALID;
        }
        
        
      
        
      
        
           
    }
}
