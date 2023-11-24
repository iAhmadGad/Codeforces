#include <bits/stdc++.h>
#include <iostream>

using namespace std;

/*
* A - Arrival of the General
*/

int main()
{
    int n, seconds = 0;
    cin>>n;
    int a[n];
    for (int i = 0; i < n; i++) cin>>a[i];

    int sorted[n];
    for (int i = 0; i < n; i++) sorted[i] = a[i];
    sort(sorted, sorted + n);

    int first = sorted[n - 1], last = sorted[0], firstIndex;

    for(int i = 0; i < n; i++)
    {
        if(a[i] == first)
        {
            seconds += i;
            firstIndex = i;
            break;
        }
    }

    for(int i = n - 1; i > -1; i--)
    {
        if(a[i] == last)
        {
            seconds += n - 1 - i;
            if(firstIndex > i) seconds--;
            break;
        }
    }

    cout<<seconds<<endl;

    return 0;
}