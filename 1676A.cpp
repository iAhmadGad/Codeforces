#include <string>
#include <iostream>

using namespace std;

/*
 * A - Lucky?
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
  string s;
  cin >> s;
  int sum1 = 0, sum2 = 0;
  for(int i = 0, len = s.length(); i < 3; i++)
    {
      sum1 += s[i];
      sum2 += s[len - 1 - i];
    }
  cout << (sum1 == sum2 ? "YES" : "NO")  << endl;
}
