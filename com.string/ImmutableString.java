public class ImmutableString {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate first name and last name
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName); // Output: Full Name: John Doe

        // Attempt to modify the first name
        firstName = firstName + "ny";

        System.out.println("Modified First Name: " + firstName); // Output: Modified First Name: Johnny
        System.out.println("Full Name: " + fullName); // Output: Full Name: John Doe (unchanged)
    }
}
