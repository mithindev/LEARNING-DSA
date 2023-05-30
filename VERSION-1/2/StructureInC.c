#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct human {
  char name[100];
  int age;
  char gender[100];
};

void main() {
  struct human mithin;
  strcpy(mithin.name, "Mithin Dev");
  mithin.age = 19;
  strcpy(mithin.gender, "Male");
}