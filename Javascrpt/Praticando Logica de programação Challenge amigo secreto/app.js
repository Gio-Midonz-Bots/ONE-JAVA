let nomeDeAmigos = [];
// Explicação 
// O campo de input cria uma caixa para que os dados sejam inseridos.
// O querySelector recupera os dados inseridos.
// O value acessa os dados inseridos e os disponibiliza para uso.
function adicionarAmigo(){
    let amigo = document.querySelector('.input-name').value;

    if(amigo == ''){
        alert('Por favor, insira um nome.');
    }else{
        nomeDeAmigos.push(amigo)
        limparcaixa();
        exibirListaNaTela(); // Exibe a lista atualizada na tela
    }
}

function exibirListaNaTela() {
    let listaAmigos = document.getElementById('listaAmigos');
    listaAmigos.innerHTML = ''; // Limpa a lista antes de exibir

    nomeDeAmigos.forEach(function(amigo) {
        let itemLista = document.createElement('li');
        itemLista.textContent = amigo;
        listaAmigos.appendChild(itemLista);
    });
}
function limparcaixa(){
    amigo = document.querySelector('.input-name');
    amigo.value = '';
}
function sortearAmigo(){
    if (nomeDeAmigos.length === 0) {
        alert('Por favor, adicione pelo menos um amigo antes de sortear.');
        return; // Interrompe a execução da função
    }

    // Gera um índice aleatório
    let indiceSorteado = Math.floor(Math.random() * nomeDeAmigos.length);

    // Obtém o nome sorteado
    let amigoSorteado = nomeDeAmigos[indiceSorteado];

    // Exibe o resultado na tela
    let resultadoElemento = document.getElementById('resultado');
    resultadoElemento.innerHTML = `<li>Amigo sorteado: ${amigoSorteado}</li>`;
}