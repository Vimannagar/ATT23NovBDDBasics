echo "-----------------------------------------------------------------------------"
echo "Starting the initialization"
echo "-----------------------------------------------------------------------------"

echo "Checking if selenium hub is ready.......!"
count=0
while [ "$( curl -s http://192.168.1.7:4444/status | jq -r .value.ready )" != "true" ]
do
  count=$((count+1))
  echo "Attempt: ${count}"
  if [ "$count" -ge 60 ]
  then
      echo "***** HUB is not ready even after 60 tries hence exiting ****"
      exit 1
  fi
  sleep 1
done

echo "Selenium grid is up and running. Running the test ........"

mvn -f /home/seleniumbddcucumbertestframework/pom.xml test -DcliBrowser=${browser}
