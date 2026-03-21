from flask import Flask, request, jsonify
from transformers import pipeline
from flask_cors import CORS

app = Flask(__name__)
CORS(app)  # Enable CORS for all routes

sentiment_analyzer = pipeline("sentiment-analysis")

@app.route('/analyze', methods=['POST'])
def analyze():
    data = request.json
    text = data.get("text", "")
    result = sentiment_analyzer(text)[0]
    return jsonify(result)

if __name__ == '__main__':
    app.run(port=5000)