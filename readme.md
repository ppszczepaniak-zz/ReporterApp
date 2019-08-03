## Zadanie Reporter


###Reporter

Celem zadania jest stworzenie aplikacji symulującej pracę reportera. Reporter pracuje dla różnych portali internetowych i wysyła do wszystkich z nich świeże newsy. Ten rynek jest bardzo konkurencyjny - różne typy portali publikują otrzymane newsy na swój sposób i zbierają za to punkty.



Portale otrzymują punkty odpowiednio za:


* VowelWebsite - 1 punkt za samogłoskę.

*   ConsonantWebsite - 1 punkt za spółgłoskę.

*   CustomWebsite - 1 punkt za literę z zakresu a-k (zarówno wielką, jak i małą).

***


Wszystkie typy portali cechuje ich suma punktów oraz nazwa. Kiedy portal otrzyma jakąś wiadomość, powinien wyświetlić jej treść, a wszystkie punktowane dla niego litery powinny być kapitalizowane.

Klasa Reporter ma posiadać funkcjonalność broadcastMessage(String msg) , która przesyła wiadomość do wszystkich portali, dla których dany reporter pracuje. W klasie Main należy stworzyć obiekt reportera, który współpracuje z różnymi typami portali i wywołać dla niego metodę broadcastMessage .

Przykładowo, wartość zdania ”Cows lose their jobs as milk prices drop” dla typów portali wymienionych powyżej to odpowiednio: 11, 29 i 14. Przykładowy output:


(Vowel news, 11) informs: cOws lOsE thEIr jObs As mIlk prIcEs drOp

(The Consonants, 29) informs: CoWS LoSe THeiR JoBS aS MiLK PRiCeS DRoP

(Custom Feed, 14) informs: Cows losE tHEIr JoBs As mIlK prICEs Drop



Napisz testy jednostkowe sprawdzające poprawność działania poszczególnych portali poprzez sprawdzenie zwracanego przez metodę wyniku.



###Uwagi

1. Należy zadbać o podstawowe zasady programowania obiektowego - enkapsulację, gettery, settery, odpowiednią dostępność zmiennych...

2. Wskazówka: użyj jednego z wzorców czynnościowych (behavioral patterns).
* https://czub.info/2015/wzorzec-observer-obserwator/
