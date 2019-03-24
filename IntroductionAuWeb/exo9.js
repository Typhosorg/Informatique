// le tableau qui contient le chemin
// du fichier image pour chaque image
var array = [];

// si clicked[i] == true alors array[i] est visible
var clicked = [];

// pour décider si un clic est
// un premier clic ou non
var first_click = true;

// l'indice de la première image cliquée
var first_index = 0;

// le nombre total de paires de clics
var clicks_number = 0;

// le nombre de paires de clics réussis
// (les paires de clics qui ont découvert
// des images identiques)
var good_clicks_number = 0;

// affecte à l'attribut src des deux images d'indice i et j
// le source de l'image "point d'interrogation"
function hide(i, j) {
	let images = document.querySelectorAll("img");
	images[i].src = "images/question-mark.png";
	images[j].src = "images/question-mark.png";
}

// gère le clic sur l'image d'indice n
function click_image(n) {
	let images = document.querySelectorAll("img"); // Récupère toutes les ilages
	if (images[n].getAttribute("src") == "images/question-mark.png") { // Si on clique sur un point d'interrogation
		if (first_click) { // Si c'est le premier clic
			images[n].src = array[n]; // On affiche
			clicked[first_index] = images[n].src; //On enregistre la source
			clicked[first_index+1] = n; // On enregistre l'indice
			first_click = false;
		} else { // i.e c'est le 2ème clique
			images[n].src = array[n]; // On affiche
			if (clicked[first_index] == images[n].src) { //Si les 2 ont la même source
				good_clicks_number += 1; // On ajoute un bon clic
			} else {
				setTimeout(hide, 1000, clicked[first_index+1], n); // Sinon on cache les images
			}
			if (good_clicks_number == 8) { // Si les 8 pairs ont été trouvé
				let resultat = document.getElementById("result");
				resultat.style.visibility = "visible"; // On affiche la div
				resultat.innerHTML = clicks_number+" clics avant de finir le jeu de mémoire !"; //On affiche un message
			}
			clicks_number += 1;
			first_click = true;
		}
	}
}

// rempli le tableau array avec la valeur de
// l'attribut 'name' des images
function init() {
	let images = document.querySelectorAll("img");
	for (let i=0; i<16; i++) {
		array[i]=images[i].getAttribute("name");
	}
}

window.onload = init;
