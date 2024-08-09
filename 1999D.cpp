#include <iostream>

using namespace std;

int main()
{
  int t;
  string s1, s2;
  cin >> t;
  while(t--)
  {
    cin >> s1 >> s2;
    for(int i = 0; i < s1.length(); i++)
    {
      if(s1[i] == '?')
      {
        if(s2.length() > 0)
        {
          s1[i] = s2[0];
          s2.erase(0, 1);
        }
        else
        {
          s1[i] = 'a';
        }
      }
      else if(s2.length() > 0)
      {
        if(s1[i] == s2[0])
        {
          s2.erase(0, 1);
        }
      }
    }
    cout << (s2.length() == 0 ? "YES\n" + s1: "NO") << endl;
  }
  return 0;
}
