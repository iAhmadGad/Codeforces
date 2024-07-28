#include <iostream>

using namespace std;

/*
 * A - Raising Bacteria
 */

int main()
{
  int x, xn = 0;
  cin >> x;
  while(x)
  {
	  if(x & 1) xn++;
	  x >>= 1;
  }
  cout << xn << endl;

  return 0;
}
