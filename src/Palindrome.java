public class Palindrome {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true Abbc =>false
        String str="dad";
        StringBuilder stringBuilder=new StringBuilder (str);
        stringBuilder.reverse();

        if (stringBuilder.toString().equals(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is NOT Palindrome");
        }
    }
}
