public class caeserCipher {
    public static void main(String[] args) {
        System.out.println(coder("Hello World",-3));
    }
    public static char convert(char let, int shift){
        char rslt = ' ';

        if(Character.isUpperCase(let)){
            rslt = (char) ((let + shift - 65) % 26 + 65);
        }
        if(Character.isLowerCase(let)){
            rslt = (char)((let + shift - 97) % 26 + 97);
        }
        if(Character.isWhitespace(let)){
            rslt = ' ';
        }
        return rslt;
    }
    public static String coder(String word, int shift){
        String fnal = "";
        for(int i = 0; i<word.length(); i++){
            fnal += convert(word.charAt(i), shift);
        }
        return fnal;
    }
}

