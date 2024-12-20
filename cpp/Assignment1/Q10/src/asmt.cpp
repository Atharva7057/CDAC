#include <cstdio>

struct Student{
	char Name[30];
	int Age;
	int marks;

	void addStudent(Student *s){
		printf("Enter Name: \n");
		    fflush(stdout);
		    scanf("%s", s->Name);
		    printf("Enter RollNo: \n");
		    fflush(stdout);
		    scanf("%d", &(s->Age));
		    printf("Enter Marks: \n");
		    fflush(stdout);
		    scanf("%d", &(s->marks));
	}

	void showStudent(Student *s) {
	    printf("Student Name: %s\n", s->Name);
	    printf("Student Roll: %d\n", s->Age);
	    printf("Student Marks: %d\n", s->marks);
	}
};
int main() {
	Student students[5];
	for(int i = 0; i < 2; i++){
		Student e;
		e.addStudent(&e);
		students[i] = e;
		printf("---------------------------------------\n");
	}

	for(int i = 0; i < 2; i++){
		Student s = students[i];
		s.showStudent(&s);
		printf("---------------------------------------\n");
	}
//    e.showStudent(&e);
    return 0;
}

