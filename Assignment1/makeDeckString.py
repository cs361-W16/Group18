

suites = ["s","h","c","d"]

"""
for s in suites:
	for i in range(1,14):
		print ( "deck.add(" + '"'+ str(i)+s + '"' + ")" +";" ),
"""

for s in suites:
	for i in range(1,14):
		print ( '"'+ str(i)+s + '"' + ',' ), 
