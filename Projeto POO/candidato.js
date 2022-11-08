async function cadastrar() {
    //recuperar dados para inserção
    let nome = document.getElementById('nome').value;
    let partido = document.getElementById('partido').value;
    let idade = Number(document.getElementById('idade').value);
    let nota = Number(document.getElementById('nota').value);

    let candidato = {
        nome, partido, idade, nota
    }
    await fetch('http://localhost:8080/candidatos', {
        method: 'POST',
        body: JSON.stringify(candidato),
        headers: {
            "Content-Type": "application/json; charset=UTF-8"
        }
    }).then(resposta =>{
        alert('Candidato inserido com sucesso.')
    }).catch(erro =>{
        alert(erro)
    }).finally(() =>{
        document.getElementById('nome').value = "";
        document.getElementById('partido').value = "";
        document.getElementById('idade').value = "";
        document.getElementById('nota').value = "";
    })
}

async function consultar(){
    
    let candidatos = await fetch("http://localhost:8080/candidatos").then(resposta =>{
        return resposta.json();
    }).catch(erro =>{
        alert(erro)
    })


    let conteudoTabela = ''
    candidatos.forEach(candidato => {
        conteudoTabela += `<tr><td>${candidato.nome}</td><td>${candidato.partido}</td><td>${candidato.idade}</td><td>${candidato.nota}</td><td><i class="bi bi-trash"></i></td><td><i class="bi bi-pencil"></i></td></tr>`
    });

    document.getElementById("conteudoTabela").innerHTML = conteudoTabela;
}