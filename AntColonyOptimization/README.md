ACO is a genetic algorithm inspired by an ant’s natural behavior. To fully understand the ACO algorithm, we need to get familiar with its basic concepts:

ants use pheromones to find the shortest path between home and food source
pheromones evaporate quickly
ants prefer to use shorter paths with denser pheromone

- c: original number of trails, at the start of the simulation
- alpha: controls the pheromone importance
- beta: controls the distance priority; beta>alpha for better results
- evaporation: percent how much the pheromone is evaporating in every iteration
- Q: information about the total amount of pheromone left on the trail by each Ant
- antFactor: no. of ants used per city
- randomFactor: 

- maxIterations = 1000
- 'numberOfCities' is an integer
- 'numberOfAnts' is an integer
- 'graph' is a matrix (double)
- 'trails' is a matrix (double)
- 'ants' is a reference to an object of ArrayList class, of type List<Ant> Interface 
- 'random' is a reference to an object of the Random class in Java
- 'probabilities' is a array (double)

## Ant.java

- visitCity(int currentIndex, int city): ability to visit a specific city
- visited(int i): remember visited cities
- trailLength(double graph[][]): keep track of the trail length

## AntColonyOptimization.java

- AntColonyOptimization(int noOfCities)
  - Creates a random matrix(graph) of the dim. no.OfCities x no.OfCities.
  - numberOfCities is set
  - number of ants is set and typecasted to integer type
  - trails is set to a similar matrix to that of 'graph'
  - probabilities is set to an array of double type with size equal to number of     cities.
  - 
  
