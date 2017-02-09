package sorts;

import java.utils.Arrays;

public class SelectionSort {

    public void sort(int [] array) {
      System.out.println("Unsorted array: " + Arrays.toString(array));

      for (int i=0; i<array.length; i++) {
        int minIndex = findMinimumIndex(array, i);
        swap(array, i, minIndex);
      }

      System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public int findMinimumIndex(int [] array, int firstIndex) {
        int minElem = array[firstIndex];
        int minElemIndex = firstIndex;

        for (int i=minElemIndex+1; i<array.length; i++) {
          if (array[i] < minElem) {
            minElem = array[i];
            minElemIndex = i;
          }
        }

        return minElemIndex;
    }

    public void swap(int [] array, int fromIndex, int toIndex) {
      int temp = array[fromIndex];
      array[fromIndex] = array[toIndex];
      array[toIndex] = temp;
    }

}
