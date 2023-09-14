const Container = document.querySelector(".container")
const Cardlist = document.getElementById("card-con")
const AddQuestionCard = document.getElementById("add-question-card")
const CardButton = document.getElementById("save-btn")
const Question = document.getElementById("questions")
const Answer = document.getElementById("answer")
const AddQuestion = document.getElementById("add-flashcard")
const ShowQuestion =document.getElementById("show-flashcard")
const ErrorMessage = document.getElementById("error")
let editBool = false;


AddQuestion.addEventListener("click", () =>{
// Cardlist.classList.add("hide");
    Question.value="";
    Answer.value="";
    AddQuestionCard.classList.remove("hide");
  });
// --------------------------------------------------
ShowQuestion.addEventListener("click",
(hideQuestion= ()=> {

AddQuestionCard.classList.add("hide");
if (editBool){
    editBool=false;
    submitQuestion();
}
})
);
// --------------------------------------------------
//Submit Question
CardButton.addEventListener(
    "click",
    (submitQuestion = () => {
      editBool = false;
      tempQuestion = Question.value.trim();
      tempAnswer = Answer.value.trim();
      if (!tempQuestion || !tempAnswer) {
        ErrorMessage.classList.remove("hide");
      } else {
        Container.classList.remove("hide");
        ErrorMessage.classList.add("hide");
        viewlist();
        Question.value = "";
        Answer.value = "";
      }
    })
  );
  //Card Generate
  function viewlist() {
    var ListCard = document.getElementsByClassName("card-list-container");
    var div = document.createElement("div");
    div.classList.add("card");

    div.innerHTML += `<p class="question-div">
    ${Question.value}</p>`;
    var DisplayAnswer = document.createElement("p")
    DisplayAnswer.classList.add("answer-div","hide")
    DisplayAnswer.innerText=Answer.value

    var link = document.createElement("a");
    link.setAttribute("href","#")
    link.setAttribute("class","show-hide-btn")
    link.innerHTML = "Show/Hide"
    link.addEventListener("click", () => {
        DisplayAnswer.classList.toggle("hide")
    })


div.appendChild(link);
    div.appendChild(DisplayAnswer);
    // --------------------------------------------------
    let buttonsCon = document.createElement("div")
    buttonsCon.classList.add("buttons-con")
    var editButton = document.createElement("button")
    editButton.setAttribute("class","edit")
    editButton.innerHTML=`<p class="">EDIT</p>`
    editButton.addEventListener("click", ()=> {
        editBool = true;
        modifyElement(editButton,true);
        AddQuestionCard.classList.remove("hide")
    });
buttonsCon.appendChild(editButton)


var deleteButton = document.createElement("button")
 deleteButton.setAttribute("class","delete")
 deleteButton.innerHTML=`<p class="">DELETE</p>`
deleteButton.addEventListener("click",()=> {
    modifyElement(deleteButton)
}) ;
buttonsCon.appendChild(deleteButton)

div.appendChild(buttonsCon);
ListCard[0].appendChild(div);
hideQuestion();
}
 // --------------------------------------------------
 

    // --------------------------------------------------
const modifyElement = (element,edit=false) => {
    let parentDiv = element.parentElement.
    parentElement;
    let parentQuestion= parentDiv.querySelector(".question-div").innerText;
    if (edit) {
        let parentAns = parentDiv.querySelector(".answer-div").innerText;
    Answer.value= parentAns;
    Question.value= parentQuestion;
    disableButtons(true);
}
parentDiv.remove();
};
    // --------------------------------------------------

    const disableButtons = (value) => {
        let editButtons = document.getElementsByClassName=("edit")
        Array.from(editButtons).forEach((element) => {
            element.disabled = value;
        });
    };
