const formulario = document.querySelector("form");
const iapelido = document.querySelector(".apelido");
const isenha = document.querySelector(".senha");

function login() {
    return fetch("http://localhost:8080/auth/login", {
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        method: "POST",
        body: JSON.stringify({
            apelido: iapelido.value,
            senha: isenha.value,
            role: "USER"
        })
    })
    .then(response => {
        if (response.status === 200) {
            return "https://www.youtube.com/watch?v=Bo9yoHXVtME";
        } else if (response.status === 403) {
            window.alert("Usuario ou senha incorretos");
            throw new Error("Usuário ou senha incorretos");
        } else {
            window.alert("Erro de requsição");
            throw new Error('Erro na requisição: ' + response.status);
        }
    });
}

formulario.addEventListener("submit", async function (event) {
    event.preventDefault();
    try {
        const responseUrl = await login();
        if (responseUrl === "true") {
            iapelido.classList.add("error");
            isenha.classList.add("error");
        } else {
            window.alert("Bem-Vindo: senhor " + iapelido.value);
            window.location.href = responseUrl;
        }
    } catch (error) {
        console.error("Erro:", error.message);
    }
});

iapelido.addEventListener("focus", () => {
    iapelido.classList.remove("error");
    isenha.classList.remove("error");
});

isenha.addEventListener("focus", () => {
    iapelido.classList.remove("error");
    isenha.classList.remove("error");
});