
#include <bits/stdc++.h>

using namespace std;

void selectionSort(int arr [], int n) {
    //As it takes n-1 steps to sort an array.
    for(int i=0; i<= n-2; i++) {
        //select min
        int min = arr[i];
        int minIdx= i;
        for(int j=i+1; j<n; j++) {
            if(arr[j] < min) {
                min = arr[j];
                minIdx = j;
            }
        } 
        //swap
        std::swap(arr[i], arr[minIdx]);
    }
}

void print(int arr[] , int n) {
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main() {
    int arr [] = {13, 46, 24, 52, 20, 9};
    int n= 6;
    selectionSort(arr, n);
    print(arr, n);
}