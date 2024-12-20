#include <iostream>
using namespace std;

int main(){
//	pointer to a const value
	const int num1 = 10;
	const int *ptr = &num1;
	cout << ptr << endl;

//	const pointer to a value
	int num2 = 20;
	int *const ptr1 = &num2;
	cout << ptr1 << endl;

//	const ptr to const int
	const int num3 = 30;

	const int *const ptr2 = &num3;
	cout << ptr2 << endl;
	return 0;
}
