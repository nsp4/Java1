package Lab2;

import java.util.Arrays;

public class AlphabetArray {
public static void main(String[] args) {
		//random
		String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};
	    sortString(stringArray);

	}

	public static void sortString(String[] sArr)
	{
	    Arrays.sort(sArr);
	    System.out.println(Arrays.toString(sArr));
	}
}


