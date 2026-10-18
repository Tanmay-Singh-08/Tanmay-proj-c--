import mysql.connector

# ---------------- Database Connection ----------------
conn = mysql.connector.connect(
    host="localhost",
    user="root",        # change if needed
    password="admin",  # your MySQL password
    database="fresh_mart"
)
cursor = conn.cursor()

# ---------------- Products Master Data ----------------
products = {
    101: ("Dairy", "Milk", 40),
    102: ("Dairy", "Cheese", 120),
    103: ("Dairy", "Butter", 60),
    104: ("Dairy", "Curd", 35),
    105: ("Dairy", "Paneer", 150),

    201: ("Vegetables", "Potato", 30),
    202: ("Vegetables", "Tomato", 40),
    203: ("Vegetables", "Onion", 25),
    204: ("Vegetables", "Carrot", 50),
    205: ("Vegetables", "Spinach", 20),

    301: ("Fruits", "Apple", 120),
    302: ("Fruits", "Banana", 60),
    303: ("Fruits", "Orange", 80),
    304: ("Fruits", "Mango", 150),
    305: ("Fruits", "Grapes", 90),

    401: ("Drinks", "Pepsi", 40),
    402: ("Drinks", "Coke", 45),
    403: ("Drinks", "Fanta", 40),
    404: ("Drinks", "Sprite", 42),
    405: ("Drinks", "Maaza", 35),

    501: ("Sweets", "Laddu", 300),
    502: ("Sweets", "Jalebi", 250),
    503: ("Sweets", "Barfi", 280),
    504: ("Sweets", "Rasgulla", 200),
    505: ("Sweets", "Gulab Jamun", 220),
}

# ---------------- Insert Products Once ----------------
for pid, (ptype, pname, price) in products.items():
    cursor.execute("SELECT product_id FROM products WHERE product_id=%s", (pid,))
    if cursor.fetchone() is None:  # insert only if not exists
        cursor.execute(
            "INSERT INTO products (product_id, product_type, product_name, price_per_unit) VALUES (%s,%s,%s,%s)",
            (pid, ptype, pname, price)
        )
conn.commit()

# ---------------- Customer Input ----------------
print("----- Welcome to Fresh Cart -----")
name = input("Enter your Name: ")
address = input("Enter your Address: ")

cursor.execute("INSERT INTO customers (customer_name, address) VALUES (%s, %s)", (name, address))
conn.commit()
customer_id = cursor.lastrowid

# Create new order
cursor.execute("INSERT INTO orders (customer_id) VALUES (%s)", (customer_id,))
conn.commit()
order_id = cursor.lastrowid

grand_total = 0

while True:
    print("Available Products:")
    for pid, (ptype, pname, price) in products.items():
        print("pid. pname ptype - ₹price")

    product_ids = input("\nEnter Product IDs (comma separated): ")
    product_ids = [int(x.strip()) for x in product_ids.split(",")]

    for product_id in product_ids:
        if product_id in products:
            pname = products[product_id][1]
            price = products[product_id][2]
            qty = int(input("Enter Quantity for {pname}: "))
            total = qty * price
            grand_total += total

            cursor.execute("""
                INSERT INTO order_items (order_id, product_id, quantity, total)
                VALUES (%s,%s,%s,%s)
            """, (order_id, product_id, qty, total))
            conn.commit()

            print("✅ Added {qty} x {pname} = ₹{total} to cart.")
        else:
            print("❌ Invalid Product ID: {product_id}")

    cont = input("\nDo you want to add more items? (yes/no): ").lower()
    if cont != "yes":
        break

print("🛒 Your Final Bill = ₹grand_total")

# Feedback
feedback_text = input("Please provide feedback about your shopping: ")
cursor.execute("INSERT INTO feedback (order_id, feedback) VALUES (%s,%s)", (order_id, feedback_text))
conn.commit()

print("\n✅ Order Saved Successfully! Thank you for shopping with Fresh Cart.")

cursor.close()
conn.close()
