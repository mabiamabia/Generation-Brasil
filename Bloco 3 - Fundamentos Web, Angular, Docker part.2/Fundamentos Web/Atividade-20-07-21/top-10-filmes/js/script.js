alert('um teste')

let nome = window.document.getElementsById('#nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')

function validaNome() {
    let txt = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txt.innerHTML = ('Nome invalido')
    }else {
        txt.innerHTML = ('Nome Válido')
    }
}
