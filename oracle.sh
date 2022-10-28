docker volume create oracle-volume
docker run -d --name oracle -p 1521:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe
docker container logs -f sad_panini