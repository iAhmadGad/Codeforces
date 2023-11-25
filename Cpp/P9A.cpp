#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>

#define ll long long

using namespace std;

/*
* A - Die Roll
*/

int main()
{
	int Y, W;
	cin >> Y >> W;

	string probabilities[] = {"1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};

	cout <<  probabilities[6 - max(Y, W)];

	return 0;
}
