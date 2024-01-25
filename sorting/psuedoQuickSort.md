

findPivotAndPutAtCorrectPlace(arr, low, high) {
    //taking first element as pivot
    int pivot = arr[low];

    int i= low, j= high;
    
    while(i<j) {
        while(i<=j && arr[i] <= pivot) {
            //find an element greater than pivot from left
            i++;
        }
        while(i<=j && arr[j] > pivot) {
            //find an element smaller than pivot from right
            j--;
        }
        if(i < j) {
            swap(arr[i], arr[j]);
        }
    }

    swap(arr[low], arr[j])
    //pivot at its right place now (j).

    return j;
}


QS(arr, low, high) {
    if(low >= high) {
        //single element or none, already sorted
        return;
    }

    int partitionIndex = findPivotAndPutAtCorrectPlace(arr, low, high);
    //pivot we took is now at its correct place that is partition index.

    //pass the right and left portion of partition index to recursion to sort.
    QS(arr, low, partitionIndex-1);
    QS(arr, partitionIndex+1, high);
}