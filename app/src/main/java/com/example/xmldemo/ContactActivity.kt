package com.example.xmldemo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    // 1. DÉCLARER toutes les vues ici
    private lateinit var etFullName: EditText
    private lateinit var etPhone: EditText
    private lateinit var etEmail: EditText
    private lateinit var etAddress1: EditText
    private lateinit var etAddress2: EditText
    private lateinit var rgCategory: RadioGroup
    private lateinit var btn_ajouter: Button
    private lateinit var btn_reinitialiser: Button
    private lateinit var done_message: TextView

    // private lateinit var ...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.challenge)

        // 2. FAIRE LE BINDING de toutes les vues
        etFullName=findViewById(R.id.etFullName)
        etPhone=findViewById(R.id.etPhone)
        etEmail=findViewById(R.id.etEmail)
        etAddress1=findViewById(R.id.etAddress1)
        etAddress2=findViewById(R.id.etAddress2)
        btn_ajouter=findViewById(R.id.btn_ajouter)
        btn_reinitialiser=findViewById(R.id.btn_reinitialiser)
        rgCategory = findViewById(R.id.rgCategory)
        done_message = findViewById(R.id.done_message)

        // 3. DÉFINIR les événements des boutons
        // btnAjouter.setOnClickListener { ... }
        btn_ajouter.setOnClickListener {
            ajouterContact()
        }
        // btnReinitialiser.setOnClickListener { ... }
        btn_reinitialiser.setOnClickListener {
            reinitialiser()
        }
    }

    // 4. CRÉER la fonction ajouterContact()
    private fun ajouterContact() {
        // - Récupérer toutes les valeurs
        val nom = etFullName.text.toString()
        val telephone = etPhone.text.toString()
        val email_content = etEmail.text.toString()
        val adresse_1=etAddress1.text.toString()
        val adresse_2=etAddress2.text.toString()
        val selectedId = rgCategory.checkedRadioButtonId

        // - Vérifier qu'aucun champ n'est vide
        if (nom.isEmpty()) {
            Toast.makeText(this, "Le nom est obligatoire", Toast.LENGTH_SHORT).show()
            return
        }
        if(telephone.isEmpty()){
            Toast.makeText(this, "Le numero de telefone  est obligatoire", Toast.LENGTH_SHORT).show()
            return
        }
        if(email_content.isEmpty()){
            Toast.makeText(this,"Le email est obligatoire", Toast.LENGTH_SHORT).show()

            return
        }
        if(adresse_1.isEmpty()){
            Toast.makeText(this,"L'adresse numero 1 est obligatoire", Toast.LENGTH_SHORT).show()
            return
        }
        if(adresse_2.isEmpty()){
            Toast.makeText(this,"L'adresse numero 2 est obligatoire", Toast.LENGTH_SHORT).show()
            return
        }
        // Récupérer la catégorie
        val radioButton = findViewById<RadioButton>(selectedId)
        val category = radioButton.text.toString()
        // 4. Vérifier qu'un bouton est sélectionné
        if (selectedId == -1) {
            // Aucun bouton n'est sélectionné
            Toast.makeText(this, "Veuillez choisir une catégorie", Toast.LENGTH_SHORT).show()
            return
        }
        // - Créer un texte formaté avec toutes les infos
        val contactInfo = """
              Contact ajouté:
             
             Nom: $nom
             Tél: $telephone
             Email: $email_content
             Adresse: $adresse_1, $adresse_2
             Catégorie: $category
             """.trimIndent()
        // - Afficher dans tvContactDisplay
        done_message.text=contactInfo
        // - Afficher un Toast de confirmation
        Toast.makeText(this, "Contact ajouté avec succès !", Toast.LENGTH_LONG).show()
    }

    // 5. CRÉER la fonction reinitialiser()
    private fun reinitialiser() {
        // - Vider tous les EditText
        etFullName.setText("")
        etPhone.setText("")
        etEmail.setText("")
        etAddress1.setText("")
        etAddress2.setText("")
        // - Décocher les RadioButtons
        rgCategory.clearCheck()
        // - Réinitialiser tvContactDisplay
        done_message.text = "Aucun contact ajouté"
        // - Afficher un Toast
        Toast.makeText(this, "Formulaire réinitialisé", Toast.LENGTH_SHORT).show()
    }
}


