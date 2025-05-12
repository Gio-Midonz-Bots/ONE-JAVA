alert('Bem vindas ao nosso site!');
let nome =prompt('Digite o seu nome: ');
let idade = prompt('Digite o sua idade: ');
let numeroDeVendas = 50;
let saldoDisponivél = 1000;
let mensagemDeErro = 'Erro! não atingiu a idade mínima';

if( idade >= 18){
    alert('Pode tirar habilitação!')
}else{
    alert(mensagemDeErro)

}
