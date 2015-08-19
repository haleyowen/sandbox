#include <iostream>
#include <string>
#include <map>
using namespace std;

int main() {
  int n, m;
  cin >> n >> m;

  map<string, string> language;

  for(int i = 0; i < m; i++) {
    string first, second;
    cin >> first >> second;

    string prefer = (first.length() <= second.length()) ? first : second;

    language[first] = prefer;
  }

  for(int i = 0; i < n; i++) {
    string word;
    cin >> word;

    auto chosenWord = language.find(word);

    cout << chosenWord->second;
  }
  cout << "\n";
}
