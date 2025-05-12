let diasDaSemana = prompt('Qual é o dia da Semana?')

if(diasDaSemana == "Sábado" || diasDaSemana == "Domingo"){
    alert('Bom final de semana');
}else{
    alert('Boa Semana!');
}

let numero =  prompt('Digite um número:');

if(numero %2 === 0){
    alert('numero par');
}else{
    alert('numero impar');
}

alert('Seja bem vindo a tabela de jogos');
let pontuacao = prompt('Informe sua pontuação: ');

if(pontuacao >=100){
    alert('Parabéns, você venceu!');
}else{
    alert('Tente novamente para ganhar!');
}

let saldo = 702089987; 
alert(`Olá seu saldo é ${saldo}`);

let nome = prompt('digite o seu nome: ');

alert(`Seja bem vindo! ${nome}`);