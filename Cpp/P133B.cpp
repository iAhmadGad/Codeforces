#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <string>

#define ll long long

using namespace std;

/*
* B - Unary
*/

string toBinary(string unary);
ll getAnswer(string binary);

int main()
{
	string bf;
	cin >> bf;

	cout << getAnswer(toBinary(bf));

	return 0;
}

string toBinary(string unary)
{
	string binary;

	for(int i = 0, len = unary.length(); i < len; i++)
	{
		if(unary[i] == '>') binary += "1000";
		else if(unary[i] == '<') binary += "1001";
		else if(unary[i] == '+') binary += "1010";
		else if(unary[i] == '-') binary += "1011";
		else if(unary[i] == '.') binary += "1100";
		else if(unary[i] == ',') binary += "1101";
		else if(unary[i] == '[') binary += "1110";
		else if(unary[i] == ']') binary += "1111";
	}

	return binary;
}

ll getAnswer(string binary)
{
	ll answer = 0;

	for(int i = 0, len = binary.length(); i < len; i++) answer = (answer * 2 + (binary[i] - '0')) % 1000003;

	return answer;
}
