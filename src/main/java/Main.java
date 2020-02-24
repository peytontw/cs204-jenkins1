import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Calculator myCalc = new Calculator();

		Scanner cin = new Scanner(System.in);

		System.out.println("Welcome to a simple Java Calculator!");
		System.out.println("Please enter a command for the Calculator");

		String command = "";

		while (true)
		{
			if (!command.equals(""))
			{
				System.out.println("Please enter a command for the Calculator");
			}

			command = cin.nextLine();

			if (command.equals("add"))
			{
				System.out.println("Please enter valid inputs to add for the lhs followed by the rhs");
				int lhs = cin.nextInt();
				int rhs = cin.nextInt();

				int result = myCalc.add(lhs, rhs);

				System.out.printf("Result = %d\n", result);
			}
			else if (command.equals("subtract"))
			{
				System.out.println("Please enter valid inputs to subtract for the lhs followed by the rhs");
				int lhs = cin.nextInt();
				int rhs = cin.nextInt();

				int result = myCalc.subtract(lhs, rhs);

				System.out.printf("Result = %d\n", result);
			}
			else if (command.equals("multiply"))
			{
				System.out.println("Please enter valid inputs to multiply for the lhs followed by the rhs");
				int lhs = cin.nextInt();
				int rhs = cin.nextInt();

				int result = myCalc.multiply(lhs, rhs);

				System.out.printf("Result = %d\n", result);
			}
			else if (command.equals("divide"))
			{
				System.out.println("Please enter valid inputs to divide for the lhs followed by the rhs");
				int lhs = cin.nextInt();
				int rhs = cin.nextInt();

				int result = myCalc.divide(lhs, rhs);

				System.out.printf("Result = %d\n", result);
			}
			else if (command.equals("fibonacciNumberFinder"))
			{
				System.out.println("Please enter a valid input for the fibonacciNumberFinder");
				int seqNum = cin.nextInt();

				int result = myCalc.fibonacciNumberFinder(seqNum);

				System.out.printf("Result = %d\n", result);
			}
			else if (command.equals("intToBinaryNumber"))
			{
				System.out.println("Please enter a valid input for the intToBinaryNumber");
				int intToBinaryNumber = cin.nextInt();

				String result = myCalc.intToBinaryNumber(intToBinaryNumber);

				System.out.printf("Result = %s\n", result);
			}
			else if (command.equals("createUniqueID"))
			{
				System.out.println("Please enter a valid input for the createUniqueID");
				String createUniqueID = cin.nextLine();

				String result = myCalc.createUniqueID(createUniqueID);

				System.out.printf("Result = %s\n", result);
			}
			else if (command.equals("help"))
			{
				System.out.println("The Calculator supports the following commands:");
				System.out.println("  add\n  subtract\n  multiply\n  divide\n  fibonacciNumberFinder\n  intToBinaryNumber\n  createUniqueID\n  exit");
			}
			else if (command.equals("exit"))
			{
				return;
			}
			else if (command.equals(""))
			{
				continue;
			}
			else
			{
				System.out.println("Invalid command. Please type 'help' if you need a list of the supported commands");
			}

			System.out.println();
		}
	}
}
