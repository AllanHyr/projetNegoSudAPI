CREATE TABLE Stock(
   id BIGINT auto_increment,
   quantite_stock INT,
   PRIMARY KEY(id)
);

insert into stock (id, quantite_stock) values 
(1, 15),
(2, 50), 
(3, 0),
(4, 3000),
(5, 48),
(6, 488),
(7, 98),
(8, 34),
(9, 100),
(10, 66);

CREATE TABLE Familles(
   id BIGINT auto_increment,
   nom VARCHAR(50) NOT NULL,
   description VARCHAR(750),
   PRIMARY KEY(id)
);

INSERT INTO Familles (id, nom, description) VALUES
(1, 'Rouge', 'Vins rouges, souvent corsés et riches en tanins.'),
(2, 'Blanc', 'Vins blancs, généralement plus légers et frais.'),
(3, 'Rosé', 'Vins rosés, avec une teinte rose résultant d\'une courte macération des peaux.'),
(4, 'Champagne', 'Vins pétillants, souvent associés aux célébrations.'),
(5, 'Dessert', 'Vins sucrés, parfaits pour accompagner les desserts.'),
(6, 'Sec', 'Vins secs, avec une faible teneur en sucre résiduel.'),
(7, 'Biologique', 'Vins issus de raisins cultivés selon des pratiques biologiques.'),
(8, 'Aromatique', 'Vins avec des arômes prononcés, souvent floraux ou fruités.'),
(9, 'Corsé', 'Vins riches en saveurs et en corps.'),
(10, 'Léger', 'Vins légers, parfaits pour une dégustation décontractée.');

CREATE TABLE Utilisateurs(
   id BIGINT auto_increment,
   grade INT,
   identifiant VARCHAR(50) NOT NULL,
   mot_de_passe VARCHAR(50) NOT NULL,
   nom VARCHAR(50),
   prenom VARCHAR(50),
   token VARCHAR(50),
   PRIMARY KEY(id)
);

INSERT INTO Utilisateurs (id, grade, identifiant, mot_de_passe, nom, prenom) VALUES
(1, 1, 'admin', 'motdepasseadmin', 'Admin', 'Super'),
(2, 0, 'utilisateur1', 'motdepasse1', 'Dupont', 'Jean'),
(3, 0, 'utilisateur2', 'motdepasse2', 'Martin', 'Sophie'),
(4, 1, 'moderateur', 'motdepassemode', 'Modo', 'Marianne'),
(5, 0, 'user3', 'password3', 'Lefevre', 'Pierre'),
(6, 1, 'admin2', 'adminpass', 'Admin', 'Second'),
(7, 0, 'john_doe', 'johnspassword', 'Doe', 'John'),
(8, 0, 'user4', 'securepass', 'Smith', 'Alice'),
(9, 1, 'poweruser', 'strongpassword', 'Power', 'User'),
(10, 0, 'user5', 'mypassword', 'Johnson', 'Emma');

CREATE TABLE Coordonnees(
   id BIGINT auto_increment,
   adresse VARCHAR(50) NOT NULL,
   mail VARCHAR(50),
   telephone VARCHAR(10),
   fk_utilisateur BIGINT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(fk_utilisateur) REFERENCES Utilisateurs(id)
);

INSERT INTO Coordonnees (id, adresse, mail, telephone, fk_utilisateur) VALUES
(1, '123 Rue de la République', 'admin@example.com', '+1234567890', 1),
(2, '456 Avenue des Champs-Élysées', 'user1@example.com', '+9876543210', 2),
(3, '789 Rue du Faubourg Saint-Honoré', 'user2@example.com', '+1122334455', 3),
(4, '101 Boulevard Haussmann', 'modo@example.com', '+9998887777', 4),
(5, '202 Rue de la Liberté', 'user3@example.com', '+4445556666', 5),
(6, '303 Avenue Montaigne', 'admin2@example.com', '+7778889999', 6),
(7, '404 Rue du Bac', 'john@example.com', '+1112223333', 7),
(8, '505 Quai des Orfèvres', 'user4@example.com', '+6667778888', 8),
(9, '606 Rue Royale', 'power@example.com', '+3332221111', 9),
(10, '707 Boulevard Saint-Germain', 'user5@example.com', '+0009998888', 10);

