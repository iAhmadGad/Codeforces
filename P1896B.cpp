#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include <bits/stdc++.h>

#define ll long long

using namespace std;

/*
 * B - AB Flipping
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

	string s;
	cin >> s;

	set<int> used;
	int counter = 0;

	for(int i = 0; i < n - 1; i++)
	{
		if(s[i] == 'A' && s[i + 1] == 'B' && (used.find(i) == used.end()))
		{
			swap(s[i], s[i + 1]);
			used.insert(i);
			counter++;
		}
	}

	for(int i = n - 2; i >= 0; i--)
		{
			if(s[i] == 'A' && s[i + 1] == 'B' && (used.find(i) == used.end()))
			{
				swap(s[i], s[i + 1]);
				used.insert(i);
				counter++;
			}
		}

	cout << counter << endl;
}
