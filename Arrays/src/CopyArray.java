
public class CopyArray {
	 public static void main(String[] args) {

		 int[] source = {100, 200, 300};

		 // creates an integer array with 3 element

		 int[] dest = new int[3];

		 // copying an elements from source to dest array

		 System.arraycopy(source, 0, dest, 0, source.length);

		 for (int i =0; i < dest.length; i++)

		 System.out.println("Element at index " + i + ": " + dest[i]);

		 }
}
