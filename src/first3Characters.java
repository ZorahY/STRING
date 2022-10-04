import java.util.Scanner;

public class first3Characters {
    public static void main (String [] args) {
   //Create an array of names that will hold 5 String elements
        //Names must be taking from a user.
        //Print out the first three characters of each element of the array, one per line.
        //Note: every array element must be at least 3 characters long.

        Scanner input = new Scanner(System.in);
        String[] name = new String[5];
        System.out.println("Please enter 5 names");
        for(int i=0; i<5; i++){
            name[i] = input.next();
            if(name[i].length()>3){
                System.out.println(name[i].substring(0,3));
            }

        }
    }
}

