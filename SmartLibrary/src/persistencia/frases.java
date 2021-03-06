package persistencia;
public class frases {
	private static String frase;		
	public frases (){
		String frases[]= {"-Cuanto m�s lees, m�s cosas sabr�s. Cuantas m�s cosas aprendas, a m�s lugares viajaras.-Dr. Seuss.",
				"-La capacidad y gusto por la lectura da acceso a lo que ya ha sido descubierto por otros.-Abraham Lincoln.",
				"-Leer es equivalente a pensar con la cabeza de otra persona en lugar de con la propia.-Arthur Schopenhauer.",
				"-Si encontramos a un hombre de extra�o intelecto, deber�amos preguntarle qu� libros lee.-Ralph Waldo Emerson.",
				"-Escribe algo que merezca la pena o lee algo que merezca la pena.-Benjamin Franklin.",
				"-No importa lo ocupado que piensas que estas, debes encontrar tiempo para leer, o entregarte a una ignorancia autoelegida.-Confucio.",
				"-Un libro es un regalo que puedes abrir una y otra vez.-Garrison Keillor.",
				"-La persona que no lee buenos libros no tiene ventaja sobre el que no puede leer.-Mark Twain.",
				"-Leemos para saber que no estamos solos.-William Nicholson.",
				"-La lectura es para la mente lo que el ejercicio es para el cuerpo.-Joseph Addison.",
				"-El que ama la lectura, tiene todo a su alcance.-William Godwin.",
				"-Es lo que lees cuando no tienes que hacerlo, lo que determina lo que ser�s.-Oscar Wilde.",
				"-Hay m�s tesoros en los libros que en todo el bot�n de la Isla del Tesoro.-Walt Disney.",
				"-La lectura de todos los buenos libros es como una conversaci�n con las mejores personas de los siglos pasados.-Ren� Descartes.",
				"-Un gran libro te debe dejar con muchas experiencias, y algo agotado al final. Vives varias vidas al leer.-William Styron.",
				"-La lectura es una forma de arte y toda persona puede ser artista.-Edwin Louis Cole.",
				"-Un libro es el arma m�s efectiva contra la intolerancia e ignorancia.-Lyndon Baines Johnson.",
				"-Si uno no puede disfrutar leyendo un libro una y otra vez, no tiene sentido leerlo.-Oscar Wilde.",
				"-Un lector vive mil vidas antes de morir. El que nunca lee solo vive una.-George R.R. Martin.",
				"-Un hombre se conoce por los libros que lee.-Ralph Waldo Emerson.",
				"-Los libros son los amigos m�s silenciosos y constantes; son los consejeros m�s accesibles y los maestros m�s pacientes.-Charles William Eliot.",
				"-Los libros son espejos: solo ves en ellos lo que tienes en tu interior.-Carlos Ruiz Zaf�n.",
				"-La lectura es una herramienta b�sica para vivir una buena vida.-Joseph Addison.",
				"-No hay disfrute como la lectura.-Jane Austen.",
				"-Encuentro la educaci�n muy educativa. Cada vez que alguien la enciende, voy a otra habitaci�n y leo un libro.-Groucho Marx.",
				"-Una vez que aprendes a leer, ser�s libre para siempre.-Frederick Douglass.",
				"-Algunos libros deber�an ser saboreados, otros devorados, pero solo unos pocos deber�an ser mascados y digeridos.-Francis Bacon.",
				"-Aprender a leer es encender un fuego; cada s�laba pronunciada es una chispa.-V�ctor Hugo.",
				"-Leamos y bailemos; estas dos diversiones no har�n ning�n da�o al mundo.-Voltaire.",
				"-Si no te gusta leer, no has encontrado el libro correcto.-J.K. Rowling.",
				"-Hoy un lector, ma�ana un l�der.-Logan Pearsall Smith.",
				"-Si solo lees los libros que todo el mundo esta leyendo, solo puedes pensar lo que todo el mundo esta pensando.-Haruki Murakami.",
				"-Nunca conf�es en alguien que no haya tra�do un libro consigo.-Lemony Snicket.",
				"-Nunca dos personas leyeron el mismo libro.-Edmund Wilson.",
				"-La lectura nos da un lugar al que ir cuando tenemos que estar donde estamos.-Mason Cooley",
				"-No he conocido ning�n mal que una hora de lectura no alivie.-Charles de Montesquieu",
				"-La lectura tras cierta edad desv�a a la mente demasiado de sus ocupaciones creativas. Cualquier hombre que lee demasiado y usa poco su propio cerebro, cae en h�bitos perezosos de pensamiento.-Albert Einstein.",
				"-Lo �nico importante en un libro es el significado que tiene para ti.-W. Somerset Maugham.",
				"-Un buen libro no tiene final.-R.D. Cumming.",
				"-Piensa antes de hablar. Lee antes de pensar.-Fran Lebowitz.",
				"-No tienes que quemar libros para destruir una cultura. Simplemente consigue que la gente los queme.-Ray Bradbury.",
				"-Los libros que te ayudan m�s son los que te hacen pensar m�s. La forma m�s dura de aprender es con la lectura, pero un gran libro de un gran pensador, es un barco de pensamientos, profundamente cargado verdad y belleza.-Pablo Neruda.",
				"-Los libros son el avi�n, el tren, el camino. Son el destino y el viaje. Son el hogar.-Anna Quindlen.",
				"-Sin l�grimas en el escritor, no hay l�grimas en el lector. Sin sorpresa en el escritor, no hay sorpresa en el lector.-Robert Frost.",
				"-Es bueno leer todo del algo y algo de todo.-Lord Henry P. Brougham.",
				"-Eres el mismo ahora que dentro de cinco a�os, excepto por las personas que has conocido y los libros que has le�do.-Charlie Jones.",
				"-Lee para vivir.-Gustave Flaubert.",
				"-Un libro es un sue�o que tienes en tu mano.-Neil Gaiman.",
				"-Mu�strame una familia de lectores y te mostrar� la gente que mueve el mundo.-Napole�n Bonaparte.",
				"-No deber�amos ense�ar los grandes libros, deber�amos ense�ar el amor por la lectura.-B. F. Skinner.",
				"-Muchas personas se sienten mejor con la mera vista de un libro.-Jane Smiley.",
				"-Piensas que tu dolor es imprecedente en la historia del mundo, pero luego lees. Son los libros los que me ense�aron que las cosas que me atormentaban eran las que me conectaban con la gente viva o que hab�a estado viva.-James Baldwin.",
				"-Las ideas transformadoras de la vida siempre me han llegado a trav�s de los libros.-Bell Hooks.",
				"-Los libros son magia �nica port�til.-Stephen King.",
				"-Un libro es un dispositivo para encender la imaginaci�n.-Alan Bennett.",
				"-No todos los lectores son l�deres, pero todos los l�deres son lectores.-Harry S. Truman.",
				"-Dame un hombre o mujer que ha le�do mil libros y me das una compa��a interesante. Dame un hombre o mujer que quiz�s ha le�do tres libros y me das una compa��a peligrosa.-Anne Rice.",
				"-Hay mucho m�s en un libro que solo su lectura.-Maurice Sendak.",
				"-Los libros que el mundo llama inmorales son libros que muestran al mundo sus propias verg�enzas.-Oscar Wilde.",
				"-No leas como hacen los ni�os, para divertirte, o como los ambiciosos, para instruirte. No, lee para vivir.-Gustave Flaubert.",
				"-La lectura proporciona a la mente materiales de conocimiento; es el pensamiento lo que hace nuestro lo que leemos.-John Locke.",
				"-La educaci�n comienza un buen caballero, pero la lectura, la buena compa��a y la reflexi�n deben terminarlo.-John Locke.",
				"-Un hombre solo aprende de dos maneras, una leyendo, y otra por asociaci�n con gente m�s inteligente.-Will Rogers.",
				"-Los grandes libros te ayudan a entender y te ayudan a sentirte entendido.-John Green.",
				"-Dormir esta bien y los libros son mejor.-George R.R. Martin.",
				"-Hay peores cr�menes que quemar libros. Uno de ellos es no leerlos.-Joseph Brodsky.",
				"-Las cosas que quieres saber est�n en los libros; mi mejor amigo es el que me consigue un libro que no he le�do.-Abraham Lincoln.",
				"-La lectura no es m�s que una conversaci�n silenciosa.-Walter Savage Landor.",
				"-No hay sustituto para los libros en la vida de un ni�o.-May Ellen Chase.",
				"-Le� un libro en una ocasi�n y toda mi vida cambi�.-Orhan Pamuk.",
				"-Vivimos para los libros.-Umberto Eco.",
				"-El mayor don es una pasi�n por la lectura.-Elizabeth Hardwick.",
				"-Un cl�sico es un libro que nunca ha terminado de decir lo que tiene que decir.-Italo Calvino.",
				"-Nunca leas un libro entero por el mero hecho de haberlo comenzado.-John Witherspoon.",
				"-En un buen libro, lo mejor esta entre l�neas.-Proverbio suizo.",
				"-Si me quieres contar el coraz�n de un hombre, no me digas lo que lee, sino lo que relee.-Fran�ois Mauriac.",
				"-Lee primero los mejores libros o puede que no tengas oportunidad de leerlos.-Henry David Thoreau.",
				"-Elige un autor como eliges a un amigo.-Christopher Wren.",
				"-Los mejores libros son aquellos que te cuentan lo que ya sabes.-George Orwell.",
				"-El h�bito de la lectura es el �nico disfrute que perdura cuando no hay otros placeres.-Anthony Trollope.",
				"-La lectura es una conversaci�n. Todos los libros hablan. Pero un buen libro tambi�n escucha.-Mark Haddon.",
				"-Hay un arte de la lectura, al igual que un arte del pensar y un arte de la escritura.-Isaac D�Israeli.",
				"-Algunos libros nos dejan libres y otros nos hacen libres.-Ralph Waldo Emerson.",
				"-La lectura y la escritura, como todo, mejoran con la pr�ctica.-Margaret Atwood.",
				"-Un libro es como un jard�n cargado en el bolsillo.-Proverbio chino.",
				"-La lectura es un ticket de descuento a todas partes.-Mary Schmich.",
				"-La lectura te dar� placer duradero.-Laura Bush.",
				"-La lectura te puede dar m�s satisfacci�n que cualquier otra cosa.-Bill Blass.",
				"-Hay muchas maneras de agrandar el mundo de tus hijos. El amor por los libros es la mejor de todas.-Jacqueline Kennedy.",
				"-Pienso en la vida como un buen libro. Cuanto m�s lejos llegas, m�s comienza a tener sentido.-Harold Kushner.",
				"-El hombre que no lee nada esta mejor educado que el que no lee nada excepto peri�dicos.-Thomas Jefferson.",
				"-Nunca dejes para ma�ana el libro que puedes leer hoy.-Holbrook Jackson.",
				"-Lee un libro y vive una vida, mira la televisi�n y pierde un d�a.",
				"-Leer un libro es aprovechar toda la experiencia que el escritor ha tenido.",
				"-Si no quieres cometer todos los errores de un escritor, lee sus libros.",
				"-La historia de la humanidad, su experiencia y todos sus conocimientos, esta grabado en los libros. Aprov�chalos y cada d�a ser�s un poco m�s humano.",
				"-Cuando se encuentran dos personas que han le�do m�s de 100 libros es como si se encontrasen dos personas que han vivido m�s de 100 vidas.",
				"-No todos los que leen son inteligentes pero todos los inteligentes leen libros.-Lifeder.com.",
				"-Un cl�sico es un libro que la gente adora y no lee.-Mark Twain.",
				"-Cuando lees un buen libro, en alg�n lugar del mundo una puerta se abre para permitir entrar m�s luz.-Vera Nazarian.",
				"-Nunca leer�a un libro si fuera posible hablar media hora con el hombre que lo escribi�.-Woodrow Wilson.",
				"-Siempre lee algo que te har� ver bien si mueres en medio de la lectura.-P.J. O�Rourke.",
				"-Los libros que no lees, no te ayudan.-Jim Rohn.",
				"-Una buena novela te dice la verdad sobre su h�roe. Una mala novela te dice la verdad sobre su autor.-Gilbert K. Chesterton.",
				"-Un libro es una versi�n del mundo. Si no te gusta, ign�ralo, u ofrece tu propia versi�n a cambio.-Salman Rushdie.",
				"-Sigue leyendo libros. Pero recuerda que un libro es solo un libro, y que deber�s aprender a pensar por ti mismo.-Maxim Gorky.",
				"-Haz que sea una regla el hecho de nunca darle a un ni�o un libro que jam�s leer�as t� mismo.-George Bernard Shaw.",
				"-Los libros sirven para mostrarle a un hombre que sus pensamientos originales no son tan nuevos despu�s de todo.-Abraham Lincoln.",
				"-Aquello que no sabes har�a un gran libro.-Sydney Smith.",
				"-Sabes que has le�do un buen libro cuando volteas la �ltima p�gina y sientes como si hubieses perdido un amigo.-Paul Sweeney.",
				"-Un libro es como un espejo. Si un tonto se mira en �l, no puedes esperar que un genio mire de vuelta.-J. K. Rollins.",
				};
		
		this.frase=frases[(int) (Math.random()*(110))];
	}
	
	public static String getFrase() {
		return frase;
	}
}
