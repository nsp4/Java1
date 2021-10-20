package Lab2;

public class DupArray {
	public static void main(String[] args) {
		int[] a = { 21, 34, 4, 7, 94, 87, 50 };
		int len = a.length;

		modifyArray(a, len);

	}
	static void modifyArray(int a[], int n) {
		int temp, j = 0;
		int[] newa = new int[n];

		System.out.println("Elements of original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				newa[j++] = a[i];
			}
		}
		newa[j++] = a[n - 1];

		for (int i = 0; i < j; i++) {
			a[i] = newa[i];
		}

		System.out.println();
		System.out.println();

		System.out.println("After removing duplicate elements : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i] < a[k]) {
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	}


