#include <iostream>
using namespace std;
int main(){
	int num1 = 10;
	int *ptr; // wild pointer

	cout << ptr << endl;
	ptr = &num1;
	cout << ptr;
	return 0;
}
