###ESPN API

The solution consists of:
- scrapy: open-source crawler developed in Python. It is used to crawl and store espn football data;
- mongodb: nosql lightweight database. It is used to store espn football data;
- espn api: developed using java language, jax-rs and spring-boot;
- docker-compose: spins the whole solution easily.

Requirements: Docker and docker-compose

Instructions:
$ git clone https:// apthletic
$ cd apthletic
$ docker-compose up --build

###API endpoints:
- GET http://localhost:8080/games
- GET http://localhost:8080/games/{id}

PS: Java isn't my expertise so the java image takes quite some time to be built... sorry for that.