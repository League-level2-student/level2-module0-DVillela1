package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] r = {"Hello", "I", "Speak", "Mild", "Portuguese"};
		//2. print the third element in the array
		System.out.println(r[3]);
		//3. set the third element to a different value
		r[3] = "Talk";
		//4. print the third element again
		System.out.println(r[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int h = 0; h < 6; h++) {
			System.out.println(r[h]);
		}
		//6. make an array of 50 integers
			int[] p = new int[50];
		//7. use a for loop to make every value of the integer array a random number
			for (int x = 0; x < 51; x++) {
				int p[] = {x}; 
			}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println();
		//9 print the entire array to see if step 8 was correct
		System.out.println(p);
		//10. print the largest number in the array.
		System.out.println(p[50]);
	}
}
