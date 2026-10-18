f = open("notes.txt")
for line in f:
    print("|".join(line.strip()))
f.close()
