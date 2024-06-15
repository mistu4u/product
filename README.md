**Local testing:**

To test only with the db, we have the `compose.yaml` file present in the class path.
Simply run `./gradlew bootRun` which would use the `default` profile to use the compose file for the database automatically.

**DEV**

Use the following command to run the dev profile with gradle.
```
./gradlew bootRun --args='--spring.profiles.active=dev'
```

To run the locally created jar, use the following command to run the dev profile.

```java -Dspring.profiles.active=dev -jar product-0.0.1-SNAPSHOT.jar```

**PREPARE FOR RUNNING IN DOCKER**

Run to prepare the jar file.

_NOTE_ : Pls replace `host.docker.internal` with `localhost` in the `application.properties` files whenever need to test the setup locally i.e. outside the docker components.

**Kubernetes Setup**

Added the `deployment.yaml` for deploying the pods in kubernetes.

_Useful commands_

To deploy the deployment

```kubectl apply -f deployment.yaml```

To expose the deployment using a service:

```kubectl expose deployment product --name=product-service --port=8080 --target-port=8080 --type=NodePort```

Or, you can use the `service.yaml` file.

To get an external ip for minikube,

```minikube service product-service```

Alternatively,

```kubectl port-forward service/product-service 7080:8080```

which makes it available on ```localhost:7080```