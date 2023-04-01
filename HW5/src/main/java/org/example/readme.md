Clasa AddCommand - Această clasă este responsabilă pentru implementarea comenzii "adaugă document" în cadrul catalogului. Are un constructor care primește un catalog și 4 parametri: id, nume, locație și etichete pentru un document nou. Are o metodă execute() care adaugă documentul nou creat în catalog.

Clasa Catalog - Această clasă reprezintă catalogul de documente și este formată dintr-o listă de obiecte de tip Document. Aceasta are două metode publice: addDocument() care adaugă un document în catalog și getDocuments() care returnează lista de documente.

Clasa CatalogManager - Această clasă este responsabilă pentru gestionarea catalogului. Are un constructor care primește un catalog și o metodă run() care citește comenzile de la tastatură și le execută.

Clasa Command - Această clasă este o interfață care este implementată de toate comenzile din program. Are o singură metodă publică execute() care este implementată de fiecare comandă în parte.

Clasa CommandNotFoundException - Această clasă este o excepție personalizată care este aruncată atunci când o comandă invalidă este introdusă.

Clasa Document - Această clasă reprezintă un document și este formată dintr-un ID, un nume, o locație și o hartă de etichete. Aceasta are un constructor implicit și un constructor care primește un ID, un nume, o locație și un set de etichete. Are, de asemenea, metode pentru setarea și returnarea valorilor ID-ului, numele și locației, precum și o metodă addTag() pentru adăugarea unei noi etichete.

Clasa InvalidDataException - Această clasă este o excepție personalizată care este aruncată atunci când datele introduse pentru crearea unui document sunt invalide.

Clasa ListCommand - Această clasă este responsabilă pentru implementarea comenzii "afișează documente" în cadrul catalogului. Are un constructor care primește un catalog și o metodă execute() care afișează toate documentele din catalog.

Clasa LoadCommand - Această clasă este responsabilă pentru implementarea comenzii "încarcă catalog" în cadrul catalogului. Are un constructor care primește un catalog și numele fișierului pentru încărcarea catalogului. Are o metodă execute() care încarcă catalogul din fișierul dat.

Clasa Main - Această clasă conține metoda principală main() care creează un nou catalog și un manager de catalog și rulează aplicația.

Clasa ReportCommand - Această clasă este responsabilă pentru generarea unui raport HTML pentru catalogul de documente. Are un constructor care primește un catalog și o configurație pentru FreeMarker