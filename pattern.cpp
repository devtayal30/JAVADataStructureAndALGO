#include <iostream>

using namespace std;

int main()
{

    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    for (int i = 0; i < n; i++)
    {

        for (int j = 0; j < n; j++)
        {

            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i + j == n - 1)
            {
                cout << "*";
            }
            else
            {
                cout << " ";
            }
        }

        cout << endl;
    }

    return 0;
}

given an array of number in random order within the range of sorted ascending order so the
    first half will be smallest to largest and next how will be from largest to smallest in C++
