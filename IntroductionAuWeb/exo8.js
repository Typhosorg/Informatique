
window.onload = function () {

    // le "handler" du setTimeout
    let chrono = null;

    // si 'ok' est 'true', alors l'utilisateur
    // a choisi la bonne réponse
    let ok = false;

    // affiche le message 'm' avec la couleur 'c'
    // dans l'élément prévu à cet effet
    function msg(m, c) {
        document.getElementById("message").innerHTML = m;
        document.getElementById("message").style.color = c;
    }

    // cette fonction est appelée à l'issue
    // du setTimeout
    function stop() {
        clearTimeout(chrono);
        chrono = null;
    }

    // traite le "clic" sur un bouton radio
    function verifier() {
        if (chrono != null) {
            if(this.hasAttribute("data-ok")){
                msg("Bonne réponse ! Et dans les temps ! BRAVO !", "green");
            }else{
                msg("Mauvaise réponse ! Resaisissez-vous !", "red");
            }
        }else{
            if(this.hasAttribute("data-ok")){
                msg("Temps écoulé mais bonne réponse ! :) ", "green");
            }else{
                msg("Temps écoulé et mauvaise réponse ! C'est une HONTE !", "red");
            }
        }
    }

    chrono = setTimeout(stop, 5 * 1000);

    var inputs = document.querySelectorAll("input");
    for (var i = 0; i < inputs.length; i++) {
        inputs[i].onclick = verifier;
        inputs[i].checked = false;
    }
    // ici, on lance le setTimeout et stocke
    // le "handler" dans la variable 'chrono'

};
