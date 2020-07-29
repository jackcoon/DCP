///**
// *
// * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
// * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
// * You can assume that the messages are decodable. For example, '001' is not allowed
// *
// */
//
public class DCP7 {
//    public static void main(String [] args){
//        String message = "12345";
//        int encrypt = 0;
//        boolean isValid = isValid(message);
//        if(isValid == true){
//            encrypt = decodeCount(message);
//        }
//        else{
//            System.out.println("String is invalid");
//        }
//        System.out.println(encrypt);
//    }
//
//    static boolean isValid(String message){
//        int i = 0;
//        String encrypt = "";
//
//        //If the message opens up with a zero, it is automatically wrong
//        if(message.charAt(0) == '0'){
//            encrypt = ("Incorrect Message");
//            return false;
//        }
//
//        while(i < message.length()){
//        //    System.out.println(message.charAt(i));
//              //If Message is 3,4,5,6,7,8,9, or 0 first and the secon
//              if(message.charAt(i) == '0') {
//                  if (message.charAt(i - 1) == '0' ||
//                      message.charAt(i - 1) == '3' ||
//                      message.charAt(i - 1) == '4' ||
//                      message.charAt(i - 1) == '5' ||
//                      message.charAt(i - 1) == '6' ||
//                      message.charAt(i - 1) == '7' ||
//                      message.charAt(i - 1) == '8' ||
//                      message.charAt(i - 1) == '9') {
//                      encrypt = ("Incorrect Message");
//                      return false;
//                  }
//              }
//
//              else {
//                  encrypt = ("Correct Message");
//              }
//            i++;
//        }
//        return true;
//    }
//
//    static int decodeCount(String message){
//        int count = 0;
//
//        return count;
//    }
//}
// A naive recursive Java implementation
// to count number of decodings that
// can be formed from a given digit sequence

//class GFG {

    // Given a digit sequence of length n,
// returns count of possible decodings by
// replacing 1 with A, 2 woth B, ... 26 with Z
    static int countDecoding(String digits, int n)
    {
        // base cases
        if (n == 0 || n == 1)
            return 1;

        // for base condition "01123" should return 0
        if (digits.charAt(0)=='0')
            return 0;

        // Initialize count
        int count = 0;

        // If the last digit is not 0, then
        // last digit must add to
        // the number of words
        if (digits.charAt(n - 1) > '0')
            count = countDecoding(digits, n - 1);

        // If the last two digits form a number
        // smaller than or equal to 26,
        // then consider last two digits and recur
        if (digits.charAt(n - 2) == '1' ||
                (digits.charAt(n - 2) == '2' && digits.charAt(n - 1) < '7'))
            count += countDecoding(digits, n - 2);

        return count;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int digits = 111111;
        String S_dig = Integer.toString(digits);
        int n = S_dig.length();
        System.out.printf("Count is %d", countDecoding(S_dig, n));
    }
}
