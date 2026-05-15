
 ReceiverDemo

Description
Cette application Android démontre l’utilisation des BroadcastReceiver en Java.

L’application utilise :
- Receiver Dynamique
- Receiver Statique
- Broadcast Custom
- Notifications Toast

--------------------------------------------------

Objectifs du projet
- Comprendre les BroadcastReceiver
- Utiliser les receivers dynamiques
- Utiliser les receivers statiques
- Manipuler les IntentFilter
- Envoyer et recevoir des broadcasts

--------------------------------------------------

Technologies utilisées
- Java
- Android Studio
- BroadcastReceiver
- Intent
- IntentFilter
- Toast

--------------------------------------------------

Structure du projet

ReceiverDemo
│
├── MainActivity.java
├── AirplaneModeReceiver.java
├── BootReceiver.java
├── CustomEventReceiver.java
├── activity_main.xml
└── AndroidManifest.xml

--------------------------------------------------

Fonctionnalités
- Détection du mode avion
- Réception du BOOT_COMPLETED
- Envoi d’un broadcast personnalisé
- Réception d’un custom broadcast

--------------------------------------------------

Résultat
- Le receiver dynamique détecte le mode avion
- Le receiver statique détecte le démarrage du téléphone
- Les broadcasts custom fonctionnent correctement

--------------------------------------------------

Conclusion
Ce projet permet de comprendre :
- les BroadcastReceiver Android
- les broadcasts système
- les broadcasts personnalisés
- la différence entre receiver statique et dynamique
- le cycle de vie onReceive()

Ce mécanisme est utilisé dans :
- WiFi
- Batterie
- SMS
- Bluetooth
- Notifications système



https://github.com/user-attachments/assets/892e998b-2c94-4e30-8920-7cde7962c401

