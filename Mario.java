import java.io.Console;

public class Mario{

	public static void main (String[] args){

		Console console = System.console();

		// initialize the int we are getting from user
		int n;

		// get number of rows from user. Check to make sure the number is between 1 and 23
		do {
			System.out.print("Enter a number between 1 and 23: ");
			n = Integer.parseInt(console.readLine());
		} while (n < 1 || n > 23);

		// Create Pyramid
        for (int i = 0; i < n; i++){

        	// Number of Hashes
        	int hashes = (i + 2);
        	// Number of Spaces
        	int spaces = (n - (i + 1));

        	//print spaces
             for (int k = 0; k < spaces; k++){
                 System.out.printf(" ");
            }

        	// print Hashes
            for (int j = 0; j < hashes ; j++){
                System.out.printf("#");
            }

            // Print Lines
            System.out.printf("\n");
        }


	}
}