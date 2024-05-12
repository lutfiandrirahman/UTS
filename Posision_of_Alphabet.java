
package kata;

public class Posision_of_Alphabet {
   public static String position(char alphabet) {
    // Convert the character to lowercase to handle both cases
    alphabet = Character.toLowerCase(alphabet);
    
    // Calculate the position in the alphabet
    int position = alphabet - 'a' + 1;
    
    // Return the result
    return "Position of alphabet: " + position;
}
public static void main(String[] args) {
    char letter = 'a';
    System.out.println(position(letter));
}
}
