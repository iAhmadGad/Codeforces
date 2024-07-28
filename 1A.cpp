#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main()
{
    unsigned long long n, m, a;
    cin>>n>>m>>a;
    cout.setf(ios::fixed);
    cout<< setprecision(0) << ceil((double)n/a) * ceil((double)m/a) << endl;

    return 0;
}