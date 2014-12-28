#include <string>
#include <iostream>
using namespace std;

void selectionSort(string[]);

int main() {
    string words []= {"james","joe","john","bill","ken"};
    
    selectionSort(words);
    for(int x = 0; x < sizeof(words)/sizeof(*words); x++) {
        cout << words[x] + "\n";
        cout << sizeof(words[x]);

    }

}

void selectionSort(string arr[]) {
    int i, j, minIndex;
    string tmp;   
    int n = sizeof(arr)/sizeof(*arr);
    for (i = 0; i < n - 1; i++) {
        minIndex = i;
        for (j = i + 1; j < n; j++)
            if (arr[j] < arr[minIndex])
                minIndex = j;
        if (minIndex != i) {
            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }
}

void print_array(string arr[]) {

    
}

