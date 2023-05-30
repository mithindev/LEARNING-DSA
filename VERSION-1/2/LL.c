#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node *next;
};

struct Node *head = NULL;

void insertFirst(int data) {
  struct Node *node = (struct Node*)malloc(sizeof(struct Node));
  node->data = data;
  node->next = head;
  head = node;
}

void insertLast(int data) {
  struct Node *temp = head;

  while (temp->next != NULL) {
    temp = temp->next;
  }

  struct Node *node = (struct Node*)malloc(sizeof(struct Node));
  node->data = data;
  temp->next = node;
  node->next = NULL;
}

void deleteBegining() { 
  head = head->next;
}

void deleteEnd() {
  if (isEmpty() == 1) {
    printf("Empty LL");
    return;
  }

  struct Node *temp = head;

  while(temp->next->next != NULL) {
    temp = temp->next;
  }

  temp->next = NULL;
}

int isEmpty() {
  if (head == NULL) {
    return 1;
  }
  return 0;
}

void display() {
  struct Node *temp = head;

  while(temp != NULL) {
    printf("%d, ", temp->data);
    temp = temp->next;
  }
  printf("\n");
}











void main() {
  insertFirst(1);
  insertFirst(2);
  insertFirst(3);
  insertFirst(4);
  insertFirst(5);
  insertFirst(6);
  
  display();

  deleteBegining();
  display();

  deleteEnd();
  display();

  insertLast(20);
  display();
  
}