import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="admin" 
)

cur = mydb.cursor()
cur.execute("CREATE DATABASE IF NOT EXISTS freshmart")
cur.execute("USE freshmart")

cur.execute("""
    create table if not exists purchases(
        id int auto_increment primary key,
        customer_name varchar(50),
        item_name varchar(50),
        quantity int,
        cost_per_unit int,
        total_cost int
    )
""")

cats = {
    1: ("Dairy", {
        1: ("Milk", 40),
        2: ("Curd", 30),
        3: ("Cheese", 80),
        4: ("Butter", 50),
        5: ("Ghee", 120)
    }),

    2: ("Fruits", {
        1: ("Apple", 100),
        2: ("Orange", 60),
        3: ("Banana", 40),
        4: ("Grapes", 70),
        5: ("Watermelon", 90)
    }),

    3: ("Vegetables", {
        1: ("Onion", 30),
        2: ("Potato", 25),
        3: ("Tomato", 40),
        4: ("Cucumber", 35),
        5: ("Cabbage", 28)
    }),

    4: ("Drinks", {
        1: ("Coke", 40),
        2: ("Pepsi", 40),
        3: ("Thumbs Up", 45),
        4: ("Sprite", 40),
        5: ("Fanta", 40)
    }),

    5: ("Sweets", {
        1: ("Rasgulla", 150),
        2: ("Gulab Jamun", 160),
        3: ("Laddu", 120),
        4: ("Barfi", 140),
        5: ("Jalebi", 130)
    })
}

print("-------- WELCOME TO FRESHMART --------")

name = input("enter your name: ")

grand_total = 0

while True:
    print("\nSelect Category:")
    for cno in cats:
        print(cno, ".", cats[cno][0])

    try:
        ch = int(input("enter category no: "))
    except:
        print("enter a number bro")
        continue

    if ch not in cats:
        print("invalid category")
        continue

    cname, items = cats[ch]

    print("\n---", cname, "---")
    for ino in items:
        print(ino, items[ino][0], "- Rs", items[ino][1])

    print("\nPick multiple items (0 to exit this category)")

    while True:
        try:
            pno = int(input("enter product no: "))
        except:
            print("enter a valid number")
            continue

        if pno == 0:
            break

        if pno not in items:
            print("invalid item")
            continue

        itemname, price = items[pno]
        print("selected:", itemname, "price:", price)

        qty = int(input("enter quantity: "))

        total_cost = price * qty
        grand_total += total_cost

        cur.execute(
            "insert into purchases(customer_name, item_name, quantity, cost_per_unit, total_cost) values(%s, %s, %s, %s, %s)",
            (name, itemname, qty, price, total_cost)
        )
        mydb.commit()

    more = input("choose another category? (y/n): ")
    if more.lower() != "y":
        break


# ----------------------------
#       GROUPED BILL OUTPUT
# ----------------------------

print("\n\n-------------- FINAL BILL --------------")

print(name)   # print customer name ONCE

cur.execute("select item_name, quantity, cost_per_unit, total_cost from purchases where customer_name=%s", (name,))
rows = cur.fetchall()

for row in rows:
    print("   ", row[0], "| qty:", row[1], "| rate:", row[2], "| total:", row[3])

print("----------------------------------------")
print("GRAND TOTAL =", grand_total)
print("----------------------------------------")
