#include <iostream>

using namespace std;

/*
 * A - Marathon
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
  int a, b, c, d;
  cin >> a >> b >> c >> d;
  cout << (b > a) + (c > a) + (d > a) << endl;
}
