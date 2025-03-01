public class SwapWithoutThirdVariable {
    
        public static void main(String[] args) {
            
            int a = 10;
            int b = 20;

            System.out.println("Before Swapping: "+ a + " " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swapping: "+ a + " " + b);

        }
}

// OUTPUT**********************

// Before Swapping: 10 20
// After Swapping: 20 10
