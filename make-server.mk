.PHONY: test

server-test:
	docker-compose run server lein test

server-run:
	docker-compose run -p 9997:9997 server lein run

server-bash:
	docker-compose run server bash

server-build:
	docker-compose run server bash -c "lein compile && lein install"

