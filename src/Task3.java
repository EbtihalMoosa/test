import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        char[][] chars ={
                {'a', 'b', 'c'},{'d','e','f'},{'j', 'h', 'i'}};
//                String word= "abcdd";
        Scanner read = new Scanner (System.in);
        System.out.println("write word");
        String word = read.next();

                char[] cs = word.toCharArray();
                boolean isThisWordValid = true;
                for (char c :cs) {
                    System.out.println(c + " : " + isExist(chars,c));
                    if (isExist(chars,c)) {
                         isThisWordValid=false;
                    }
                        break;
        }
       // while (isExist(chars, c)){


    }

        static boolean isExist(char[][] chars, char c){
            for (int i=0; i < chars.length; i++) {
                    for (int j = 0; j < chars[0].length; j++) {
                        if (c == chars[i][j]) {
                            return true;
                        }

                    }
                }

                return false;
            }}