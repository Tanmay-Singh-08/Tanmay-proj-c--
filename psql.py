
"""
Program 6:
Write a Python program to display students who have scored
75 or more marks from the STUDENT table.
"""

import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
    password="admin",
    database="school"
)

cur = db.cursor()
cur.execute("SELECT * FROM student WHERE marks >= 75")

for row in cur.fetchall():
    print(row)

db.close()




