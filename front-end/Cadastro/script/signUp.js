const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const iusername = document.querySelector(".username");
const isenha = document.querySelector(".senha");
const isenhaconf = document.querySelector(".senhaConf");

function cadastrar(){
        fetch("http://localhost:8080/usuarios",
        {
            headers:{
                "Accept": "application/json",
                "Content-Type": "application/json"
            },
            method: "POST",
            body: JSON.stringify({
                apelido: iusername.value,
                senha: isenha.value
            })
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})

}

function limpar(){
     iusername.value = "",
     isenha.value = "",
     isenhaconf.value = ''
}
formulario.addEventListener("submit",function (event){
    event.preventDefault();
    if(isenha.value.length>5){
        if(isenha.value === isenhaconf.value){
            cadastrar();
            window.alert("Parabéns, o usuario foi criado");
            limpar();
        }else{
            isenha.classList.add('error');
            isenhaconf.classList.add('error');
            window.alert("Existe uma diferença entre senhas");
        }
    }else{
        window.alert("Senha curta, Por favor insira uma senha maior");
    }
})
isenha.addEventListener('focus',()=>{
    isenha.classList.remove('error');
    isenhaconf.classList.remove('error');
})
isenhaconf.addEventListener('focus',()=>{
    isenha.classList.remove('error');
    isenhaconf.classList.remove('error');
})