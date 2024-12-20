#include <iostream>
#include <string.h>
using namespace std;

class BankAccount{
	public:
		int accnumber;
		string Name;
		double balance;

		BankAccount(int accnumber,string Name,double balance){
			this->accnumber = accnumber;
			this->Name = Name;
			this->balance= balance;
		}
	public:
		int getAccnumber() const {
			return accnumber;
		}

		void setAccnumber(int accnumber) {
			this->accnumber = accnumber;
		}

		double getBalance() const {
			return balance;
		}

		void setBalance(double balance) {
			this->balance = balance;
		}

		const string& getName() const {
			return Name;
		}

		void setName(const string &name) {
			Name = name;
		}

};

int main(){
	int choice = 0;
	BankAccount acc(7057,"Atharva",0.00);
	do{
		cout<< "------------------------------------------------------------"<< endl;
		cout << "1. Deposit Money " << endl;
		cout << "2. Withdraw Money " << endl;
		cout << "3. Display Account Details " << endl;
		cout << "4. Exit program" << endl;
		cout << "Enter your choice: " << endl;
		cin >> choice;

		switch(choice){
			case 1:{
				double amt;
				cout<<"Enter Amount:"<<endl;
				cin >> amt;
				double total = acc.getBalance()+amt;
				acc.setBalance(total);
				break;
			}

			case 2:{
				double wd;
				cout << "Enter Amount to Withdraw"<<endl;
				cin >> wd;
				double total = acc.getBalance()-wd;
				acc.setBalance(total);
				break;
			}


			case 3:{
				cout<< "**********ACCOUNT DETAILS************"<< endl;
				cout << "Account Number: \t"<< acc.getAccnumber()<< endl;
				cout << "Account Holders Name: \t"<< acc.getName()<< endl;
				cout << "Account Balance: \t"<< acc.getBalance()<< endl;
				break;
			}

			case 4:
				cout << "Exiting..."<<endl;
				break;
			default:
				cout << "Invalid Input..."<< endl;

		}
	}while(choice != 4);

	return 0;
}


