#include <stdio.h>

int main() {
  char c = 'C';
  char a = 65;

  printf("c = %c\n", c);
  printf("a = %c\n", a);

  char cafebabe[] = "CAFEBABE";

  printf("%s\n", cafebabe);

  printf("number of bytes: %d.\n", (int)sizeof(cafebabe));
}
