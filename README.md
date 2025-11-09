# Atelier Android - Interfaces Utilisateur

## 
�
�
Étudiant - **Nom:** Ali Benettoumi - **Date:** 08/11/2025

## 
�
�
Exercices réalisés

### Exercice 1 : Calculatrice (LinearLayout) -
✅
Interface avec LinearLayout -
✅
Opérations d'addition et soustraction -
✅
Validation des entrées

### Exercice 2 : Profil Utilisateur (ConstraintLayout) -
✅
Interface avec ConstraintLayout -
✅
Formulaire de profil -
✅
Mise à jour des informations

### Challenge : Application de Contact

-
✅
Formulaire complet avec tous les champs -
✅
RadioButtons pour catégories -
✅
Validation complète -
✅
Affichage formaté -
✅
Fonction de réinitialisation 


## 🖼️ Captures d’Écran

![Calculatrice](captures/calculatrice.png)
![Profil Utilisateur](captures/profil.png)
![Application de Contact](captures/contact.png)


## 📚 Ce que j’ai appris

- Créer et organiser des interfaces avec LinearLayout et ConstraintLayout

- Manipuler les composants Android : EditText, TextView, Button, RadioGroup

- Gérer les événements OnClickListener et les Toasts

- Implémenter la validation des champs avant le traitement

- Structurer proprement une activité Android avec fonctions dédiées (ajouterContact, réinitialiser, enregistrerProfil)

 
## ⚙️ Difficultés rencontrées

Problème : Alignement vertical des champs dans ConstraintLayout

✅ Solution : Ajout correct des contraintes layout_constraintTop_toBottomOf pour chaque élément.

Problème : Vérification des champs vides non fonctionnelle

✅ Solution : Utilisation de if (text.isEmpty()) avec des Toast pour chaque champ.

Problème : Erreur lors de la récupération de la catégorie non sélectionnée

✅ Solution : Vérification avec if (selectedId == -1) avant d’accéder au RadioButton.