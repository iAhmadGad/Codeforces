#include <bits/stdc++.h>
#include <iostream>

using namespace std;

/*
* A - Games
*/
int main()
{
    int n, counter = 0;
    cin>>n;
    int home[n], guest[n];
    for(int i = 0; i < n; i++) cin >> home[i] >> guest[i];
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(home[i] == guest[j]) counter++;
        }
    }
    cout << counter << endl;
    return 0;
}