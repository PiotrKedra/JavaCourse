package zad4;

public class ROT11 implements Algorithm {
    public String crypt(String word) {
        int length = word.length();
        String crypted = "";
        for(int i=0;i<length;++i) {
            char cryptChar = word.charAt(i);
            if(65<=cryptChar && cryptChar<=90) {
                cryptChar += 11;
                if(cryptChar>90) {
                    cryptChar -= 26; //26 since alphabet has 26 signs
                }
            } else if(97<=cryptChar && cryptChar<=122) {
                cryptChar += 11;
                if(cryptChar>122){
                    cryptChar -= 26;
                }
            }
            crypted += cryptChar;
        }
        return crypted;
    }
    public String decrypt(String word){
        int length = word.length();
        String decrypted = "";
        for(int i=0;i<length;++i) {
            char decryptChar = word.charAt(i);
            if(65<=decryptChar && decryptChar<=90) {
                decryptChar -= 11;
                if(decryptChar<65) {
                    decryptChar += 26;
                }
            } else if(97<=decryptChar && decryptChar<=122) {
                decryptChar -= 11;
                if(decryptChar<97){
                    decryptChar += 26;
                }
            }
            decrypted += decryptChar;
        }
        return decrypted;
    }
}
