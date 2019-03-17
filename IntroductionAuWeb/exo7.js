
window.onload = function () {
    let secondes = 0;
    let minutes = 0;
    let heures = 0;




    // affiche le nombre "t" dans le span "spanElt"
    // "t" a au plus deux chiffres
    function afficher(t, spanElt) {
        var digits = [];
        digits[0] = Math.floor(t / 10);
        digits[1] = t % 10;
        console.log(digits[0]+""+digits[1]);
        elements = spanElt.querySelectorAll("img");
        elements[0].src = "images/" + digits[0] + ".png";
        elements[1].src = "images/" + digits[1] + ".png";
    }

    // met à jour les images de l'horloge
    // à chaque seconde
    function tictac() {
        secondes++;
        if (secondes == 61) {
            secondes = 1;
            minutes++;
        }

        if (minutes == 61) {
            minutes == 1;
            heures++;
        }

        if (heures == 100) {
            secondes = 0;
            minutes = 0;
            heures = 0;
        }
        console.log("s"+secondes+"m"+minutes+"h"+heures);
        spans = document.querySelectorAll("span");
        afficher(secondes, spans[0]);
        afficher(minutes, spans[1]);
        afficher(heures, spans[2]);

    }

    setInterval(tictac, 10);

    // ici, il faut lancer l'horloge

};
