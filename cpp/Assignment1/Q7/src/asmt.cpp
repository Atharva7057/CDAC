#include <cstdio>
// In c
struct Employee {
    char Name[30];
    int id;
};

void addEmp(Employee *e) {
    printf("Enter Name: \n");
    fflush(stdout);
    scanf("%s", e->Name); // Correct for Name as it is already a pointer
    printf("Enter empid: \n");
    fflush(stdout);
    scanf("%d", &(e->id)); // Use the address-of operator '&' for id
}

void showEmp(Employee *e) {
    printf("Employee Name: %s\n", e->Name);
    printf("Employee Id: %d\n", e->id);
}

// In c++

struct Student{
	char Name[30];
	int roll;

	void addStudent(Student *s){
		printf("Enter Name: \n");
		    fflush(stdout);
		    scanf("%s", s->Name);
		    printf("Enter RollNo: \n");
		    fflush(stdout);
		    scanf("%d", &(s->roll));
	}

	void showStudent(Student *s) {
	    printf("Student Name: %s\n", s->Name);
	    printf("Student Roll: %d\n", s->roll);
	}
};
int main() {
    Student e;
    e.addStudent(&e);
    e.showStudent(&e);
    return 0;
}
int main1() {
    Employee e;
    addEmp(&e);
    showEmp(&e);

    return 0;
}
