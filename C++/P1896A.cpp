#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

#define ll long long

using namespace std;

/*
* A - Jagged Swaps
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

	int a[n];
	for(int i = 0; i < n; i++) cin >> a[i];

	if(a[0] == 1) cout << "YES" << endl;
	else cout << "NO" << endl;
}
