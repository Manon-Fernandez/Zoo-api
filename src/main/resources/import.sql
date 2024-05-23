--creation des utilisateurs

INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO roles (name) VALUES ('EMPLOYE');
INSERT INTO roles (name) VALUES ('VETERINAIRE');
INSERT INTO utilisateur (password,email) VALUES ('Gz$&P$qSeHdh9#K9','jose@arcadiazoo.fr');
INSERT INTO utilisateur_roles (utilisateur_id,role_id) VALUES (1,1);
INSERT INTO utilisateur (password,email) VALUES ('E7eg&4RsXnmejmbp','employe@arcadiazoo.fr');
INSERT INTO utilisateur_roles (utilisateur_id,role_id) VALUES (2,2);
INSERT INTO utilisateur (password,email) VALUES ('8oxyT$sF#E794p8L','veterinaire@arcadiazoo.fr');
INSERT INTO utilisateur_roles (utilisateur_id,role_id) VALUES (3,3);

--creation d'avis

INSERT INTO avis (pseudo,commentaire,status) VALUES ('Dupont','Très beau zoo, les animaux sont magnifiques','VALIDE');
INSERT INTO avis (pseudo,commentaire,status) VALUES ('Martin','Journée superbe dans ce zoo avec les enfants !','VALIDE');
INSERT INTO avis (pseudo,commentaire,status) VALUES ('Petit','Les animaux sont bien traités, très bel endroit','VALIDE');
INSERT INTO avis (pseudo,commentaire,status) VALUES ('Dubois','Le zoo est super, de nouvelles espèces seraient une bonne évolution !','EN_ATTENTE');
INSERT INTO avis (pseudo,commentaire,status) VALUES ('Bernard','Incroyable zoo à faire avec les enfants !','EN_ATTENTE');
INSERT INTO avis (pseudo,commentaire,status) VALUES ('Thomas','Superbe zoo !','EN_ATTENTE');

--creation d'horaire

INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('LUNDI','09:00','18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('MARDI','09:00','18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('MERCREDI','09:00','18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('JEUDI','09:00','18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('VENDREDI','09:00','18:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('SAMEDI','09:00','19:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('DIMANCHE','09:00','19:00');
INSERT INTO horaire (jour,heure_ouverture,heure_fermeture) VALUES ('FERIE','09:00','19:00');

--creation de service

INSERT INTO service (nom,description) VALUES ('Restauration','Nous vous proposons plusieurs restaurants au sein du zoo. Il y en a pour tout les goûts, ils sont indiqués sur le plan !');
INSERT INTO service (nom,description) VALUES ('Visite des habitats','Nous vous offrons la possibilité de visité les différents habitats du parc avec un guide et tout cela est gratuit alors profitez-en !');
INSERT INTO service (nom,description) VALUES ('Visite du zoo','Le mythique petit train est disponible au sein du parc, montez à bord et explorez tout les recoins du zoo');

--creation d'habitat

INSERT INTO habitat (nom,description) VALUES ('Savane','Dans cette vaste plaine de 3 hectares, venez à la rencontre des animaux les plus emblématique de la savane. Girafes,zèbre,gnou et les autres évoluent harmonieusement dans ce territoire.');
INSERT INTO habitat (nom,description) VALUES ('Jungle','La jungle cet espace si mystérieux que tout le monde souhaite découvrir ! Venez à la rencontre des espèces incroyables qui la composent !');
INSERT INTO habitat (nom,description) VALUES ('Marais','Venez à la découverte des crocodiles, alligator et autres dans ce somptuex marais !');

--creation animal

INSERT INTO animal (prenom,race) VALUES ('Binti','Girafe réticulée');
INSERT INTO animal (prenom,race) VALUES ('Baya','Girafe réticulée');
INSERT INTO animal (prenom,race) VALUES ('Wami','Gnou');
INSERT INTO animal (prenom,race) VALUES ('Kanty','Gnou');
INSERT INTO animal (prenom,race) VALUES ('Hawii','Gnou');
INSERT INTO animal (prenom,race) VALUES ('Henna','Zèbre de Grévy');
INSERT INTO animal (prenom,race) VALUES ('Anjali','Zèbre de Grévy');
INSERT INTO animal (prenom,race) VALUES ('Domi','Raton laveur');
INSERT INTO animal (prenom,race) VALUES ('Joseph','Raton laveur');
INSERT INTO animal (prenom,race) VALUES ('Tigu','Raton laveur');
INSERT INTO animal (prenom,race) VALUES ('Jambi','Tigre de Sumatra');
INSERT INTO animal (prenom,race) VALUES ('Asu','Tigre de Sumatra');
INSERT INTO animal (prenom,race) VALUES ('Drac','Alligator du Mississippi');
INSERT INTO animal (prenom,race) VALUES ('Akili','Crocodile d''Amérique');
INSERT INTO animal (prenom,race) VALUES ('Tafari','Crocodile d''Amérique');

--creation sante

INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Binti est en pleine santé, rien à signaler.','Feuille, fruit,graine','30kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Baya a bien récupérée de sa légère plaie à la patte, tout est ok pour elle.','Feuille, fruit,graine','25kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Wami va très bien !','Feuille, herbe','18kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Kanty va très bien, elle a bien recupérée de sa gestation.','Feuille, herbe','15kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Hawii évolue bien, la relation avec ses parents est très bonne, il faut rester attentif !','Feuille, herbe','5kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Henna est en pleine forme.','Feuille,herbe','6kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Anjali a une plaie à surveiller, les soins ont été faits !','Feuille,herbe','8kg','29/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Domi est en pleine santé !','Fruit, graine, insecte','400g','30/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Joseph prend des distances avec le groupe, à surveiller !','Fruit, graine, insecte','400g','30/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Tigu est en forme !','Fruit, graine, insecte','400g','30/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Jambi va bien, toujours une bonne entente avec son frère.','Viande type cochon ou autre','8kg','30/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Asu est en pleine forme !','Viande type cochon ou autre','8kg','30/04/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Drac vieilli mais se porte encore bien !','poisson, crustacé','3kg','02/05/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Akili va très bien !','poisson, crustacé','3kg','02/05/2024');
INSERT INTO sante (etat_animal,nourriture,grammage,date_passage) VALUES ('Tafari est en pleine santé.','poisson, crustacé','3kg','02/05/2024');
