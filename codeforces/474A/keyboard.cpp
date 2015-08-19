#include <iostream> 
#include <string>
#include <fstream>
using namespace std;

int main() {
  string top = "qwertyuiop";
  string middle = "asdfghjkl;";
  string bottom = "zxcvbnm,./";

  string shift, line;
  cin >> shift >> line;
  int move = (shift.find("L") != string::npos) ? 1 : -1;

  for(int i = 0; i < line.length(); i++) {
    char cur = line[i];
    int findTop = top.find(cur);
    int findMiddle = middle.find(cur);
    int findBottom = bottom.find(cur);
    
    if(findTop != string::npos) {
      cout << top[findTop + move];
    }
    else if(findMiddle != string::npos) {
      cout << middle[findMiddle + move];
    }
    else if(findBottom != string::npos) {
      cout << bottom[findBottom + move];
    }
  }
  cout << "\n";
}
      
