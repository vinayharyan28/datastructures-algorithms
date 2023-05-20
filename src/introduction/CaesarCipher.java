package introduction;

public class CaesarCipher {
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];

    public CaesarCipher(int rotation){
        for (int k=0; k<26; k++){
            encoder[k] = (char) ('A' + (k + rotation) % 26);
            decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
        }
    }

    private String transform(String original, char[] code){
        char[] msg = original.toCharArray();
        for (int k=0; k<msg.length; k++){
            if (Character.isUpperCase(msg[k])){
                int j = msg[k] - 'A';
                msg[k] = code[j];
            }
        }
        return new String(msg);
    }

    public String encrypt(String message){
        return transform(message, encoder);
    }

    public String decrypt(String secret){
        return transform(secret, decoder);
    }

    public static void main(String[] args){
        CaesarCipher caesarCipher = new CaesarCipher(3);
        System.out.println("Encryption code = " + new String(caesarCipher.encoder));
        System.out.println("Decryption code = " + new String(caesarCipher.decoder));
        String message = "The Eagle is in play; meet at joe's";
        String coded = caesarCipher.encrypt(message);
        System.out.println("Secret: " + coded);
        String answer = caesarCipher.decrypt(coded);
        System.out.println("message: " + answer);
    }
}
