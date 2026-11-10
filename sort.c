/*bubble sort()
#include <stdio.h>
int main(void)
{
    int n,i,j,arr[20],temp,swap;
    printf("Enter no of elements in the array ");
    scanf("%d",&n);
    printf("Enter elements ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Elements added!");
    for(i=0;i<=n-2;i++)
    {
        swap=0;
        for(j=0;j<=n-2-i;j++){
            if(arr[j]>arr[j+1])
            {

                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=1;
            }
        }
        if(swap==0)
        {

            break;
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d,",arr[i]);
    }
    return 0;
}
*/

/*Selection sort
#include <stdio.h>
int main(void)
{
    int n,i,j,arr[20],temp,min;
    printf("Enter no of elements in the array ");
    scanf("%d",&n);
    printf("Enter elements ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Elements added!");
    for(i=0;i<n-1;i++)
    {
        min=i;
        for(j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
            {
               min=j;
            }
        }
        if(min!=i)
        {
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d, ",arr[i]);
    }
    return 0;
}
*/
#include <stdio.h>
int main(void)
{
    int n,i,j,arr[20],temp;
    printf("Enter no of elements in the array under 20 ");
    scanf("%d",&n);
    printf("Enter elements ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Elements added!");

        for(i=1;i<n;i++)
        {
                temp=arr[i];
                j=i;
                while(j>0 && arr[j-1]>temp)
                {
                        arr[j]=arr[j-1];
                        j--;
                }
                arr[j]=temp;
        }

    for(i=0;i<n;i++)
    {
        printf("%d, ",arr[i]);
    }

    return 0;
}