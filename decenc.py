#enc dec code
# hello Ts-enc, dec: h#e#l#l#o# T#s, deckey=(#)
def encstrng(dec,key):
    enc=key.join(dec)
    return enc

def dec(enc,key):
    decr="".join(enc.split(key))
    return decr


while True:
    print("\n1. Encrypt")
    print("2. Decrypt")
    print("3. Exit")

    ch = input("Enter your choice: ")

    if ch == "1":
        dec = input("Enter original string: ")
        key = input("Enter encryption key: ")
        result = encstrng(dec, key)
        print("Encrypted:", result)

    elif ch == "2":
        enc_text = input("Enter encrypted string: ")
        key = input("Enter decryption key: ")
        result = dec(enc_text, key)
        print("Decrypted:", result)

    elif ch == "3":
        print("Exiting program...")
        break   # 🔥 THIS exits the loop

    else:
        print("Invalid choice, try again.")


        