CREATE TABLE Fournisseurs(
   id BIGINT auto_increment,
   nom VARCHAR(50),
   description VARCHAR(750),
   fk_coordonnee BIGINT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(fk_coordonnee) REFERENCES Coordonnees(id)
);

INSERT INTO Fournisseurs (id, nom, description, fk_coordonnee) VALUES
(1, 'Les domaines de Tariquet', 'Producteur de vins de qualité du domaine Tariquet.', 1),
(2, 'Pelleheaut', 'Vignoble Pelleheaut, spécialisé dans les vins de Gascogne.', 2),
(3, 'Joy', 'Fournisseur Joy, offrant une sélection unique de vins.', 3),
(4, 'Vignoble Fontan', 'Vignoble Fontan, producteur de vins traditionnels.', 4),
(5, 'Uby', 'Domaine Uby, expert en vins du Sud-Ouest.', 5);

CREATE TABLE Articles(
   id BIGINT auto_increment,
   nom VARCHAR(50) NOT NULL,
   reference VARCHAR(50) NOT NULL,
   prix DECIMAL(15,2),
   description VARCHAR(750),
   marge DECIMAL(15,2),
   conditionnement INT,
   reapprovisionnement boolean NOT NULL,
   quantite_reappro INT,
   seuil_mini INT,
   fk_fournisseur BIGINT NOT NULL,
   fk_stock BIGINT NOT NULL,
   fk_famille BIGINT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(fk_fournisseur) REFERENCES Fournisseurs(id),
   FOREIGN KEY(fk_stock) REFERENCES Stock(id),
   FOREIGN KEY(fk_famille) REFERENCES Familles(id)
);

INSERT INTO Articles (id, nom, reference, prix, description, marge, conditionnement, reapprovisionnement, quantite_reappro, seuil_mini, fk_fournisseur, fk_stock, fk_famille) VALUES
(1, 'Château Margaux 2010', 'CM2010', 199.99, 'Vin rouge de Bordeaux, millésime 2010.', 0.20, 6, true, 20, 5, 1, 1, 1),
(2, 'Domaine de la Romanée-Conti', 'DRC2012', 1299.99, 'Vin rouge de Bourgogne, millésime 2012.', 0.25, 1, true, 10, 3, 2, 2, 1),
(3, 'Veuve Clicquot Brut', 'VCBRUT', 59.99, 'Champagne brut de renommée mondiale.', 0.15, 12, true, 30, 10, 5, 3, 4),
(4, 'Sancerre Blanc', 'SB2020', 29.99, 'Vin blanc de la région de Sancerre, millésime 2020.', 0.18, 6, true, 15, 8, 5, 4, 2),
(5, 'Château d\'Yquem 2005', 'YQ2005', 399.99, 'Vin liquoreux de Sauternes, millésime 2005.', 0.22, 1, true, 5, 2, 5, 5, 5),
(6, 'Prosecco Extra Dry', 'PROSECCO', 14.99, 'Vin pétillant italien, style Prosecco.', 0.12, 6, true, 25, 15, 2, 6, 3),
(7, 'Chablis Premier Cru', 'CHABPREM', 44.99, 'Vin blanc de Bourgogne, Premier Cru.', 0.20, 6, true, 18, 7, 3, 7, 2),
(8, 'Rioja Reserva', 'RIORES', 24.99, 'Vin rouge espagnol, style Reserva.', 0.15, 12, true, 22, 12, 4, 8, 1),
(9, 'Gewürztraminer', 'GEWURZ', 19.99, 'Vin blanc alsacien, cépage Gewürztraminer.', 0.18, 6, true, 20, 10, 4, 9, 2),
(10, 'Merlot 2018', 'MERLOT2018', 17.99, 'Vin rouge, millésime 2018.', 0.12, 12, true, 15, 5, 3, 10, 1);

CREATE TABLE Commandes(
   id BIGINT auto_increment,
   date_commande timestamp NOT NULL,
   commentaire VARCHAR(50),
   fk_fournisseur BIGINT NOT NULL,
   fk_utilisateur BIGINT NOT NULL,
   PRIMARY KEY(id),
   FOREIGN KEY(fk_fournisseur) REFERENCES Fournisseurs(id),
   FOREIGN KEY(fk_utilisateur) REFERENCES Utilisateurs(id)
);

