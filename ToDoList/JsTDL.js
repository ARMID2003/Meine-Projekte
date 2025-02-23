window.addEventListener('load',() => {
 const form = document.querySelector("#New-task-form");
 const Input = document.querySelector("#New-task-input");
 const list_el = document.querySelector("#Taskes");

 form.addEventListener('submit' , (e) => 
 {e.preventDefault();

     const task = Input.value; 
    

     if (!task) {
         alert("Please fill out the task");
            return;
         }
   
     const task_el = document.createElement("div");
     task_el.classList.add("task");

     const task_content_el = document.createElement("div");
     task_content_el.classList.add("Content");

    
     task_el.appendChild(task_content_el);

     const task_input_el = document.createElement("Input");
     task_input_el.classList.add("text");
     task_input_el.type="text";
     task_input_el.value = task;
     task_input_el.setAttribute("readonly","readonly")

task_content_el.appendChild(task_input_el);

const task_actions_el = document.createElement("div")
task_actions_el.classList.add("actions")

const task_edit_el = document.createElement("button");
task_edit_el.classList.add("Edit");
task_edit_el.innerHTML = "Edit";


const task_delete_el = document.createElement("button");
task_delete_el.classList.add("Delete");
task_delete_el.innerHTML = "Delete";

 
task_actions_el.appendChild(task_edit_el);

task_actions_el.appendChild(task_delete_el);

  
task_el.appendChild(task_actions_el);

  list_el.appendChild(task_el);

     Input.value="";


     task_edit_el.addEventListener('click', () => {
         if(task_edit_el.innerText.toLowerCase()== "edit"){
         task_input_el.removeAttribute("readonly");
         task_input_el.focus();
         task_edit_el.innerText="Save";
     } else {
         task_input_el.setAttribute("readonly","readonly");
         task_edit_el.innerText="Edit";}
     });

     task_delete_el.addEventListener('click', () => {
         list_el.removeChild(task_el);
     });

 });
}); 
//  i use from Youtube
