#include <iostream>

/*
* A - New Year and Hurry
*/

using namespace std;

int main()
{
    int n, k, sum = 0, counter = 0;
    cin >> n >> k;

    while(sum + (counter + 1) * 5 <= 240 - k && counter < n) 
    {
        sum += (counter + 1) * 5;
        counter++;
    }
    cout << counter << endl;

    return 0;
}