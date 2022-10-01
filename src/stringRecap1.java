public class stringRecap1 {
    public static void main (String[] args) {
       // Upper Case
        String str="Hello";
        str.toUpperCase();
        System.out.println(str);
        System.out.println(" _ _ _ _ _  _");
        str=str.toUpperCase();
        System.out.println(str);

        // length() --gives size
        int size=str.length();
        System.out.println(size);

        // charAt()----> returns the char
 char letter=str.charAt(0);
        System.out.println(letter);

//  how to get last character
      char  lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        // indexOff
      int index= str.indexOf(lastCharacter);
        System.out.println(index);
        System.out.println(str.indexOf('a'));

        // isEmpty () -----returns true if length is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);
    }

}
