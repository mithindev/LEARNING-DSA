#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct Node {
  int data;
  struct Node *next;
};

void insertFirst(struct Node **head, int data);

int main() {

  struct Node *head = NULL;

  insertFirst(&head, 5);
  insertFirst(&head, 10);
  insertFirst(&head, 20);
  insertFirst(&head, 30);
  insertFirst(&head, 40);
  insertFirst(&head, 50);
  insertFirst(&head, 60);
  insertFirst(&head, 70);
  insertFirst(&head, 80);

  deleteFirst(&head);

  display(head);
  printf("\n");

  reverse(head);




  return 0;
}

void insertFirst(struct Node **head, int data){
    struct Node *node;

    node = (struct Node*)malloc(sizeof(struct Node));

    node->data = data;
    node->next = *head;
    *head = node;
}

void insertLast(struct Node **head, int value) {
  struct Node *temp = *head;

  while (temp->next != NULL) {
    temp = temp->next;
  }

  struct Node *node;
  node->data = value;
  node->next = NULL;
  temp->next = node;
}

void deleteFirst(struct Node **head) {

  if (*head == NULL) {
    printf("Empty linkedList");
    return;
  }

  struct Node *temp = *head;

  *head = (*head)->next; 
  free(temp);
}


void deleteLast (struct Node **head) {
  struct Node *temp = *head;

  while (temp->next->next != NULL) {
    temp = temp->next;
  }

  temp->next = NULL;
  free(temp);
}

void display(struct Node *head) {
  struct Node *temp = head;

  while (temp != NULL) {
    printf("%d->", temp->data);
    temp = temp->next;
  }
  printf("END");
}

void deletePos(struct Node **head, int pos)  {

  if (*head == NULL) {
    printf("Empty linkedList");
    return;
  }

  struct Node *temp = *head;

  for (int i = 1; i < pos; i++) {
    temp = temp->next;
  }
  temp->next = temp->next->next;
  free(temp);
}

void reverse (struct Node *head) {

  if (head == NULL) {
    return;
  }

  reverse((head->next));

  printf("%d ->", head->data);
  
}