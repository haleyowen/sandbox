#include <iostream>
#include <string>
using namespace std;

int main() {
	string line1;
	string line2;

	getline(cin, line1);
	getline(cin, line2);

	//gets revers of line1 to check with line2
	string check;
	for(int i = line1.size() - 1; i >= 0; i--) {
		check += line1[i];
	}

	if(line2.compare(check) == 0)
		cout << "YES\n";
	else
		cout << "NO\n";
}