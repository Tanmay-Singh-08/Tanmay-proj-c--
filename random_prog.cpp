#include <iostream>

int main() {
    char C, choice;
    int Cv = 0, Cc = 0, Ci = 0;

    while (true) {
        std::cout << "\n1. Enter alphabet\n";
        std::cout << "2. Stop\n";
        std::cout << "Enter a choice: ";
        std::cin >> choice;

        switch (choice) {
            case '1':
                std::cout << "Enter an alphabet: ";
                std::cin >> C;

                if ((C >= 'a' && C <= 'z') || (C >= 'A' && C <= 'Z')) {
                    if (C == 'a' || C == 'A' ||
                        C == 'e' || C == 'E' ||
                        C == 'i' || C == 'I' ||
                        C == 'o' || C == 'O' ||
                        C == 'u' || C == 'U') {
                        Cv++;
                    } else {
                        Cc++;
                    }
                } else {
                    Ci++;
                }

                break;

            case '2':
                std::cout << "\nStopping program...\n";
                std::cout << "Vowels: " << Cv << '\n';
                std::cout << "Consonants: " << Cc << '\n';
                std::cout << "Invalid characters: " << Ci << '\n';
                return 0;

            default:
                std::cout << "Invalid choice\n";
        }
    }
}