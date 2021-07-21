alert('um teste')

let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = false


nome.style.width = '100%'
email.style.width = '100%'


function enviar(){
    if (nomeOk == true  && emailOk == true && assuntoOk == true) {
        alert('Formulario enviado com sucesso')
    }else {
        alert('Preencha o formulário')
    }
}

function validaNome() {
    let txt = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txt.innerHTML = ('Nome invalido')
    }else {
        txt.innerHTML = ('Nome Válido')
    }
}

function validaEmail(){
    let txtEmail = document.querySelector('txtEmail')

    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
        txtEmail.innerHTML = 'E-mail inválido'
        txtEmail.style.color = 'red'       
    }else {
        txtEmail.innerHTML = 'E-mail válido'
        txtEmail.style.color = 'green'
    }
}

function mapaZoom(){
    
}

function mapaNormal(){

}
