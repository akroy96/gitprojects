#include<iostream>
#include<vector>
using namespace std;

int  main(){
  int N;
  cin>>N;
  int sum = 0;
  vector<int> A(N);
  for(int i = 0; i < N; i++){
  	cin >> A[i];
    sum += A[i];
	}
	cout << sum << endl;
    return 0;
  
}
