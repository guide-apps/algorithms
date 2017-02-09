package sorts;

public class SelectionSort {

    public static void main(String [] args) {

      Integer [] arrayOfIntsOne = {87, 56, 4, 78, 23, 2, 1};
      Integer [] arrayOfIntsTwo = {99, 64, 9, 1, 100, 4, 45};

      new SelectionSort().sort(arrayOfIntsOne);
      new SelectionSort().sort(arrayOfIntsTwo);

    }

    public void sort(Integer [] array) {
      for (int i=0; i<array.length; i++) {
        int minIndex = findMinimumIndex(array, i);
        swap(array, i, minIndex);
      }      
    }

    private int findMinimumIndex(Integer [] array, Integer firstIndex) {
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

    private void swap(Integer [] array, Integer fromIndex, Integer toIndex) {
      int temp = array[fromIndex];
      array[fromIndex] = array[toIndex];
      array[toIndex] = temp;
    }

}
