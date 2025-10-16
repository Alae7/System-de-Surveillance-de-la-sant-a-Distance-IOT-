# ❤️ Système de Surveillance de la Santé à Distance (IoT)

**Système de Surveillance de la Santé à Distance (IoT)** — aussi appelé *HeartSense* — est une plateforme IoT complète qui permet la collecte, le stockage et la surveillance en temps réel des données médicales (ex. fréquence cardiaque, SPO₂, température) depuis des dispositifs wearable.  
L'objectif est de fournir des alertes précoces, un tableau de bord pour les médecins et patients, et un historique accessible pour le suivi clinique.

---

## 🚀 Fonctionnalités principales

### 📡 Connexion des dispositifs IoT
- Collecte de données en temps réel depuis des capteurs (Bluetooth / Wi-Fi / GSM) via des gateways.  
- Utilisation de protocoles IoT standards (MQTT / HTTP) pour la transmission des mesures.

### ⚠️ Alertes et notifications
- Détection d’anomalies (seuils configurables) et envoi d’alertes instantanées (email, SMS, notifications push).  
- Système d’alerte configurable par patient et par type d’anomalie.

### 📊 Visualisation & Tableau de bord
- Tableau de bord pour médecins et patients : affichage des courbes temporelles, indicateurs clés et historique.  
- Filtres temporels (heure, jour, semaine, mois) et export CSV des données.

### 🗄️ Stockage & Historique
- Base de données temporelle pour conserver l’historique des mesures.  
- API REST pour récupérer, filtrer et analyser les données patient.

### 🔐 Sécurité & Confidentialité
- Authentification et autorisation (JWT + rôles : Admin, Médecin, Patient).  
- Chiffrement des données en transit (HTTPS / TLS) et bonnes pratiques de gestion des données sensibles (anonymisation/pseudonymisation si nécessaire).

### 🧠 Optionnel : Analyse & IA
- Détection automatique d’irrégularités (algorithmes simple / modèles ML).  
- Génération de rapports et recommandations basées sur les tendances des données.

---

## 🧱 Architecture technique (exemple)

- **Dispositifs** : Wearables qui envoient des mesures via MQTT / HTTP.  
- **Broker IoT** : Mosquitto / EMQX pour gérer les topics et la communication temps réel.  
- **Backend** : Spring Boot — ingestion MQTT (ou via un service gateway), API REST, logique métier, règles d’alerte.  
- **Base de données** : PostgreSQL (ou InfluxDB / TimescaleDB pour séries temporelles).  
- **Frontend** : Angular — dashboard, pages patients, gestion des alertes.  
- **Notifications** : Intégration avec services externes (Twilio, SendGrid, Firebase Cloud Messaging).  
- **Stockage images / documents** : Cloudinary / S3 (optionnel).  
- **Orchestration / Déploiement** : Docker / Kubernetes (Helm) pour scalabilité.

---

## 🔧 Technologies suggérées

| Composant | Technologie |
|-----------|-------------|
| Ingestion IoT | MQTT (Mosquitto / EMQX) |
| Backend | Spring Boot, Spring Data JPA, Spring Security |
| Base de données | PostgreSQL / TimescaleDB / InfluxDB |
| Frontend | Angular, TypeScript, HTML/CSS |
| Notifications | Twilio, SendGrid, Firebase |
| Stockage média | Cloudinary ou AWS S3 |
| Conteneurisation | Docker, Kubernetes |

---

## 🔐 Sécurité (recommandations)
- Utiliser **TLS** pour MQTT et HTTPS pour les API.  
- Authentification forte pour les comptes médicaux (2FA recommandé).  
- Stocker les mots de passe avec un algorithme de hachage sécurisé (BCrypt).  
- Respecter les réglementations locales sur les données de santé (ex. RGPD, HIPAA selon le pays).

---

## 🧩 Prérequis (suggestion)
- Java 17+ et Maven  
- Node.js (v18+) et Angular CLI  
- Broker MQTT (Mosquitto / EMQX)  
- PostgreSQL (ou TimescaleDB/InfluxDB)  
- Compte pour services de notification (facultatif)  
- Compte Cloud pour stockage média (facultatif)

---

## 💡 Améliorations futures possibles
- Intégration avec dossiers médicaux électroniques (EMR / EHR).  
- Modèles ML avancés pour prédiction d’événements cardiaques.  
- Téléconsultation intégrée (vidéo + partage de données en temps réel).  
- Fonctionnalités offline sur device/gateway pour tolérance réseau.

---

## 👤 Auteur(s)
- **Alae Din**  
- **Aimane Mohcine**

---

## 📄 Licence

Ce projet est distribué sous la **Licence BSD 3-Clause**.

