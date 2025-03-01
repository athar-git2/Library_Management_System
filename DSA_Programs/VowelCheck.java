
public class VowelCheck {
    
    public static boolean vowelCheck(String s)
    {
        return s.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        
        System.out.println(vowelCheck("Hello"));

        System.out.println(vowelCheck("TV"));
    }
}


// OUTPUT****************

// true
// false