"""Priya has created a dictionary with names as keys and marks as values for 6 students. Write a
program with separate user-defined functions to perform the following operations.
(a) Push the keys (name of the student) of the dictionary into a stack, where the corresponding value
(marks) is greater than 75. """

d={'A':76, 'B':55, 'c':80, 'd':80, 'e':90, 'f':45}
stack=[]
def push():
    for i in d:
        if d[i]>75:
            stack.append(N[i])
push()
print("stack: ", stack[::-1])
