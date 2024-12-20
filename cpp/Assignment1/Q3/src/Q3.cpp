#include <iostream>
using namespace std;
int main(){
	int num1 = 10;
	int *ptr = NULL;
	cout << ptr << endl; //0
	ptr = &num1;
	cout << ptr; //num1 address
	return 0;
}

