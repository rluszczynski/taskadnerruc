DOKUMENTACJA SWAGGER

http://localhost:8080/swagger-ui/index.html 

ZADANIE

Utwórz aplikację posiadającą następujące funkcjonalności (rest api):
1. Dla zadnego zakresu dat (według dateOfEntry) i caseType zwraca liczbę spraw pogrupowaną według caseState
2. Dla zadanego caseState zwraca adresy aktywnych stron

Technologie:
Java przy wykorzystaniu frameworka Spring, poza tym dowolność.

Do wygenerowania danych użyj: https://json-generator.com/

Rozwiązanie może być przekazane na jakimś publicznym serwisie git'a lub w formie spakowanego archiwum

CaseEntity
[
'{{repeat(10)}}',
{
caseId: '{{index(1)}}',
caseNumber: '{{integer(1, 9999)}}/{{integer(21, 22)}}',
caseType: '{{random("C","Co","K","W","P")}}',
caseState: '{{random("OPEN","CLOSED","DISMISSED")}}',
dateOfEntry: '{{date(new Date(2021, 0, 1), new Date(), "YYYY-MM-dd")}}'
}
]

PartyEntity
[
'{{repeat(20)}}',
{
caseId: '{{integer(1, 10)}}',
partyType: '{{random("PLAINTIFF","DEFENDANT")}}',
name: '{{firstName()}} {{surname()}}',
active: '{{bool()}}',
addresses: [
'{{repeat(1,3)}}',
{
id: '{{index(1)}}',
city: '{{random("Gdańsk","Kraków","Gdynia","Sopot","Malbork","Kwidzyn")}}',
postalCode: '{{integer(10,99)}}-{{integer(100,999)}}',
street: '{{street()}}'
}
]
}
]