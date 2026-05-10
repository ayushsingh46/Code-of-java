public class stringhandling   {
public static void main(String[] args) {
        String str = "  Hello, Java World!  ";
        String target = "Java";

        System.out.println("Original: '" + str + "'");

        // 1. Basic Information
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));

        // 2. Comparison
        System.out.println("Equals 'hello...': " + str.equals("hello, java world!"));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("  hello, java world!  "));
        System.out.println("Starts with '  Hello': " + str.startsWith("  Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!  "));

        // 3. Transformation (Returns new strings)
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed: '" + str.trim() + "'"); // Removes leading/trailing spaces
        System.out.println("Replace 'Java' with 'Code': " + str.replace("Java", "Code"));

        // 4. Searching
        System.out.println("Index of 'Java': " + str.indexOf(target));
        System.out.println("Last Index of 'l': " + str.lastIndexOf('l'));
        System.out.println("Contains 'World': " + str.contains("World"));

        // 5. Extraction
        // substring(beginIndex, endIndex) -> endIndex is exclusive
        System.out.println("Substring (9 to 13): " + str.substring(9, 13)); 

        // 6. Splitting and Joining
        String names = "Apple,Banana,Cherry";
        String[] splitNames = names.split(",");
        System.out.println("Split first element: " + splitNames[0]);
        
        String joined = String.join(" - ", "Red", "Green", "Blue");
        System.out.println("Joined String: " + joined);

        // 7. Conversions and Checking
        int age = 25;
        String ageStr = String.valueOf(age); // Converts int to String
        System.out.println("Is empty? " + "".isEmpty());
        System.out.println("Is blank? (spaces only): " + "   ".isBlank());
    }
}
