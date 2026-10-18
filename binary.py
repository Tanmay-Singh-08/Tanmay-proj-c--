"""Question:

Write a menu-driven Python program to manage a binary file student.dat with the following options:

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
import pickle
def addrec():
    f=open("studentsz.dat", "ab")
    name=input("Enter a name")
    mks=int(input("Enter marks"))
    rec=[name,mks]
    pickle.dump(rec,f)
    print("record added!")
    f.close()

def disp():
    try:
        f=open("studentsz.dat", "rb")
        while True:
            rec=pickle.load(f)
            print(rec[0], rec[1])
    except EOFError:
        f.close()
    except:
        print("file does not exist")

def search():
    found=False
    try:
        f=open("studentsz.dat", "rb")
        name=input("Enter the name of student")
        while True:
            rec=pickle.load(f)
            if rec[0]==name:
                print("Found\n",rec[0], " ",rec[1])
                found=True
                break
    except EOFError:
        if found==False:
            print("record not found")
            f.close()
    except:
        print("File doesnt exist")

while True:
    ch = int(input("\n1.Add\n2.Display\n3.Search\n4.Exit\nEnter choice: "))
    
    if ch == 1:
        addrec()
    elif ch == 2:
        disp()
    elif ch == 3:
        search()
    elif ch == 4:
        break
    else:
        print("Invalid choice")
     
     
    
    
    
    
    
    
    
    
