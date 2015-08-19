#include <iostream>
#include <cmath>
using namespace std;

int main() {
   int num;
   cin >> num;
   if(num % 2 == 0 && abs(num) > 2)
      cout << "YES\n";
   else
      cout << "NO\n";
} 
