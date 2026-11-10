#include <stdio.h>
int main(void)
{
    int row,col,i,j,k,arr[10][10],rowB,colB,P[10][10],arr2[10][10];
    printf("Enter no of rows and columns of matrix A ");
    scanf("%d%d",&row,&col);

    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("Enter element at row %d , col %d ",i,j);
            scanf("%d",&arr[i][j]);
        }
    }
    printf("2d array A: \n");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
    printf("Enter no of rows and cols of matrix B");
    scanf("%d%d",&rowB,&colB);
    for(i=0;i<rowB;i++)
    {
        for(j=0;j<colB;j++)
        {
            printf("Enter element at row %d , col %d ",i,j);
            scanf("%d",&arr2[i][j]);
        }
    }
    printf("2d array B: \n");
    for(i=0;i<rowB;i++)
    {
        for(j=0;j<colB;j++)
        {
            printf("%d ",arr2[i][j]);
        }
        printf("\n");
    }

    if(col!=rowB)
    {
        printf("matrices cannot be multiplied!");
        return 0;
        
    }
    else
    {
        for(i=0;i<row;i++)
        {
            
            for(j=0;j<colB;j++)
            {
                P[i][j]=0;
                for(k=0;k<rowB;k++)
                {
                    P[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }
    }
    printf("product matrix\n");

    for(i=0;i<row;i++)
    {
        for(j=0;j<colB;j++)
        {
            printf("%d ",P[i][j]);
        }
        printf("\n");
    }
    return 0;
}