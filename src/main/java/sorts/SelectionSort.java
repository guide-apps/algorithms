package sorts;

public class SelectionSort implements SortAlgorithm {

	@Override
    public void sort(Integer[] array) {
      for (int i=0; i<array.length; i++) {
        int minIndex = findMinimumIndex(array, i);
        swap(array, i, minIndex);
      }      
    }

    private int findMinimumIndex(Integer[] array, Integer firstIndex) {
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

    private void swap(Integer[] array, Integer fromIndex, Integer toIndex) {
      int temp = array[fromIndex];
      array[fromIndex] = array[toIndex];
      array[toIndex] = temp;
    }

}
