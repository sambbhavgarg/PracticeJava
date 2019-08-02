ACO is a genetic algorithm inspired by an ant’s natural behavior. To fully understand the ACO algorithm, we need to get familiar with its basic concepts:

ants use pheromones to find the shortest path between home and food source
pheromones evaporate quickly
ants prefer to use shorter paths with denser pheromone
Let’s show a simple example of ACO used in the Traveling Salesman Problem. In the following case, we need to find the shortest path between all nodes in the graph:

Parameter c indicates the original number of trails, at the start of the simulation. Furthermore, alpha controls the pheromone importance, while beta controls the distance priority. In general, the beta parameter should be greater than alpha for the best results.

Next, the evaporation variable shows the percent how much the pheromone is evaporating in every iteration, whereas Q provides information about the total amount of pheromone left on the trail by each Ant, and antFactor tells us how many ants we’ll use per city.

Finally, we need to have a little bit of randomness in our simulations, and this is covered by randomFactor.

