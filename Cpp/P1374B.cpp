#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

using namespace std;

/*
* B - Multiply by 2, divide by 6
*/


void solve();

int main()
{
	int t;
	cin >> t;
	for(int i = 0; i < t; i++) solve();

	return 0;
}

void solve()
{
	int n;
	cin >> n;

	int counter = 0;
	while(n > 1)
	{
		if(n % 6 == 0) n /= 6;
		else if(n * 2 % 6 == 0) n *= 2;
		else break;
		counter++;
	}

	if(n == 1) cout << counter << endl;
	else cout << -1 << endl;
}
