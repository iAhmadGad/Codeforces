#include <iostream>
using namespace std;

/*
* B - Even Array
*/

void solve();

int main() {
	int t;
	cin >> t;
	for(int i = 0; i < t; i++) solve();

	return 0;
}

void solve()
{
	int n, counter1 = 0, counter2 = 0;
	cin >> n;
	for(int i = 0; i < n; i++)
	{
		int a;
		cin >> a;
		if(i % 2 == 0 && a % 2 != 0) counter1++;
		else if(i % 2 != 0 && a % 2 == 0) counter2++;
	}

	if(counter1 - counter2 == 0) cout << counter1 << endl;
	else cout << -1 << endl;
}


