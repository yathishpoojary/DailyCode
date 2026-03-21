import pandas as pd
from transformers import pipeline

# Load CSV
df = pd.read_csv('reviews.csv')

# Initialize pipeline
sentiment_analyzer = pipeline("sentiment-analysis")

# Prepare empty lists
labels = []
scores = []

# Process each review safely
for review in df['Review'].astype(str):  # ensure it's a string
    try:
        result = sentiment_analyzer(review)[0]  # analyze one text at a time
        labels.append(result['label'])
        scores.append(result['score'])
    except Exception as e:
        labels.append("ERROR")
        scores.append(0.0)
        print(f"Error on review: {review} -> {e}")

# Add results to DataFrame
df['Sentiment'] = labels
df['Confidence'] = scores

# Show results
print(df[['Review', 'Sentiment', 'Confidence']])

# Save to new CSV
df.to_csv("reviews_with_sentiment.csv", index=False)
print("\nResults saved to reviews_with_sentiment.csv")

import matplotlib.pyplot as plt

# Count positive vs negative
sentiment_counts = df['Sentiment'].value_counts()

# Plot bar chart
sentiment_counts.plot(kind='bar', title='Sentiment Distribution')
plt.xlabel('Sentiment')
plt.ylabel('Count')
plt.show()