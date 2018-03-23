#include <stdio.h>

int main() {
  unsigned char somebits = 181;
  signed char someotherbits = -75;

  for(int i = 0; i < 8; i++){
    printf("%d", (somebits & (1 << i)) >> i);
  }
  printf("\n");
  for(int i = 0; i < 8; i++){
    printf("%d", (someotherbits & (1 << i)) >> i);
  }
  printf("\n");
}
