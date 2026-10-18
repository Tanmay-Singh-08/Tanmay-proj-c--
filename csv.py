"""Question:

Write a menu-driven Python program to manage a CSV file student.csv with the following options:

Write student name and marks into the file
Append new student records
Display all records
Search for a student by name
Exit

Requirements:

Each record should be stored in the format:
Name, Marks
Use appropriate file modes (w, a, r)
Handle the case when the file does not exist during reading/searching
The program should keep running until the user chooses to exit"""
import csv

def append():
    f = open("student.csv", "a", newline="")
    name = input("Enter a name: ")
    mks = int(input("Enter marks: "))
    
    writer = csv.writer(f)
    writer.writerow([name, mks])
    
    print("record added!")
    f.close()


def disp():
    try:
        f = open("student.csv", "r")
        reader = csv.reader(f)
        
        for row in reader:
            print(row[0], row[1])
        
        f.close()
    
    except:
        print("File does not exist")


def search():
    name = input("Search Name: ")
    found = False
    
    try:
        f = open("student.csv", "r")
        reader = csv.reader(f)
        
        for row in reader:
            if row[0] == name:
                print("Found!", row[0], row[1])
                found = True
                break
        
        f.close()
        
        if found == False:
            print("record not found!")
    
    except:
        print("File does not exist")
    
              
        
