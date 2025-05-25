const startBtn = document.getElementById("start-btn");
const quizBox = document.getElementById("quiz-box");
const quizForm = document.getElementById("quiz-form");
const resultDiv = document.getElementById("result");
const submitBtn = document.getElementById("submit-btn");

let correctAnswers = [];

const questions = [
  {
    question: "What is the capital of France?",
    options: ["Berlin", "Madrid", "Paris", "Rome"],
    correct: "Paris",
  },
  {
    question: "Which planet is known as the Red Planet?",
    options: ["Earth", "Mars", "Jupiter", "Saturn"],
    correct: "Mars",
  },
  {
    question: "What is the largest ocean on Earth?",
    options: ["Atlantic", "Indian", "Arctic", "Pacific"],
    correct: "Pacific",
  },
  {
    question: "Who wrote 'Hamlet'?",
    options: ["Shakespeare", "Dickens", "Austen", "Hemingway"],
    correct: "Shakespeare",
  },
  {
    question: "What is the chemical symbol for water?",
    options: ["O2", "CO2", "H2O", "HO2"],
    correct: "H2O",
  },
];

startBtn.addEventListener("click", () => {
  quizForm.innerHTML = "";
  correctAnswers = [];

  questions.forEach((q, index) => {
    const options = [...q.options].sort(() => Math.random() - 0.5);
    correctAnswers.push(q.correct);

    const questionDiv = document.createElement("div");
    questionDiv.classList.add("question");

    const questionText = document.createElement("p");
    questionText.innerHTML = `${index + 1}. ${q.question}`;
    questionDiv.appendChild(questionText);

    options.forEach((option) => {
      const label = document.createElement("label");
      label.innerHTML = `
        <input type="radio" name="q${index}" value="${option}" />
        ${option}
      `;
      questionDiv.appendChild(label);
    });

    quizForm.appendChild(questionDiv);
  });

  quizBox.style.display = "block";
  resultDiv.style.display = "none";
});

quizForm.addEventListener("submit", (e) => {
  e.preventDefault();

  let score = 0;
  correctAnswers.forEach((correct, index) => {
    const selected = document.querySelector(`input[name="q${index}"]:checked`);
    if (selected && selected.value === correct) {
      score++;
    }
  });

  resultDiv.textContent = `You scored ${score} out of ${correctAnswers.length}`;
  resultDiv.style.display = "block";
});
