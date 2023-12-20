#include <iostream>
#include <set>

using namespace std;

int main()
{
    int n, p1, p2;
    set<int> lvls;

    cin>>n>>p1;
    for(int i = 0; i < p1; i++)
    {
        int temp;
        cin>>temp;
        lvls.insert(temp);
    }

    cin>>p2;
    for(int i = 0; i < p2; i++)
    {
        int temp;
        cin>>temp;
        lvls.insert(temp);
    }

    if(lvls.size() == n) cout<<"I become the guy."<<endl;
    else cout<<"Oh, my keyboard!"<<endl;

    return 0;
}