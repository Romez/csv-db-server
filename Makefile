.PHONY: test

test-server:
	docker-compose run app lein test

build-server:
	docker-compose run app bash -c "lein compile && lein install"

build-client:
	docker-compose run client bash -c "mvn -q compile"

server-run:
	docker-compose run app lein run

server-bash:
	docker-compose run app bash

client-bash:
	docker-compose run client bash
