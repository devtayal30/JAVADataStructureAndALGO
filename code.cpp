#include <bits/stdc++.h>

using namespace std;

vector<int> sorting(vector<int> &arr)
{
    sort(arr.begin(), arr.end());
    reverse(arr.begin() + arr.size() / 2, arr.end());
    return arr;
}

int main()
{
    int n;
    cin >> n;
    vector<int> arr;
    for (int i = 0; i < n; i++)
    {
        int temp;
        cin >> temp;
        arr.push_back(temp);
    }

    vector<int> temp = sorting(arr);
    for (auto it : temp)
        cout << it << " ";
}