#include <stdio.h>

void sort(int *arr, int len);

void main() {
  int arr[5];

  for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
    printf("Enter value :");
    scanf("%d", &arr[i]);
  }

  for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
    printf("%d, ", arr[i]);
    // scanf("%d", &arr[i]);
  }

  sort(arr, 5);

  for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
    printf("%d, ", arr[i]);
    // scanf("%d", &arr[i]);
  }

}

void sort(int *arr, int len) {
  for (int i = 1; i < len; i++) {
    int temp = arr[i];
    int j = i - 1;

    while (j >= 0 && arr[j] > temp) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = temp;
  }
}