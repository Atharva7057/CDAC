#include <cstdio>

class Employee{
public:
	char Name[30];
	int id;
	int salary;

	void addEmployee(Employee *s){
		printf("Enter Name: \n");
		    fflush(stdout);
		    scanf("%s", s->Name);
		    printf("Enter id: \n");
		    fflush(stdout);
		    scanf("%d", &(s->id));
		    printf("Enter salary: \n");
		    fflush(stdout);
		    scanf("%d", &(s->salary));
	}

	void showEmployee(Employee *s) {
	    printf("Employee Name: %s\n", s->Name);
	    printf("Employee id: %d\n", s->id);
	    printf("Employee salary: %d\n", s->salary);
	}
};
int main() {
	Employee Employees[5];
	for(int i = 0; i < 2; i++){
		Employee e;
		e.addEmployee(&e);
		Employees[i] = e;
		printf("---------------------------------------\n");
	}

	for(int i = 0; i < 2; i++){
		Employee s = Employees[i];
		s.showEmployee(&s);
		printf("---------------------------------------\n");
	}
//    e.showEmployee(&e);
    return 0;
}

