#include<bits/stdc++.h>
using namespace std;

int findPivotAndPutAtCorrectPlace(int arr[], int low, int high) {
    int pivot = arr[low];
    int i= low, j=high;

    while(i < j) {
        while(i <= j && arr[i] <= pivot) {
            i++;
        }

        while(i <= j && arr[j] > pivot) {
            j--;
        }

        if(i < j) {
            std::swap(arr[i], arr[j]);
        }
    }
    std::swap(arr[low], arr[j]);

    return j;
}

void quickSort(int arr[], int low, int high) {
    if(low >= high) {
        return;
    }

    int partitionIndex = findPivotAndPutAtCorrectPlace(arr, low, high);

    quickSort(arr, low, partitionIndex - 1);
    quickSort(arr, partitionIndex + 1, high);
}

void print(int arr[], int n) {
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int n;
    cin>> n;

    int arr[n];
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    quickSort(arr, 0, n-1);
    print(arr, n);
}