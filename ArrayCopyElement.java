package Day6;

public class ArrayCopyElement {
	public static void main(String[] args) {
		int[] arr = {10,15,45,78,65,63};
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
		}
		System.out.println("After copying elements of array1 to array2");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
