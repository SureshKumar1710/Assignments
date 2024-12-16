let computer_science_questions = [];
let currentQuestionIndex = 0;
let answers = [];

const questionNumber = document.getElementById("question-number");
const questionText = document.getElementById("question-text");
const options = document.querySelectorAll(".option input");
const labels = [document.getElementById("label1"), document.getElementById("label2"), document.getElementById("label3"), document.getElementById("label4")];
const prevBtn = document.getElementById("prev-btn");
const nextBtn = document.getElementById("next-btn");

function loadQuestion(index) {
    const question = computer_science_questions[index];
    questionNumber.textContent = `Question ${index + 1}`;
    questionText.textContent = question.question;

    options.forEach((opt, i) => {
        opt.checked = false;
        labels[i].textContent = question.options[i].text;
    });

    if (answers[index] !== undefined) {
        options[answers[index]].checked = true;
    }
}

function saveAnswer() {
    const selected = Array.from(options).find(opt => opt.checked);
    if (selected) {
        answers[currentQuestionIndex] = parseInt(selected.id.replace("option", "")) - 1;
    }
}

function showScore() {
    const score = answers.reduce((acc, ans, index) => {
        if (computer_science_questions[index].options[ans]?.correct) {
            acc += 1;
        }
        return acc;
    }, 0);

    const userName = localStorage.getItem("userName") || "Guest";
    questionNumber.textContent = `Congratulations, ${userName}!`;
    questionText.textContent = `Your score is ${score}/${computer_science_questions.length}`;

    prevBtn.style.display = "none";
    nextBtn.style.display = "none";

    document.querySelectorAll(".option").forEach(option => {
        option.style.display = "none";
    });

    const leaderboard = JSON.parse(localStorage.getItem("leaderboard") || "[]");
    leaderboard.push({ name: userName, score });
    leaderboard.sort((a, b) => b.score - a.score);
    localStorage.setItem("leaderboard", JSON.stringify(leaderboard));

    const backButton = document.createElement("button");
    backButton.textContent = "Back to Home";
    backButton.classList.add("nav-btn"); 
    backButton.onclick = () => {
        window.location.href = "home.html";
    };

    const mainContainer = document.querySelector(".button-group");
    mainContainer.appendChild(backButton);
}


if (window.location.pathname.endsWith("quiz_page.html")) {

prevBtn.addEventListener("click", () => {
    if (currentQuestionIndex > 0) {
        saveAnswer();
        currentQuestionIndex -= 1;
        loadQuestion(currentQuestionIndex);
    }
});

nextBtn.addEventListener("click", () => {
    saveAnswer();
    if (currentQuestionIndex < computer_science_questions.length - 1) {
        currentQuestionIndex += 1;
        loadQuestion(currentQuestionIndex);
    } else {
        showScore();
    }
});
}
function fetchQuestions() {
    fetch('/computer_science_questions.json')
        .then(response => response.json())
        .then(data => {
            computer_science_questions = data;
            loadQuestion(currentQuestionIndex);
        })
        .catch(error => {
            console.error('Failed to fetch questions:', error);
            alert('Failed to load questions. Please try again later.');
        });
}

if (window.location.pathname.endsWith("quiz_page.html")) {
    fetchQuestions();
}

// -------------------------------------------------------------------------------------------------------------------------


function handleFormSubmission(event) {
    event.preventDefault();
    const nameInput = document.getElementById("name").value.trim();
    if (nameInput) {
        localStorage.setItem("userName", nameInput);
        window.location.href = "/quiz_page.html";
    } else {
        alert("Please enter your name to proceed.");
    }
}

const userInfoForm = document.getElementById("user-info-form");
console.log("Name entered:", userInfoForm);
if (userInfoForm) {
    userInfoForm.addEventListener("submit", handleFormSubmission);
}

// -------------------------------------------------------------------------------------------------------------------------

const leaderboard = JSON.parse(localStorage.getItem("leaderboard") || "[]");

const tableBody = document.querySelector("#leaderboard-table tbody");

leaderboard.forEach((entry, index) => {
    const row = document.createElement("tr");
    row.innerHTML = `
        <td>${index + 1}</td>
        <td>${entry.name}</td>
        <td>${entry.score}</td>
        `;
    tableBody.appendChild(row);
});

document.getElementById("clear-leaderboard").addEventListener("click", () => {
localStorage.removeItem("leaderboard");
location.reload();
});
