import mysql.connector

# ---------------- Database Connection ----------------
conn = mysql.connector.connect(
    host="localhost",
    user="root",        # change if needed
    password="admin",  # your MySQL password
    database="fresh_cart"
)
cursor = conn.cursor()

# ---------------- Table Setup ----------------
cursor.execute("""
CREATE TABLE IF NOT EXISTS customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(50),
    address VARCHAR(100),
    product_type VARCHAR(20),
    product_name VARCHAR(50),
    product_id INT,
    quantity INT,
    price_per_unit FLOAT,
    total FLOAT,
    feedback VARCHAR(255)
)
""")

# ---------------- Product Categories ----------------
products = {
    "Dairy": {
        101: ("Milk", 40),
        102: ("Cheese", 120),
        103: ("Butter", 60),
        104: ("Curd", 35),
        105: ("Paneer", 150),
    },
    "Vegetables": {
        201: ("Potato", 30),
        202: ("Tomato", 40),
        203: ("Onion", 25),
        204: ("Carrot", 50),
        205: ("Spinach", 20),
    },
    "Fruits": {
        301: ("Apple", 120),
        302: ("Banana", 60),
        303: ("Orange", 80),
        304: ("Mango", 150),
        305: ("Grapes", 90),
    },
    "Drinks": {
        401: ("Pepsi", 40),
        402: ("Coke", 45),
        403: ("Fanta", 40),
        404: ("Sprite", 42),
        405: ("Maaza", 35),
    },
    "Sweets": {
        501: ("Laddu", 300),
        502: ("Jalebi", 250),
        503: ("Barfi", 280),
        504: ("Rasgulla", 200),
        505: ("Gulab Jamun", 220),
    }
}

# ---------------- User Details ----------------
print("----- Welcome to Fresh Cart -----")

name = input("Enter your Name: ")
address = input("Enter your Address: ")

grand_total = 0  # running bill

while True:
    print("\nAvailable Categories:")
    for category in products.keys():
        print("-", category)

    type_choice = input("\nEnter Category: ").capitalize()

    if type_choice in products:
        print(f"\nAvailable Products in {type_choice}:")
        for pid, (pname, price) in products[type_choice].items():
            print(f"{pid}. {pname} - ₹{price}")

        # 🆕 Allow multiple product IDs separated by commas
        product_ids = input("\nEnter Product IDs (comma separated): ")
        product_ids = [int(x.strip()) for x in product_ids.split(",")]

        for product_id in product_ids:
            if product_id in products[type_choice]:
                product_name, price = products[type_choice][product_id]
                qty = int(input(f"Enter Quantity for {product_name}: "))
                total = qty * price
                grand_total += total

                print(f"✅ Added {qty} x {product_name} = ₹{total} to cart.")

                # Save each product to DB
                cursor.execute("""
                    INSERT INTO customers (customer_name, address, product_type, product_name, product_id, quantity, price_per_unit, total, feedback)
                    VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s)
                """, (name, address, type_choice, product_name, product_id, qty, price, total, None))
                conn.commit()
            else:
                print(f"❌ Invalid Product ID: {product_id}")

    else:
        print("❌ Invalid Category")

    # Ask if user wants to continue shopping
    cont = input("\nDo you want to add more items? (yes/no): ").lower()
    if cont != "yes":
        break

print(f"\n🛒 Your Final Bill = ₹{grand_total}")

# ---------------- Feedback ----------------
feedback = input("Please provide feedback about your shopping: ")

# Update feedback for all rows of this customer
cursor.execute("""
    UPDATE customers SET feedback=%s WHERE customer_name=%s AND address=%s AND feedback IS NULL
""", (feedback, name, address))
conn.commit()

print("\n✅ Order Saved Successfully! Thank you for shopping with Fresh Cart.")

# ---------------- Close Connection ----------------
cursor.close()
conn.close()
