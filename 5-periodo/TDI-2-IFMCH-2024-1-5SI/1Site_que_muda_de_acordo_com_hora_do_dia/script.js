function mudar_cafe() {
    var descricao = window.document.getElementById('descricao')
    var fotos_comidas = window.document.getElementById('fotos_comidas')
    var data = new Date()
    var hora = data.getHours()


    descricao.innerHTML = 'O horário atual: ${hora}'
        if (hora>=5 && hora <=8){
           fotos_comidas.src= 'coffe.jng'
        }else if(hora>=10 && hora <=13 ){
            fotos_comidas.src= 'monkey_food.jng'

        }else if (hora>=15 && hora <=17){
            fotos_comidas.src= 'Launch_afternoom.jng'
        }else if (hora>=18 && hora<=20){
            fotos_comidas.src= 'jantar.jpg'
        }

}