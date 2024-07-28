#include <iostream>

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
  string s;
  cin >> s;
  string s1 = s.substr(0, s.length() / 2);
  string s2 = s.substr(s.length() / 2, s.length());
  cout << (s1 == s2 ? "YES" : "NO") << endl;
}
