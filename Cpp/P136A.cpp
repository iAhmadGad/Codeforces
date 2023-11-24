#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int  p[n], output[n];
    for(int i = 0; i < n; i++)
    {
     cin>>p[i];
     output[p[i] - 1] = i + 1;
    }
    for(int i = 0; i < n; i++) cout<<output[i]<<" ";
    cout<<endl;
    return 0;
}