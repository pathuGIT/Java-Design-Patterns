public class Main {
    public static String encrypt(String txt, int key){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<txt.length(); i++){
            char ch = txt.charAt(i);
            if(Character.isUpperCase(ch)){
                char c = (char) (((ch - 'A' + key) % 26) + 'A');
                stringBuilder.append(c);
            } else if (Character.isLowerCase(ch)) {
                char c = (char) (((ch - 'a' + key) % 26) + 'a');
                stringBuilder.append(c);
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static String decrypt(String txt, int key){
        return encrypt(txt, 26-key);
    }

    public static void main(String[] args) {
        String original = "Hello";
        int key = 3;
        String encrypt = encrypt(original, key);
        System.out.println("Original: "+original);
        System.out.println("Encrypt: "+encrypt);
        System.out.println("Decrypt: "+decrypt(encrypt, key));
    }
}

//'Z' - (ch - 'a')
//((ch - 'a' + key) % 26 ) + 'a'