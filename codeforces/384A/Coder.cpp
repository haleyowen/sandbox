#include <iostream>
#include <math.h>
using namespace std;

int main() {
	int n;
	cin >> n;

	if(n % 2 == 0)
		cout << pow(n, 2) / 2 << "\n";
	else
		cout << (int)pow(n, 2) / 2 + 1 << "\n";

	for(int i = 0; i < n; i++) {
		for(int j = 0; j < n; j++) {
			if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0))
				cout << 'C';
			else 
				cout << '.';
		}
		cout << "\n";
	}
}