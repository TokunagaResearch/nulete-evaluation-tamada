javaFileName = HelloWorld.java

start:
	cp .resource/HelloWorld.json ./
	python3 ../../.script/start.py $(javaFileName)

check:
	python3 ../../.script/check.py $(javaFileName)

reset:
	rm HelloWorld.json $(javaFileName) testcase.txt .result/*
