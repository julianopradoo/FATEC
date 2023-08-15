import requests

url = "https://pokeapi.co/api/v2/pokemon/ditto"
d= requests.get(url).json()

habilidades = d['abilities']
for x in habilidades:
    print (x['ability']['name'])

    