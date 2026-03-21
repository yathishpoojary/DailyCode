# from transformers import pipeline
#
# sentiment_analyzer = pipeline("sentiment-analysis")
# print(sentiment_analyzer(" I love you python"))

from transformers import pipeline

sentiment_analyzer = pipeline("sentiment-analysis")

texts = [
    "I love myself",
    "This project feeling really difficult",
    "Who is the hero of the movie",
    "This was inspiring"
]

# analyse sentiment

results = sentiment_analyzer(texts)

for text,result in zip(texts, results):
    print(f"Text : {text}")
    print(f"Sentiment: {result['label']} senitment {result['score']}")