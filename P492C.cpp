#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include <bits/stdc++.h>

#define ll long long

using namespace std;

/*
 * C - Vanya and Exams
 */

int main()
{
	ll n, r, avg;
	cin >> n >> r >> avg;

	ll sum = 0;
	vector<pair<ll, ll>> ab(n);
	for(int i = 0; i < n; i++)
	{
		cin >> ab[i].second >> ab[i].first;
		sum += ab[i].second;
	}

	sort(ab.begin(), ab.end());

	ll essays = 0, required = n * avg;
	for(int i = 0; i < n; i++)
	{
		if(sum >= required) break;
		ll diff = min(required - sum, r - ab[i].second);
		essays += diff * ab[i].first;
		sum += diff;
	}

	cout << essays;

	return 0;
}
