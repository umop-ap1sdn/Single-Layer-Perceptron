# Java Single Layer Perceptron
A single layer perceptron is the most basic Neural Network Structure, consisting only of inputs and outputs (no hidden layers), capable of learning only very basic concepts. 
In this project I created a Single Layer Perceptron that solves a simple OR gate.

The OR gate is among the most basic logical functions which takes 2 bits as input and outputs 1.
The relationship can be seen below.

| X | Y | Z |
|---|---|---|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

If this relationship is moved to a graph the following structure can be seen where blue points represent 1 and red represents 0.

![OR Gate Graph](https://github.com/umop-ap1sdn/Single-Layer-Perceptron/blob/main/OR%20Gate.png?raw=true)

Which can be solved with an infinite number of linear solutions, such as the graph shown.

![OR Gate Solution](https://github.com/umop-ap1sdn/Single-Layer-Perceptron/blob/main/OR%20Gate%20Solved.png)

From running the program it can be seen that solving the OR Gate was no problem even for a model as simple as this one.

![SLP Results](https://github.com/umop-ap1sdn/Single-Layer-Perceptron/blob/main/SingleLayerPerceptron.png)

Because of its simplicity, the Single Layer Perceptron is often used as a "Hello World" to Machine Learning, and as such, many higher level concepts present in more advanced models are often left out.


## Limitations

As a cost for how easy the Single Layer Perceptron is to understand, there are several limitations the model encounters. 
One such infamous example is known as the XOR problem.

To demonstrate the XOR problem I will use the same Single Layer perceptron to solve the Logical XOR operation instead of OR

The truth table for XOR can be seen below

| X | Y | Z |
|---|---|---|
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

And once again, below is the graph representation (blue = 1, red = 0)

![XOR Graph](https://github.com/umop-ap1sdn/Single-Layer-Perceptron/blob/main/XOR%20Gate.png)

This graph, unfortunately, has a meaninful difference compared to the OR gate based on where the 1's and 0's lie.
Unlike the OR example where a separating line could be drawn between all results; there is no possible line that could be drawn to correctly differentiate between
all 1's and 0's.
Instead the dividing boundary would have to be a more complex non-linear function which is an impossible result of adding any 2 or more linear functions.
Running this on the model shows this idea exactly

![XOR Test](https://github.com/umop-ap1sdn/Single-Layer-Perceptron/blob/main/XOR%20Fails.png)

## Solution

Unfortunately the Single Layer Perceptron model is ultimately incapable of learning to solve the XOR Logic gate, however there are other ways it can be solved.
There are 2 major features required to to have the ability to solve XOR.

1. Non-Linearity - As mentioned this allows the network to create decision boundaries more complex than a linear line
2. Hidden Layers - Hidden Layers are the building block to the next level of machine learning - Multilayer Perceptron and allow for even greater manipulation over
the ability to use non-linear functions.
3. (Not Required but recommended) Bias Nodes - Bias nodes act similar to standard nodes, however their values are held at a constant 1.00 and are connected to the next
layer in much the same way as standard nodes. Their purpose is again to give greater control over how the network is able to choose a decision boundary.

## Conclusion
Overall this project is my first step into the world of Data Science and Machine Learning.
Although I have already created and uploaded repositories for more complex projects I have made using higher level models, I do plan to revisit the projects and create
detailed write-ups as I have for this project.
