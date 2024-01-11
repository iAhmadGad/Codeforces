#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>
#include <bits/stdc++.h>

#define ll long long

using namespace std;

/*
 * A - Ilya and Bank Account
 */

int main()
{
	int n;
	cin >> n;

	if(n >= 0) cout << n;
	else
	{
		string s = to_string(n);
		int len = s.length();
		s = s.erase(s[len - 1] > s[len - 2] ? s.length() - 1: s.length() - 2, 1);
		if(s == "-0") cout << 0;
		else cout << s;
	}

	return 0;
}
