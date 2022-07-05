package Problems_Solve;

import java.util.HashSet;

public class Duplicate_element {

    static boolean findingDuplicate(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {


            if (hashSet.contains(arr[i]))
                return true;

            hashSet.add(arr[i]);

        }


        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        if (findingDuplicate(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
