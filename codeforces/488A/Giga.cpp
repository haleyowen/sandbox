#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
	int floor;
	cin >> floor;

	int count = 0;
	bool stop = false;
	while(!stop) {
		string floorStr = to_string(floor);
		if(floorStr.find("8") != string::npos) {
			cout << count << "\n";
			stop = true;
		}
		else {
			count++;
			floor++;
		}
	}
}