# XML-XSD-JAVA
Esercizio 32 
Problema Il percorso di volo di un drone viene memorizzato in un documento in formato XML come il seguente dove sono memorizzate le coordinate geografiche e l'altitudine associate a istanti temporali successivi: 
<percorso>
  <posizione>
    <latitudine> 43.55</1atitudine>
    <longitudine>10.3167</1ongitudine>
    <altitudine>100.9</altitudine>
    <dataOra>2022-10-21T17: 29:59</dataOra>
  </posizione>
  <posizione>
    <latitudine> 43.65</1atitudine>
    <longitudine> 10.3333</longitudine>
    <altitudine> 99.1</altitudine>
    <dataOra>2022-10-21T17:39:47</dataOra>
  </posizione>
  <posizione>
    <latitudine> 43 .70</latitudine>
    <longitudine>10.37</longitudine>
    <altitudine>101.2</altitudine>
    <dataOra> 2022-10-21T17: 49:07</dataOra>
  </posizione>
  <posizione>
    <latitudine 43.7167</latitudine>
    <longitudine> 10.4</1ongitudine>
    <altitudine> 98.9</altitudine>
    dataOra>2022-10-21T17:59:09</dataOra>
  </posizione>
  </percorso>
  Dopo aver definito una classe Java Posizione che permette di rappresentare un elemento posizione del documento XML, codificare una classe in linguaggio Java i cui metodi consentano di: inserire in un array (o un ArrayList) le successive posizioni del drone riportate in un file il cui contenuto è un documento XML con il formato illustrato determinare la latitudine e la longitudine massime e minime del percorso effettuato dal drone.  Svolgimento Per la realizzazione di questa esercitazione abbiamo creato un progetto nel quale si possono trovare 2 classi, una denominata posizione (contenente gli attributi) ed una percorso (contenente una listi che si riferisce a posizione. Questa classe contiene inoltre un metodo che apre il .xml e acquisisce i vari tag, li inserisce nella lista e li stampa). 
  
