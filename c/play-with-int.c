#include <stdio.h>

int main() {
  int x = 10;
  int y = 13;

  printf("x = %d\n", x);
  printf("y = %d\n", y);
  printf("size of signed int in bytes is %d\n", (int)sizeof(int));
  printf("size of signed int in bits is %d\n", 8 * (int)sizeof(int));
}
