#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
	string guest, host, letters;
	cin >> guest >> host >> letters;

	string combine = guest + host;
	sort(combine.begin(), combine.end());
	sort(letters.begin(), letters.end());

	if(combine == letters) 
		cout << "YES\n";
	else
		cout << "NO\n";
}