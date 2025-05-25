const quoteText = document.getElementById("quote");
const quoteAuthor = document.getElementById("author");
const newQuoteBtn = document.getElementById("new-quote-btn");

let quotes = [];

async function fetchQuotes() {
  try {
    const response = await fetch("https://dummyjson.com/quotes");
    const data = await response.json();
    quotes = data.quotes; // array of quotes
    showRandomQuote();
  } catch (error) {
    quoteText.textContent = "Failed to load quotes.";
    quoteAuthor.textContent = "";
    console.error("Error fetching quotes:", error);
  }
}

function showRandomQuote() {
  if (quotes.length === 0) return;

  // fade out
  quoteText.style.opacity = 0;
  quoteAuthor.style.opacity = 0;

  setTimeout(() => {
    const randomIndex = Math.floor(Math.random() * quotes.length);
    const quote = quotes[randomIndex];

    quoteText.textContent = `"${quote.quote}"`;
    quoteAuthor.textContent = `— ${quote.author}`;

    // fade in
    quoteText.style.opacity = 1;
    quoteAuthor.style.opacity = 1;
  }, 500);
}

// Event listener for new quote button
newQuoteBtn.addEventListener("click", showRandomQuote);

// Fetch quotes on page load
fetchQuotes();
