Ovaj zadatak rađen je u Java programskom jeziku. Razlog zašto sam izabrao Javu je zato što mi najbolje leži i trenutno je radim na fakultetu.
Nakon mnogo istraživanja na internetu došao sam do rješenja koje se najbolje može predstaviti programskim kodom.
Na web stranici towardsdatascience.com sam našao sledeću formulu: 
result = (yp - y1) * (x2 -x1) - (xp - x1) * (y2 - y1)
Zamislimo da imamo mnogougao, i da su u njemu duži koje povezuju tačke zapravo putanje iz tačke jedan u tačku dva, pa iz tačke dva u tačku tri, i tako do tačke n - 1 i tačke n, 
i na kraju iz tačke n u tačku 1. Tu uzmemo referentni smijer, da idemo u desnu ili u lijevu stranu. Gornja jednačina vraća tri moguće vrijednosti, 0, negativan broj ili pozitivan broj.
Ako je negativan broj, tačka (xp, yp) se nalazi sa desne strane prave koju čine tačke (x1, y1) i (x2, y2), ako je pozitivan nalaze se sa lijeve strane prave, a ako je nula onda se tačka nalazi
na pravoj.
Moje prvobitno rješenje je bilo neuspješno, pošto sam pokušao sortirati nasumične tačke u mnogougao, i to rješenje nije radilo u slučajevima kada mnogougao ima tačku sa najmanjom X koordinatom, 
a najvećom Y koordinatom. Uzimao sam najmanji X, najveći X, gornju i donju listu tačaka i sortirao, ali neuspješno.
Sledeće rješenje je bilo pomoću jednačine napisane gore. U početku se činilo da ide kako treba, ali i to se pokazalo neuspješno. Razlog za to je sledeći, ako uzmemo samo 3 tačke da provjeravamo,
i odredimo da želimo neki referentni smijer, na primjer desni, zavisićemo od redoslijeda unosa tačaka. Iz toga problema izrodilo se finalno rješenje, ili treća sreća.
Uzimamo dvije tačke mnogougla, koje formiraju pravu, i uzimamo dvije naredne tačke i gledamo da li se nalaze sa iste strane prave, nebitno da li je lijeva ili desna strana. U rješenju se to vidi
kada proizvod njihovih jednačina formira pozitivan broj, jer onda ili su obje sa desne strane(oba proizvoda negativna) ili su oba proizvoda sa lijeve(pozitivna oba). Nakon toga kada provjeri
da li je mnogougao konveksan, proslijeđuje se tačka za porovjeru. Algoritam je isti, samo sa jednom tačkom umjesto dvije. Nisam uzimao za prihvatljiv slučaj da se tačka nalazi na ivici mnogougla,
 ali to se može promjeniti dodavanjem znaka = u uslov provjere. Bitno je napomenuti da algoritam kod provjere konveksnosti sa 4 tačke nije u jednoj iteraciji, nego se morao ručno da podesi da 
u određenoj iteraciji gleda određene slučajeve, kao što je na primjer slučaj kada se provjerava prava koju prave poslednja i prva tačka. Do nje se nije moglo doći klasičnim brojačem nego se moralo
hardkodovati da baš gleda tu kombinaciju.
Unos je preko terminala, korisnik prvo unese broj tjemena, ako je manji od 3 ne može nastaviti dok ne unese odgovarajući broj tjemena, posle toga korisniku se kaže da unese različita tjemena, posle 
unosa tjemena unosi tačku koju provjerava, i program vrati da li se tačka nalazi ili ne nalazi unutar mnogougla.