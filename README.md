# Solid Design Principles 
# Professor Jeremias Esperanza 
# May 14th, 2024

# Kindly check the "src" for my Java Output po, thank you po.


# Problem Statement
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

# UML Diagram
![CSL322-18_WK16-17_DESIGN_PATTERN_IMPLEMENTS_SOLIDS_CHUA](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/da6ed45b-e168-407a-b4aa-7d86055d1edb)

# Java Solution Code(s)

# 1. Lend a Book
![CSL322-18_SE2_WK16-17_SOLIDESIGN_PRINCIPLE_CHUA_1](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/027e564b-179e-44a1-bf29-13613e1b9206)


# 2. Lend a Journal
![CSL322-18_SE2_WK16-17_SOLIDESIGN_PRINCIPLE_CHUA_2](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/8e7b503c-7d4e-439b-a959-1c20fb1003fd)


# 3. Print Programmer's Name
![CSL322-18_SE2_WK16-17_SOLIDESIGN_PRINCIPLE_CHUA_3](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/b590885e-6532-47f8-b541-eb1d587fce70)


# 4. End Program
![CSL322-18_SE2_WK16-17_SOLIDESIGN_PRINCIPLE_CHUA_4](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/dad5a1d8-3bf6-40bf-8dc1-769d97a8d768)

# 5 Invalid Option
![CSL322-18_SE2_WK16-17_SOLIDESIGN_PRINCIPLE_CHUA_5](https://github.com/VinceTedChua/solidDesignPrinciples/assets/142372312/f3bbee54-b92a-4e46-b740-3b51e81b1b77)

