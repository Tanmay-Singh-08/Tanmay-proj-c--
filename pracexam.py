"""A. Create a text file called ‘quotes.txt’ and write the following contents in it.
Practice makes a person perfect
Learning never stops
Hard work brings success
Honesty builds trust
Write a menu-driven Python program to perform the following tasks:
 Display all words separated by @.
 Count and display the total number of words in the file.
 Exit the program. """
def writecontent():
    f=open("quotes.txt", "w+")
    lis=["Practice makes a person perfect\n","Hard work brings success\n","Learning never stops\n","Honesty builds trust"]
    f.writelines(lis)
    f.seek(0)
    data=f.read()
    print(data)
    f.close()
writecontent()

def spc():
     f=open("quotes.txt", "a+")
     f.seek(0)
     for line in f:
         for i in line:
             print(i,end="@")
         print()
     f.close()

def wordcount():
     f=open("quotes.txt", "a+")
     count=0
     nextspace=False
     f.seek(0)
     for line in f:
         nextspace=False
         for i in line:
             if i!=" " and i!="\n" and nextspace is False:
                 count+=1
                 nextspace=True
             elif i==" " or i=="\n":
                nextspace=False
     print("word count: ",count)
     f.close()

ch=int(input("Enter 1 to add @ after every character enter 2 to find word count and 3 to exit"))
if ch==1:
    spc()
elif ch==2:
    wordcount()
elif ch==3:
    print("Terminating code")
else:
    print("kindly enter a valid option")
    

