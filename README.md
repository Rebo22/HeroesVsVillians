# HeroesVsVillians
Proyecto de escuela de heroes contra villanos en java con patron de diseño Strategy. Las reglas son las siguientes:
Descripción
Para este examen tienen que escribir un simulador del juego Héroes VS Villanos de acuerdo a las siguientes reglas:
Héroes:
King – Es el Rey de los Héroes y representa la bondad y las buenas virtudes, el no puede matar a ningún villano, pero nadie lo puede matar a él, excepto Lilith.
Queen – Es la Reyna y puede matar a todos los villanos con cualquier arma, excepto a Lilith que únicamente la puede matar si ella tiene a sword y Lilith un arma diferente.
Bishop – Representante divino con poderes celestiales que le permiten matar a Troll y a Ghoul, en caso que el Ghoul tenga arco y flecha, el Ghoul mata a Bishop.
Knight – Es el caballero y puede matar a Ghoul con cualquier arma y a Troll solo si tiene el hacha.
 Villanos:
Lilith – Es el inicio de todas las cosas y puede matar a todos los Héroes con cualquier arma, incluyendo al Rey, excepto a la Reina a quien solo puede vencer si ella tiene la espada y la reina otra arma diferente. En caso de que tanto la Reina como Lilith tengan la espada, no se pueden dañar.
Wizard -  Es el brujo y con sus poderes de las tinieblas puede matar a Bishop y Knight.
Troll – Es el Troll y puede matar a Knight, excepto cuando Knight tiene el hacha.
Ghoul – Es el Ghoul y solo puede matar a Bishop si el Ghoul tiene el arco y flecha.
Las armas disponibles son 
Knife -  El cuchillo.
Axe – El hacha.
Arrow & Bow - Arco y Flecha.
Sword – La espada.
El juego debe preguntar cuantas peleas se van a tener.  [Mínimo 1 pelea y máximo 8 peleas.]
El juego se inicializa indicando de manera aleatoria el arma que tendrá cada personaje y seleccionando de manera aleatoria quién debe pelear contra quien.  Si las condiciones de la pelea no están indicadas arriba es porque no se pueden hacer daño y los dos personajes pasan a la siguiente pelea hasta alcanzar el número máximo de peleas indicadas. Si un personaje mata a otro, el que muere ya está muerto y no puede seguir peleando.  Si matan al rey ganan los Villanos, si matan a Lilith ganan los Héroes, si al final del número de peleas indicado el Rey esta vivo, ganan los Héroes. El Juego debe indicar quien gana, así como cada una de las armas y peleas que se llevan a cabo, mostrando quién se enfrenta a quien y con qué armas.
