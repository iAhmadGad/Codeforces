#include <iostream>
#include <vector>

using namespace std;

/*
 * A - Team Olympiad
 */

int main()
{
  int n;
  cin >> n;

  vector<int> v1, v2, v3;

  for(int i = 1; i <= n; i++)
   {
     int t;
     cin >> t;

     if(t == 1) v1.push_back(i);
     else if(t == 2) v2.push_back(i);
     else v3.push_back(i);
   }

  int minSize = min(v1.size(), min(v2.size(), v3.size()));

  cout << minSize << endl;
  for(int i = 0; i < minSize; i++) cout << v1[i] << " " << v2[i] << " " << v3[i] << endl;
  return 0;
}
