#include <stdio.h>

int main() {
  unsigned char b3 = 202;
  unsigned char b2 = 254;
  unsigned char b1 = 186;
  unsigned char b0 = 190;

  int u = b3 << 3 * 8 | b2 << 2 * 8 | b1 << 8 | b0;

  printf("%X\n", u);
}
