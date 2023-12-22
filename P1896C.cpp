#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

#define ll long long

using namespace std;

/*
* C - Matching Arrays
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
	
	vector<pair<int,int> > a;
	for(int i = 0; i < n; i++)
	{
	  int ai;
	  cin >> ai;
	  a.emplace_back(ai, i);
	}
	
	vector<int> b;
	for(int i = 0; i < n; i++)
	{
	  int bi;
	  cin >> bi;
	  b.push_back(bi);
	}
	
	sort(a.begin(), a.end());
	sort(b.begin(), b.end());
	
	int ans[n];
	
	int counter = 0;
	for(int i = n - x; i < n; i++)
	{
	  if(a[i].first > b[counter]) ans[a[i].second] = b[counter++];
	  else
	  {
	    cout << "NO" << endl;
	    return;
	  }
	}
	
	for(int i = 0; i < n - x; i++)
	{
	  if(a[i].first <= b[counter]) ans[a[i].second] = b[counter++];
	  else
	  {
	    cout << "NO" << endl;
	    return;
	  }
	}
	
	cout << "YES" << endl;
	for(int i = 0; i < n; i++) cout << ans[i] << " ";
	cout << endl;
}
