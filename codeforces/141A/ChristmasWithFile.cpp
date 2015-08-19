#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main() {
	ifstream infile("christmas.txt");
	int count;
	infile >> count;
	for(int i = 0; i < count; i++) {
		string guest, host, letters;
		infile >> guest >> host >> letters;

		string combine = guest + host;
		sort(combine.begin(), combine.end());
		sort(letters.begin(), letters.end());

		if(combine == letters) 
			cout << "YES\n";
		else
			cout << "NO\n";
	}
}