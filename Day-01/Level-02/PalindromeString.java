import java.util.Scanner;

class PalindromeChecker {
    String text;

    public PalindromeChecker(String text){
        this.text = text;
    }
    
    public boolean checkPalindrome(){
        String rev = "";
        for(int i = 0; i<text.length(); i++){
            rev = text.charAt(i) + rev; 
        }
        if(rev.equals(text)){
            return true;
        }
        return false;
    }

    public void displayDetails(){
        if(checkPalindrome() == true){
            System.out.println(text + " is Palindrome.");
        }else{
            System.out.println(text + " is not Palindrome");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();

        PalindromeChecker check = new PalindromeChecker(text);
        check.displayDetails();
        sc.close();
    }
    
}