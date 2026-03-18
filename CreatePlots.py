import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("students.csv")

print(" df  ",df)

# Students with the score

high_scores = df[df['Score'] > 90]
print(" Students with more sccre ", high_scores)

# Group the score

avg_subject_by_default = df.groupby('Subject')['Score'].mean()

print(" Average  score by subject ",avg_subject_by_default)

avg_subject_by_default.plot(kind = 'bar', title = 'Average scores by subjects')
plt.xlabel(" Subjects")
plt.ylabel(" Scores")
plt.tight_layout()
plt.show()



