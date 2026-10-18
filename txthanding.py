"""Question:

Write a menu-driven Python program to manage a text file student.txt with the following options:

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
def appendrec():
    f=open("student.txt",'a')
    name=input("Enter name")
    marks=int(input("Enter marks"))
    f.write(name +","+str(marks)+"\n")
    print("Record added successfully")
    f.close()

def displayrec():
    try:
        f=open("student.txt", "r")
        for line in f:
            print(line.strip())
    except:
        print("file  doesnt exist")
    f.close()

def search():
    f=open("student.txt", "r")
    name=input("Enter the name of the student ")
    found=False
    for line in f:
        sname,mks=line.strip().split(",")
        if sname==name:
            print(line.strip())
            found=True
            break
    else:
        print("Record doesnt exist")
    f.close()

while True:
    ch=int(input("1.Add record\n2.display record\n3.search\n4.exit"))
    if ch==1:
        appendrec()
    elif ch==2:
        displayrec()
    elif ch==3:
        search()
    elif ch==4:
        break
    else:
        print("Enter valid choice")
            
        
        
        
