package ex37;

import java.util.*;

public class App {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static String randPass(int length,int chars,int numbers){
        Set Special = new HashSet(Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '+'));

        int rand;
        Random r = new Random();
        int charsCounter = 0;
        int numCounter = 0;
        int lettersCounter = 0;
        if(length<chars+numbers){
            length = chars+numbers;
        }
        StringBuilder password = new StringBuilder();
        while (true){
            if(charsCounter == chars){
                if(numCounter == numbers){
                    if(lettersCounter >= numbers+chars) {
                        if (password.toString().length() >= length) {
                            break;
                        }
                    }
                }
            }
            rand = getRandomNumber(1,4);
            if(rand == 3){
                if(numCounter<numbers) {
                    password.append((char) (getRandomNumber(0, 10)+48));
                    numCounter++;
                }
                else if(getRandomNumber(1,3) == 1){
                    if(charsCounter<chars){
                        password.append((char)Special.toArray()[getRandomNumber(0,12)]) ;
                        charsCounter++;
                    }
                    else {
                        password.append((char) (r.nextInt(26) + 'a'));
                        lettersCounter++;
                    }
                }
                else password.append((char)(r.nextInt(26)+'a'));
            }
            if (rand == 2){
                if(charsCounter<chars){
                    password.append((char)Special.toArray()[getRandomNumber(0,12)]);
                    charsCounter++;
                }
                else if(getRandomNumber(1,3) == 1){
                    if(numCounter<numbers) {
                        password.append((char) (getRandomNumber(0, 10)+48));
                        numCounter++;
                    }
                    else {
                        password.append((char) (r.nextInt(26) + 'a'));
                        lettersCounter++;
                    }
                }
                else {
                    password.append((char) (r.nextInt(26) + 'a'));
                    lettersCounter++;
                }
            }
            if (rand == 1){
                 {
                    password.append((char) (r.nextInt(26) + 'a'));
                    lettersCounter++;
                }
            }
        }
        return password.toString();
    }
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        System.out.println("What is the minimum length?");
        int length = uInput.nextInt();
        System.out.println("How many special characters?");
        int chars = uInput.nextInt();
        System.out.println("How many numbers?");
        int numbers = uInput.nextInt();
        System.out.println("Your password is:"+randPass(length,chars,numbers));

    }
}
