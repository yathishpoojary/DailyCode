import pandas as pd
import random

names = ["Alice" , "Bob", "John" , "Peter"]
classes = ["10A", "10B"]
subjects = ["Math", "Science", "English"]

data = []

for i in range (30):
    row = {
        "Name": random.choice(names),
        "Classes": random.choice(classes),
        "Subject": random.choice(subjects)
    }
    data.append(row)

df = pd.DataFrame(data)

df.to_csv("Students_random.csv", index = False)

print(" CSV saved properly")

print(" ",df)
