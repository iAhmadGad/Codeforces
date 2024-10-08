#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

using namespace std;

/*
* A - Line Trip
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
	int n, x;
	cin >> n >> x;

	int maxDiff = 0;

	int a[n + 1];
	a[0] = 0;
	for(int i = 1; i <= n; i++)
	{
		cin >> a[i];

		maxDiff = max(maxDiff, a[i] - a[i - 1]);
	}

	cout << max((x - a[n]) * 2, maxDiff) << endl;
}
