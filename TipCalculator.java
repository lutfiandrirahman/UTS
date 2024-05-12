
package kata;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        // Convert the rating to lowercase for case insensitivity
        String lowerCaseRating = rating.toLowerCase();
        
        // Calculate tip based on rating
        switch (lowerCaseRating) {
            case "terrible":
                return (int) Math.ceil(amount * 0);
            case "poor":
                return (int) Math.ceil(amount * 0.05);
            case "good":
                return (int) Math.ceil(amount * 0.10);
            case "great":
                return (int) Math.ceil(amount * 0.15);
            case "excellent":
                return (int) Math.ceil(amount * 0.20);
            default:
                return null; // Rating not recognised
        }
    }

    public static void main(String[] args) {
        double amount = 100; // Example total amount
        String rating = "great"; // Example rating
        
        Integer tip = calculateTip(amount, rating);
        if (tip != null) {
            System.out.println("Tip: " + tip);
        } else {
            System.out.println("Rating not recognised");
        }
    }
}
