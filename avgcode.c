#include <stdio.h>
#include <conio.h>
void main()
{
    int n, n1;
    float s = 0, avg;
    clrscr();


    printf("How many numbers? ");
    scanf("%d", &n);

    for(int i = 0; i < n; i++)
    {
        printf("Enter %dth number ", i + 1);
        scanf("%d", &n1);
        s += n1;
    }

    avg = s / n;
    printf("Average is %f", avg);
    getch();

}