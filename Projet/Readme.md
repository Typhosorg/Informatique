C'est un projet... pour ADW...

Le Taquin

Le taquin est un jeu solitaire en forme de damier. Il est composé de N petits carreaux numérotés de 1 à N qui glissent dans un cadre prévu pour N+1. Il consiste à remettre dans l'ordre les N carreaux à partir d'une configuration initiale quelconque.
Principe

L'ordinateur propose une grille aléatoire. L'utilisateur doit remettre tous les carreaux dans l'ordre (de haut en bas et de gauche à droite) avec le trou en bas à droite, simplement en échangeant des carreaux avec le trou. On peut faire glisser un seul carreau à la fois et seuls les carreaux contigus au trou peuvent glisser. Certaines configurations initiales n'ont pas de solution.
Fonctionnalités

Votre site web doit comporter :

    une page d'accueil : la page doit présenter brièvement le jeu et grâce à un clic on soit pouvoir jouer
    il doit être possible de choisir la taille de la grille (2x2, 2x3, 3x2 ou 3x3 seulement)
    la page de jeu : cette page ne se réactualise pas à chaque coup joué

A la fin d'une partie, le joueur doit être redirigé vers la page d'accueil. Sur la page de jeu, si l'utilisateur clique sur un carreau non contigu au trou, ou bien clique sur le trou, il ne se passe rien. A la fin de la partie, le programme affiche de nombre total de déplacements de carreaux effectués pour résoudre le taquin.

Mise en oeuvre

Au début de la partie, le serveur doit générer une grille de la taille voulue avec les carreaux disposés aléatoirement. Une fois la grille affichée chez le client, c'est le code JavaScript qui prend le relai. Il n'y a donc pas de rechargement de la page entre deux coups. 
