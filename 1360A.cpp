#include <iostream>
#include <cmath>

/*
 * A - Minimal Square
 */

using namespace std;

void solve();

int main()
{
  int t;
  cin >> t;
  while(t--)
  {
    solve();
  }
  return 0;
}

void solve()
{
  int a, b;
  cin >> a >> b;
  int length = max(a, b), width = min(a, b);
  cout << pow(max(width * 2, length), 2) << endl;
}
