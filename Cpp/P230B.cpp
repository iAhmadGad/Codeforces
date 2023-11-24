#include <bits/stdc++.h>
#include <cmath>
#include <iostream>

/*
* A - T-primes
*/

using namespace std;

bool isPrime(long n);

int main()
{
    int n;
    cin >> n;

    for(int i = 0; i < n; i++)
    {
        long long current;
        cin >> current;
        long double sqrtDouble = sqrt(current);
        long long sqrtInteger = sqrt(current);

        if(sqrtDouble == sqrtInteger && isPrime(sqrtInteger)) cout << "YES" << endl;
        else cout << "NO" << endl;
    }

    return 0;
}

bool isPrime(long n)
{
    if(n == 0 || n == 1) return false;
    for(long i = 2; i * i <= n; i++)
    {
        if(n % i == 0) return false;
    }
    return true;
}