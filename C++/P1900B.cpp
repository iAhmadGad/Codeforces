#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>

#define ll long long

using namespace std;

/*
* B - Laura and Operations
*
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
  int a, b, c;
  cin >> a >> b >> c;
  
  cout << ((b - c) % 2 == 0) << " "
  << ((c - a) % 2 == 0) << " "
  << ((a - b) % 2 == 0) << endl;
}
