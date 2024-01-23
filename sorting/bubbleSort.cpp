#include <bits/stdc++.h>

using namespace std;

void print(int arr[], int n){
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

void bubbleSort(int arr[], int n) {
    for(int i=1; i<= n-1; i++) {
        bool isAnyElementSwapped = false;
        for(int j=0; j< n-i; j++) {
            if(arr[j+1] < arr[j]) {
                std::swap(arr[j+1], arr[j]);
                isAnyElementSwapped = true;
            }
        }

        if(!isAnyElementSwapped) {
            //No element swapped in this iteration, STOP. Array is sorted now.
            return;
        }
    }
}


int main() {
    int n;
    cin>>n;

    int arr[n];

    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }
    bubbleSort(arr, n);
    print(arr, n);
}