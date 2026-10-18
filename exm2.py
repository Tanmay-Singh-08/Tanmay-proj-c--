"""A binary file “student.dat” has structure [rollno,
name, marks].
i. Write a user defined function insertRec() to
input data for a student and add to student.dat.
ii. Write a function searchRollNo( r ) in Python
which accepts the student’s rollno as parameter
and searches the record in the file “student.dat”
and shows the details of student i.e. rollno, name
and marks (if found) otherwise shows the
message as ‘No record found’."""
import pickle

def insertRec():
    n = int(input("Enter number of students: "))
    f = open("student.dat", "ab")

    for i in range(n):
        roln = int(input("Enter roll no: "))
        name = input("Enter name: ")
        marks = int(input("Enter marks: "))
        rec = [roln, name, marks]
        pickle.dump(rec, f)

    f.close()
    print("Records inserted successfully")
insertRec()
   
         
