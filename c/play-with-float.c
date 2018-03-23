#include <stdio.h>

int main() {
  float x = 10;
  float y = 13;

  printf("x = %f\n", x);
  printf("y = %f\n", y);
  printf("size of single float in bytes is %d\n", (int)sizeof(float));
  printf("size of single float in bits is %d\n", 8 * (int)sizeof(float));
}
