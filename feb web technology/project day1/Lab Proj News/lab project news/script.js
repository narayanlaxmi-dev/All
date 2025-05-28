// in api key where you find tesla replace Headlines
//https://newsapi.org/v2/everything?q=Headlines&from=2025-04-26&sortBy=publishedAt&apiKey=f2aa557f66aa431195de6cc9a2a74537

// let api = `https://newsapi.org/v2/everything?q=Headlines&from=2025-04-26&sortBy=publishedAt&apiKey=f2aa557f66aa431195de6cc9a2a74537`;

// make it responsive
const api_link = "https://newsapi.org/v2/everything?q=";
const api_key = "f2aa557f66aa431195de6cc9a2a74537";
//api_link+query+"&from=2025-04-26&sortBy=publishedAt&apiKey"+api_key

// Fetch news when the window loads
window.addEventListener("load", () => {
  fetchNews("Top-Headlines"); // Replaced "Headlines" with "Tesla" as per your instruction
});

const fetchNews = async (query) => {
  console.log("Fetch News Called:", query);

  try {
    let response = await fetch(
      `${api_link}${query}&from=2025-04-26&sortBy=publishedAt&apiKey=${api_key}`
    );
    let data = await response.json();
    console.log(data.articles);
    bindData(data.articles, query);
  } catch (error) {
    console.error("Error fetching news:", error);
  }
};

const bindData = (articles, newsType) => {
  document.querySelector(".head").innerHTML = newsType;
  let str = ``;
  
    
  articles &&
    articles.forEach((article) => {
      str += `
        <div class="col-xl-4 card-main mb-4">
          <div class="card">
            <img src="${
              article.urlToImage
            }" class="card-img-top news-img img-fluid" alt="News Image" />
            <div class="card-body p-4">
              <h5 class="card-title">${article.title}</h5>
              <h6 class="card-subtitle mb-2 text-muted">${
                article.source.name
              } • ${new Date(article.publishedAt).toLocaleString()}</h6>
              <p class="card-text">${
                article.description || "No description available."
              }</p>
              <a href="${
                article.url
              }" class="btn btn-outline-primary read-btn" target="_blank">Read More</a>
            </div>
          </div>
        </div>
      `;
    });

  // Move this outside the loop
  document.querySelector(".row").innerHTML = str;
};

const handleSearch = (event) => {
  // console.log(event);
  event.preventDefault(); // Prevent form from reloading page
  const query = document.querySelector(".searchInput").value;
  //   const query = document.getElementById("searchInput").value.trim();
  if (query) {
    fetchNews(query);
  }
};
