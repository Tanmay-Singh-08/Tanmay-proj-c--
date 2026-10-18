"""Q1. [8+4 = 12]
A. Write a menu driven Python program with the following two functions:
 WriteStudentData() to write 5 student records (Roll No, Name, Marks) in a binary file named
"Student.dat".
 ReadStudentData() to read all the records from "Student.dat" and display them.
The menu should allow the user to:
 Write student data
 Read student data
 Exit """
import pickle

def WriteStudentData():
    f = open("student.dat", "ab")
    for i in range(2):
        rolno = int(input("Enter roll no: "))
        name = input("Enter name: ")
        marks = int(input("Enter marks: "))

        record = [rolno, name, marks]
        pickle.dump(record, f)

        print("Data added successfully")
    f.close()
def ReadStudentData():
    f = open("student.dat", "rb")
    try:
        while True:
            obj = pickle.load(f)
            print(obj)
    except EOFError:
        pass
    f.close()
while True:
    ch = int(input("Enter 1 to write data and 2 to read data: "))
    if ch == 1:
        WriteStudentData()
    elif ch == 2:
        ReadStudentData()
    else:
        break

