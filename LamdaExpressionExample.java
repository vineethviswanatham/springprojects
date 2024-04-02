/**
 * LamdaExpressionExample
 */
interface Greeting {
    // public void greet( String name );
    public String voteCheck( String name , int age , String location );
}

/**
 * InnerLamdaExpressionExample
 */
public class LamdaExpressionExample {

    public static void main(String[] args) {

        // Greeting g = (name)  -> System.out.println("Ohayo Gozaimas..." + name);
        // g.greet("Hemanth");

        Greeting g = ( name , age , location ) -> {
            if ( age >= 18 && location.equals("Hyderabad") ) {
                return name + " is Eligible";
            } else {
                return name + " is Not Eligible";
            }
        };
        System.out.println(g.voteCheck("Hemanth", 24, "Hyderabad"));

    }
}