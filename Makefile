.PHONY: test

test:
	docker-compose run app lein test

app-build:
	docker-compose build

app-bash:
	docker-compose run app bash
