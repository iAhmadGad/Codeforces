#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

#define ll long long

using namespace std;

/*
* B - Chip and Ribbon
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

	int c[n];

	for(int i = 0; i < n; i++) cin >> c[i];

	ll counter = c[0] - 1;
	for(int i = 0; i < n - 1; i++)
	{
		counter += max(0, c[i + 1] - c[i]);
	}

	cout << counter << endl;
}
