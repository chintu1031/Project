const input=document.querySelector("input");
const ol=document.querySelector("ol");
const btn=document.querySelector("button");

btn.addEventListener("click",(e)=>{
    const li=document.createElement('li');
    li.textContent=input.value;
    ol.append(li);
    input.value='';
});
 
ol.addEventListener('click',(e)=>{
    e.target.remove();
})