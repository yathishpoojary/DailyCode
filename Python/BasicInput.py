# Multiplication table generator

# Step 1: Input from the user

num = int(input(" Enter a number "))

# Step 2: Use a loop to generate table

print(f"\n Multiplication table for the {num}")
for i in range(1,11):
    print(f"{num} x {i} = {num * i}");