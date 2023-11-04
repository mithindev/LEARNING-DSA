#include <stdio.h>
#include <malloc.h>
#include <stdlib.h>

struct Node {
  int data;
  struct Node *next;
};

struct Node *head1 = NULL;
struct Node *head2 = NULL;

void insertFirst (struct Node **head, int data) {
  struct Node *node = (struct Node*)malloc(sizeof(struct Node));

  node->data = data;
  node->next = *head;
  *head = node;
}

void insertLast(struct Node **head, int data) {
  struct Node *node = (struct Node*)malloc(sizeof(struct Node));

  if (*head == NULL) {
    insertFirst(head, data);
  } else {
    struct Node *temp = *head;

    while (temp->next != NULL) {
      temp = temp->next;
    }
    node->data = data;
    temp->next = node;
    node->next = NULL;
  }

}

void display(struct Node *head) {
  struct Node *temp = head;

  while(temp != NULL) {
    printf("%d, ", temp->data);
    temp = temp->next;
  }
  printf("\n");
}

int length(struct Node *head) {
  int count = 0;

  struct Node *temp = head;

  while (temp != NULL) {
    count++;
    temp = temp->next;
  }

  return count;
}

void displayMiddle(struct Node *head) {
  int len = length(head);
  struct Node *temp = head;

  for (int i = 0; i < len/2; i++) {
      temp = temp->next;
  }

  printf("Middle value is : %d", temp->data);
  printf("\n");
}

void deleteNode (struct Node **head, struct Node *node) {

  if (*head == node) {
    *head = node->next;
    return;
  }

  struct Node *temp = *head;

  while (temp->next != node) {
    temp = temp->next;
  }
  temp->next = node->next;
}

void deleteEven(struct Node **head) {
  struct Node *temp = *head;

  while (temp!= NULL) {
    if ((temp->data)%2 == 0) {
      deleteNode(head, temp);
    }
    temp=temp->next;
  }
}

void sort(struct Node **head) {
  int len = length(*head);

  for (int i = 0; i < len - 1; i++) {
    struct Node *temp1 = *head;
    struct Node *temp2 = (*head)->next;

    for (int j = 0; j < len - i - 1; j++) {
      if (temp1->data > temp2->data) {
        int temp = temp1->data;
        temp1->data = temp2->data;
        temp2->data = temp;
      }
      temp1 = temp1->next;
      temp2 = temp2-> next;
    }
  }
}

void removeDuplicates(struct Node **head) {
  struct Node *temp = *head;
  int len = length(*head);

  while (temp != NULL && temp->next != NULL) {
    if (temp->data == temp->next->data) {
      temp->next = temp->next->next;
    } else {
      temp = temp->next;
    }
  }
}






void main() {
  insertLast(&head1, 12);
  insertLast(&head1, 12);
  insertLast(&head1, 9);
  insertLast(&head1, 1);
  insertLast(&head1, 24);
  insertLast(&head1, 87);
  insertLast(&head1, 24);

  display(head1);

  insertLast(&head2, 1);
  insertLast(&head2, 2);
  insertLast(&head2, 3);
  insertLast(&head2, 3);
  insertLast(&head2, 5);
  insertLast(&head2, 6);
  insertLast(&head2, 7);

  display(head2);

  // displayMiddle(head1);

  // deleteEven(&head1);
  // display(head1);

  sort(&head1);
  display(head1);

  removeDuplicates(&head1);
  display(head1);


}