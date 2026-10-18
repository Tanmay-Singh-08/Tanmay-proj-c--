
#include <stdio.h>
#include <math.h>

int main(void)
{
    float a, b, c, d, r1, r2, realPart, imaginaryPart;


    printf("Enter coefficients a, b and c: ");
    scanf("%f %f %f", &a, &b, &c);

    d = b * b - 4 * a * c;

    (d > 0)
    ? (r1 = (-b + sqrt(d)) / (2 * a),
       r2 = (-b - sqrt(d)) / (2 * a),
       printf("Roots are real and different.\nRoot 1 = %.2f\nRoot 2 = %.2f\n", r1, r2))

    : (d == 0)
    ? (r1 = -b / (2 * a),
       printf("Roots are real and same.\nRoot 1 = Root 2 = %.2f\n", r1))

    : (realPart = -b / (2 * a),
       imaginaryPart = sqrt(-d) / (2 * a),
       printf("Roots are complex and different.\nRoot 1 = %.2f + %.2fi\nRoot 2 = %.2f - %.2fi\n",
              realPart, imaginaryPart, realPart, imaginaryPart));

    return 0;
}
