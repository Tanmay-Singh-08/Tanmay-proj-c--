import pickle
#function callim 

def ReadStudentData():
    f=open("student.dat", 'rb')
    try:
        while True:
            record=pickle.load(f)
            print(record)
    except EOFError:
        pass
ReadStudentData()