INSERT INTO Commandes (id, date_commande, commentaire, fk_fournisseur, fk_utilisateur) VALUES
(1, '2024-01-15', 'Commande régulière', 1, 3),
(2, '2024-02-02', 'Urgent - Livraison express', 2, 6),
(3, '2024-03-10', 'Articles spéciaux pour événement', 4, 1),
(4, '2024-04-05', 'Réapprovisionnement nécessaire', 3, 8),
(5, '2024-05-20', 'Commande annuelle de vins rares', 5, 5),
(6, '2024-06-12', 'Livraison à l\'adresse de stockage', 1, 7),
(7, '2024-07-08', 'Articles pour promotion estivale', 2, 2),
(8, '2024-08-15', 'Commande de vins pour mariage', 5, 9),
(9, '2024-09-22', 'Commande spéciale pour dégustation', 2, 4),
(10, '2024-10-30', 'Articles pour les fêtes de fin d\'année', 4, 10);

CREATE TABLE Facturation(
   id BIGINT auto_increment,
   TVA DECIMAL(15,2),
   date_paiement timestamp,
   moyen_paiement VARCHAR(50),
   fk_commande BIGINT NOT NULL,
   PRIMARY KEY(id),
   UNIQUE(fk_commande),
   FOREIGN KEY(fk_commande) REFERENCES Commandes(id)
);

INSERT INTO Facturation (id, TVA, date_paiement, moyen_paiement, fk_commande) VALUES
(1, 20.00, '2024-01-25', 'Carte de crédit', 1),
(2, 15.50, '2024-02-10', 'Virement bancaire', 2),
(3, 21.75, '2024-03-20', 'Chèque', 3),
(4, 18.00, '2024-04-15', 'PayPal', 4),
(5, 20.00, '2024-05-30', 'Espèces', 5),
(6, 15.50, '2024-06-25', 'Virement bancaire', 6),
(7, 21.75, '2024-07-15', 'Carte de crédit', 7),
(8, 18.00, '2024-08-28', 'Chèque', 8),
(9, 20.00, '2024-09-10', 'PayPal', 9),
(10, 15.50, '2024-10-15', 'Espèces', 10);

CREATE TABLE Livraison(
   id BIGINT auto_increment,
   date_livraison timestamp NOT NULL,
   adresse_livraison VARCHAR(50),
   fk_coordonnee BIGINT NOT NULL,
   fk_facturation BIGINT NOT NULL,
   PRIMARY KEY(id),
   UNIQUE(fk_facturation),
   FOREIGN KEY(fk_coordonnee) REFERENCES Coordonnees(id),
   FOREIGN KEY(fk_facturation) REFERENCES Facturation(id)
);

INSERT INTO Livraison (id, date_livraison, adresse_livraison, fk_coordonnee, fk_facturation) VALUES
(1, '2024-01-30', '123 Rue de la République', 1, 1),
(2, '2024-02-15', '456 Avenue des Champs-Élysées', 2, 2),
(3, '2024-03-25', '789 Rue du Faubourg Saint-Honoré', 3, 3),
(4, '2024-04-20', '101 Boulevard Haussmann', 4, 4),
(5, '2024-06-05', '202 Rue de la Liberté', 5, 5),
(6, '2024-06-30', '303 Avenue Montaigne', 6, 6),
(7, '2024-08-15', '404 Rue du Bac', 7, 7),
(8, '2024-08-28', '505 Quai des Orfèvres', 8, 8),
(9, '2024-09-10', '606 Rue Royale', 9, 9),
(10, '2024-10-20', '707 Boulevard Saint-Germain', 10, 10);

CREATE TABLE Articles_Commandes(
   fk_article BIGINT,
   fk_commande BIGINT,
   quantite INT,
   prix_applique DECIMAL(15,2),
   PRIMARY KEY(fk_article, fk_commande),
   FOREIGN KEY(fk_article) REFERENCES Articles(id),
   FOREIGN KEY(fk_commande) REFERENCES Commandes(id)
);

INSERT INTO Articles_Commandes (fk_article, fk_commande, quantite, prix_applique) VALUES
(1, 1, 2, 399.98),
(2, 2, 1, 1299.99),
(3, 3, 3, 179.97),
(4, 4, 2, 89.98),
(5, 5, 1, 399.99),
(6, 6, 4, 59.96),
(7, 7, 2, 89.98),
(8, 8, 3, 74.97),
(9, 9, 1, 19.99),
(10, 10, 2, 35.98);
