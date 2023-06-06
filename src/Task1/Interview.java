package Task1;


//Task
//Left shift: First becomes the last character and all the other characters are shifted one index to the left  ( a b c d e -> b c d e a )
//Right shift: The last character becomes the first one character and all the other characters are shifted one index to the right

// 1.

//String , int , int
public class Interview {
    public static void main(String[] args) {
        Interview shifting = new Interview();

        String givenString = "abcde";
        int leftShift = 112;
        int rightShift = 113;

        String shiftedString = shifting.shiftingString(givenString, leftShift, rightShift);
        System.out.println(shiftedString);
    }

    public String shiftingString(String givenString, int leftShift, int rightShift) {

        if (leftShift > rightShift) {
            leftShift = leftShift - rightShift;

            if (leftShift >= givenString.length()) {
                leftShift = leftShift % givenString.length();
            }

            if (leftShift > 0) {
                String ending = givenString.substring(leftShift);
                String beginning = givenString.substring(0, leftShift);
                return ending + beginning;
            }
            return givenString;

        } else if (rightShift > leftShift) {
            rightShift = rightShift - leftShift;
            // for right shifting
            if (rightShift >= givenString.length()) {
                rightShift = rightShift % givenString.length();
            }

            if (rightShift > 0) {
                String ending = givenString.substring(0, givenString.length() - rightShift);
                String beginning = givenString.substring(givenString.length() - rightShift);
                return beginning + ending;
            }

            return givenString;

        } else {
            return givenString;
        }

    }
}
