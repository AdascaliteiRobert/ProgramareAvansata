ControlPanel
Această clasă implementează panoul de control al aplicației. În acest panou, utilizatorul poate selecta forma pe care dorește să o deseneze și culoarea acesteia. De asemenea, utilizatorul poate șterge sau salva desenul actual.

MainFrame
Această clasă implementează fereastra principală a aplicației. Această fereastră conține toate celelalte componente ale aplicației, cum ar fi panoul de control, panoul de configurare și panoul de desen.

ConfigPanel
Această clasă implementează panoul de configurare al aplicației. În acest panou, utilizatorul poate selecta dimensiunea și forma peniței, precum și culoarea fundalului de desenare.

Drawing panel
Constructorul clasei DrawingPanel primește un obiect de tip MainFrame, acesta fiind necesar pentru a putea accesa metodele din clasa principală, precum și pentru a-i putea transmite evenimentele.

Clasa DrawingPanel are câteva variabile de instanță, cum ar fi shapes și selectedShape, care sunt utilizate pentru a stoca formele geometrice create de utilizator și forma selectată în prezent, respectiv. Această clasă implementează și o interfață de tip MouseListener, astfel încât să poată răspunde la evenimentele de clic ale mouse-ului.

Metoda paintComponent(Graphics g) este responsabilă pentru afișarea formelor geometrice. Aceasta parcurge lista de forme geometrice și le desenează pe ecran, apoi desenează forma selectată cu o culoare diferită. Dacă utilizatorul a selectat opțiunea "eraser", atunci metoda va desena peste formele existente cu o culoare albă.

Metoda addShape(Shape shape) este folosită pentru a adăuga o formă geometrică nouă la lista de forme geometrice. Aceasta este apelată din clasa ControlPanel atunci când utilizatorul selectează o formă nouă din listă și face clic pe butonul "Add Shape".

Metoda removeShape(Shape shape) este folosită pentru a elimina o formă geometrică din lista de forme geometrice. Aceasta este apelată din clasa ControlPanel atunci când utilizatorul face clic pe butonul "Remove Shape".

Metoda clearShapes() este folosită pentru a șterge toate formele geometrice din lista de forme geometrice. Aceasta este apelată din clasa ControlPanel atunci când utilizatorul face clic pe butonul "Clear All".

Metoda getSelectedShape() este folosită pentru a returna forma geometrică selectată în prezent de utilizator.

Metoda setSelectedShape(Shape shape) este folosită pentru a seta forma geometrică selectată de utilizator. Aceasta este apelată din clasa MouseAdapter atunci când utilizatorul face clic pe o formă geometrică.
Main
Această clasă reprezintă punctul de intrare în aplicație. În metoda main a acestei clase, se creează o instanță a clasei MainFrame, ceea ce duce la afișarea ferestrei principale a aplicației.