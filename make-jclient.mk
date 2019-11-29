jclient-build:
	docker-compose run jclient bash -c "mvn -q compile"

jclient-bash:
	docker-compose run jclient bash
