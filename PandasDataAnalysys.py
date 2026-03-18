import pandas as pd
import matplotlib.pyplot  as plt

# Sample Data as dictionary

data = {
    'Name' : [ "Alice", " Bob" , "Charlie" , "David" , "Eva"],
    'Score': [85,80,45,34,55],
    'Subject': ["Math", "Science", "Math", "Science", "Math"]
}

# Convert this to a data frame

df =pd.DataFrame(data)

# Display the basic info

print(" Full name ",df)

math_score = df[df['Subject'] == 'Math']

print(" math score ",math_score)

print("\n Group by complete subject sccore ")

avg_score = df.groupby('Subject')['Score'].mean()

print(" average score subject ",avg_score)

# bar chart

avg_score.plot(kind='bar', title='Average Scores by Subject')
plt.xlabel('Subject')
plt.ylabel('Average score')
plt.tight_layout()
plt.show()




