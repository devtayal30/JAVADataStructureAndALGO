#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    cout << "Enter the size of the array: ";
    cin >> n;

    int arr[n];
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        arr[i] = arr[i + 1];
    }

    sort(arr, arr + n / 2);

    sort(arr + n / 2, arr + n, greater<int>());

    cout << "Sorted array: ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
        cout << arr[i + 1] << " ";
    }

    return 0;
}
