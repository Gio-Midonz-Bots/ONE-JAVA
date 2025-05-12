alert('Olá, bem vindo ao jogo do número Secreto?');
let valorMax = 99;
let numeroSecreto =  parseInt(Math.random()* valorMax + 1);
let tentativas = 1 ; 
let chute;

while (chute != numeroSecreto ){
    chute = prompt(`escolha um número de 1 à ${valorMax + 1}: `);
    if (numeroSecreto == chute){
        break;
    }else{
        if(chute >numeroSecreto){
            alert(`o numero secreto é menor que o ${chute}`);
  
        }else{
            alert(`o numero secreto é maior que o ${chute}`);
            
        }
    }
    tentativas++;
}


let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa'