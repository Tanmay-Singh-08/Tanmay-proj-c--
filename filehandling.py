"""
Program 6:
Store a list of integers in a binary file 'numbers.dat' and display it.
"""

import pickle

nums = [10, 20, 30, 40, 50]

f = open("numbers.dat", "wb")
pickle.dump(nums, f)
f.close()

f = open("numbers.dat", "rb")
data = pickle.load(f)
print(data)
f.close()
