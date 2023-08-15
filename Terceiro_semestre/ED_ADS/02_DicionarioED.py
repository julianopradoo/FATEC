import requests

url = "https://pokeapi.co/api/v2/ability/battle-armor"
d= requests.get(url).json()

pokemon = d['effect_entries']
for x in pokemon:
    if (x['language']['name']) == "en":
        print (x['short_effect'])

for x in d ['pokemon']:
    print (x['pokemon']['name'])        