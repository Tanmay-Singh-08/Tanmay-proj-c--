//objective of this code is to calc times table in following formate 2x3=6;
#include <stdio.h>
#include <math.h>
int main(void)
{
    int num,i,prod;
    printf("Enter a number to find its table ");
    scanf("%d",&num);
    for(i=1;i<=10;i++)
    {
        prod=num*i;
        printf("%d x %d = %d\n",num,i,prod);
    }

    return 0;
}