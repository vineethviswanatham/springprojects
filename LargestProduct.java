/**
 * LargestProduct
 */
public class LargestProduct {

    public static void main(String[] args) {
        long n = 3675536291l;
        int count = 0;
        long temp = n;
        int k = 5;
        while ( temp > 0 ) {
            count++;
            temp /= 10;
        }
        temp = n;
        int remove = 0;
        int forDigits = k;
        int maxProduct = 0;
        while ( temp / (long)Math.pow(10, count-k) > 0 ) {            
            temp %= (long)Math.pow(10, count-remove);           
            // long fiveDigits = temp / (long)Math.pow(10, forDigits);
            // int check = (int)fiveDigits;
            int check = (int)(temp / (long)Math.pow(10, forDigits));
            int product = 1;
            while ( check > 0 ) {
                product *= check%10;
                check /= 10;
            }
            if ( product > maxProduct ) {
                maxProduct = product;
            }
            forDigits--;
            remove++;
        }
        System.out.println(maxProduct);

    }
}