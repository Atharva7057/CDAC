#include <cstdio>

struct Student{
	char Name[30];
	int roll;
	int marks;

	void addStudent(Student *s){
		printf("Enter Name: \n");
		    fflush(stdout);
		    scanf("%s", s->Name);
		    printf("Enter RollNo: \n");
		    fflush(stdout);
		    scanf("%d", &(s->roll));
		    printf("Enter Marks: \n");
		    fflush(stdout);
		    scanf("%d", &(s->marks));
	}

	void showStudent(Student *s) {
	    printf("Student Name: %s\n", s->Name);
	    printf("Student Roll: %d\n", s->roll);
	    printf("Student Marks: %d\n", s->marks);
	}
};
int main() {
    Student e;
    e.addStudent(&e);
    e.showStudent(&e);
    return 0;
}

