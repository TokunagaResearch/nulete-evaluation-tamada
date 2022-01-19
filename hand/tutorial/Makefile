javaFileName = HelloWorld.java

start:
	cp .resource/HelloWorldTest.java ./
	python3 ../../.script/start.py $(javaFileName)

check:
	python3 ../../.script/check.py $(javaFileName)

reset:
	rm HelloWorldTest.java $(javaFileName) testcase.txt .result/*
