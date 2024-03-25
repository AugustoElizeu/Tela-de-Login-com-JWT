const formulario = document.querySelector("form");
const iusername = document.querySelector(".username");
const isenha = document.querySelector(".senha");
const isenhaconf = document.querySelector(".senhaConf");

async function cadastrar() {
    try {
        const response = await fetch("http://localhost:8080/auth/register", {
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json"
            },
            method: "POST",
            body: JSON.stringify({
                apelido: iusername.value,
                senha: isenha.value,
                role: "USER"
            })
        });
        
        if (response.status === 400) {
            window.alert("Esse nome de usuário já existe em nosso sistema");
            return response.status;
        }
        
        return response;
    } catch (error) {
        console.error("Erro ao cadastrar:", error);
        throw error;
    }
}

function limpar() {
    iusername.value = "";
    isenha.value = "";
    isenhaconf.value = "";
}

formulario.addEventListener("submit", async function (event) {
    event.preventDefault();
    try {
        if (!iusername.value || !isenha.value || !isenhaconf.value) {
            window.alert("Por favor, preencha os campos abaixo");
            return null;
        }
        
        if (isenha.value.length > 5) {
            if (isenha.value === isenhaconf.value) {
                const response = await cadastrar();
                if (response !== 400) {
                    window.alert("Parabéns, o usuário foi criado");
                    window.location.href = "/Login/index.html";
                    limpar();
                }
            } else {
                isenha.classList.add('error');
                isenhaconf.classList.add('error');
                window.alert("Existe uma diferença entre as senhas");
            }
        } else {
            window.alert("Senha curta, Por favor insira uma senha maior");
        }
    } catch (error) {
        console.error("Erro ao cadastrar:", error);
    }
});

isenha.addEventListener('focus', () => {
    isenha.classList.remove('error');
    isenhaconf.classList.remove('error');
});

isenhaconf.addEventListener('focus', () => {
    isenha.classList.remove('error');
    isenhaconf.classList.remove('error');
});
