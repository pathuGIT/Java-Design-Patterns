public class Main {
    public static String atbash(String text){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(Character.isUpperCase(ch)){
                stringBuilder.append((char)('Z' - (ch - 'A')));
            } else if (Character.isLowerCase(ch)) {
                stringBuilder.append((char) ('z' - (ch - 'a')));
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String text = "ByeBabe@";
        String encryptedText = atbash(text);
        System.out.println("Original Text: "+text);
        System.out.println("Encrypted Text: "+encryptedText);
    }
}