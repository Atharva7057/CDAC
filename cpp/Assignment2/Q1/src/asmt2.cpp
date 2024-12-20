#include <iostream>
#include <string.h>
using namespace std;

class Student{
	private:
		string Name;
		int rollNo;
		int marks;
		char grade;

	public:
		void setName(string Name){
			this->Name = Name;
		}
		void setRollNo(int rollNo){
			this->rollNo = rollNo;
		}
		void setMarks(int marks){
			this->marks = marks;
		}
		void setGrade(char grade){
			this->grade = grade;
		}

		string getName(){
			return Name;
		}
		int getRollNo(){
			return rollNo;
		}
		int getMarks(){
			return marks;
		}
		char getGrade(){
			return grade;
		}

		char calculateGrade(int marks){
			if(marks >= 90 && marks <= 100){
				return 'A';
			}else if(marks >= 80 && marks < 90){
				return 'B';
			}else if(marks >= 70 && marks < 80){
				return 'C';
			}else if(marks >= 60 && marks < 69){
				return 'D';
			}else if(marks < 60){
				return 'F';
			}else{
				cout<< "Enter Invalid Marks";
				return 'F';
			}
		}
};

int main(){
	int choice = 0;
	Student s;
	do{
		cout<< "------------------------------------------------------------"<< endl;
		cout << "1. Accept Information " << endl;
		cout << "2. Display Information " << endl;
		cout << "3. Calculate grade " << endl;
		cout << "4. Exit program" << endl;
		cout << "Enter your choice: " << endl;
		cin >> choice;

		switch(choice){
			case 1:{
				string Name;
				int roll;
			    int marks;
			    cout << "Enter Name: " << endl;
			    fflush(stdout);
				cin >> Name;
				s.setName(Name);

				cout << "Enter RollNo: " << endl;
				fflush(stdout);
				cin >> roll;
				s.setRollNo(roll);

				cout << "Enter Marks: " << endl;
				fflush(stdout);
				cin >> marks;
				s.setMarks(marks);

				break;
			}


			case 2:{
				cout << "Name: " << s.getName() << endl;
				cout << "Roll No: "<< s.getRollNo()<< endl;
				cout << "Marks: " << s.getMarks()<< endl;
				cout << "Grade: "<< s.getGrade() << endl;
				break;
			}


			case 3:{
				char grade;
			    grade = s.calculateGrade(s.getMarks());
				s.setGrade(grade);
				cout << "Grades Added";
				break;
			}

			case 4:
				cout << "Exiting.......";
				break;
			default:
				cout << "Invalid Input..."<< endl;

		}
	}while(choice != 4);

	return 0;
}


