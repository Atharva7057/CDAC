#include <iostream>
using namespace std;

int main(){
//	const int *pointer
	const int num1 = 10;
	const int *ptr = &num1; //ok num1 is constant
	int n = 50;
	const int *nptr = &n; //ok n is non constant
	cout << ptr << endl;
	cout << nptr << endl;

//	const int *pointer
	int num2 = 20;
	int *const ptr1 = &num2;
//	ptr1 = &n; NOT OK BECAUSE ptr1 IS CONSTANT READY TO STORE NON CONSTANT VALUE ADDRESS
	cout << ptr1 << endl;

//	const INT const ptr
	const int num3 = 30; // constant var
	int num4 = 60; // Non constant var
	const int *const ptr2 = &num3; //ok
	const int *const ptr4 = &num4; //ok
	cout << ptr2 << endl;
	cout << ptr4 << endl;
	return 0;
}

