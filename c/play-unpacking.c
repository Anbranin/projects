#include <stdio.h>

int main() {
  unsigned int i1 = 1835098984u;
  unsigned int i2 = 1768842611u;

  //add the right bitwise operations to extract each of the chars
  //that are packed into i1 and i2. Only << and >>. Chars are packed
  //in the following format:
  //i1 c1, c2, c3, c4
  //i2 c5, c6, c7, c8
  //
  //After you unpack the bytes, print out the corresponding ascii encoded chars
  //using printf.

  char c1 = i1 >> 24;
  printf("%c", c1);
  char c2 = (i1 << 8) >> 24;
  printf("%c", c2);
  char c3 = (i1 << 16) >> 24;
  printf("%c", c3);
  char c4 = (i1 << 24) >> 24;
  printf("%c", c4);

  char c5 = i2 >> 24;
  printf("%c", c5);
  char c6 = (i2 << 8) >> 24;
  printf("%c", c6);
  char c7 = (i2 << 16) >> 24;
  printf("%c", c7);
  char c8 = (i2 << 24) >> 24;
  printf("%c\n", c8);
}
