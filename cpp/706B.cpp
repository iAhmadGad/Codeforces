#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include<bits/stdc++.h>

#define ll long long

using namespace std;

/*
 * B - Interesting drink
 */

int main()
{
	int n;
	cin >> n;

	int x[n];
	for(int i = 0; i < n; i++) cin >> x[i];
	sort(x, x + n);

	int q;
	cin >> q;

	for(int i = 0; i < q; i++)
	{
		int mi;
		cin >> mi;

		int shops = upper_bound(x, x + n, mi) - x;
		cout << shops << endl;
	}

	return 0;
}
