class Quicksortfunction {
  public static void quickSort(int arr[], int low, int high){
    if(low<high){
      int q = partition(arr,low,high);

      quickSort(arr,low,q-1);
      quickSort(arr,q+1,high);
    }
  }
  public static int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j = low; j<high; j++){
      if(arr[j]<=pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return (i+1);
  }
  void printSorted(int arr[]){
    for(int i = 0; i<10 ; i++){
      System.out.printf("%d ", arr[i]);
    }
  }
}

class quicksort{
  public static void main(String [] args){
  int [] marks = new int[]{5,6,3,2,1,4,7,9,8,0};
  Quicksortfunction qs = new Quicksortfunction();
  qs.quickSort(marks, 0, 9);
  qs.printSorted(marks);
  }
}
