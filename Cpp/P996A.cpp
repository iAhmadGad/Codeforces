#include <bits/stdc++.h>
#include <iostream>

using namespace std;

/*
* A - Hit the Lottery
*/

int main()
{
    int money, bills = 0;
    cin>>money;
    int denominations[] = {100, 20 ,10 ,5 ,1};
    for(int i = 0; i < 5; i++)
    {
        int temp = money / denominations[i];
        bills += temp;
        money -= temp * denominations[i];
    }

    cout << bills << endl;
    return 0;
}