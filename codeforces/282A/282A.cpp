#include <iostream>
#include <string>
using namespace std;

int main() {
	int x = 0;
	int count;
	cin >> count;

	for(int i = 0; i < count; i++) {
		string op;
		cin >> op;

		if(op.find("++") != string::npos)
			x++;
		else
			x--;
	}
	cout << x << "\n";
}