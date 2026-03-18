import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('students.csv')

print(" Df ",df)

avg_score = df.groupby("Subject")["Score"].mean()

avg_score.plot(kind= "pie")
plt.xlabel("subject")
plt.tight_layout()
plt.show()
