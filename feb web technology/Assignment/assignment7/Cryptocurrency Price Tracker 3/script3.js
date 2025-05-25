const apiUrl =
  "https://api.coingecko.com/api/v3/coins/markets?vs_currency=inr&order=market_cap_desc&per_page=10&page=1&sparkline=false";

document.addEventListener("DOMContentLoaded", () => {
  fetchCryptoData();

  document.getElementById("refresh").addEventListener("click", fetchCryptoData);

  document.getElementById("search").addEventListener("input", filterCryptos);
});

async function fetchCryptoData() {
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    displayCryptos(data);
  } catch (error) {
    console.error("Error fetching data:", error);
  }
}

function displayCryptos(cryptos) {
  const cryptoList = document.getElementById("crypto-list");
  cryptoList.innerHTML = "";

  cryptos.forEach((crypto) => {
    const div = document.createElement("div");
    div.classList.add("crypto-item");
    div.innerHTML = `
            <span><strong>${
              crypto.name
            }</strong> (${crypto.symbol.toUpperCase()})</span>
            <span>₹${crypto.current_price.toLocaleString()}</span>
        `;
    cryptoList.appendChild(div);
  });
}

function filterCryptos(event) {
  const searchTerm = event.target.value.toLowerCase();
  const cryptoItems = document.querySelectorAll(".crypto-item");

  cryptoItems.forEach((item) => {
    const name = item.querySelector("span").textContent.toLowerCase();
    if (name.includes(searchTerm)) {
      item.style.display = "";
    } else {
      item.style.display = "none";
    }
  });
}
