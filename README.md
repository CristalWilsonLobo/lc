# Best Time to Buy and Sell Stock

Given an array prices where prices[i] is the price of a given stock on the ith day. We want to maximize the profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit we can achieve from this transaction. 

# Project Structure 

Maven Setup ( pom.xml )
<BR>
Code File ( StockProfit.java )
<BR>
Test File ( StockProfitTest.java )

lc/ <br>
├── pom.xml <br>
├── src <br>
│   ├──── main <br>
   │   └────── java <br>
   │       └──────── StockProfit.java <br>
│   └──── test <br>
│       └────── java <br>
│           └──────── StockProfitTest.java <br>
└── README.md
# Workflow
## CI/CD with GitHub Actions

This project uses GitHub Actions for continuous integration and deployment. The workflow file is located in .github/workflows/maven-publish.yml and is triggered on pushes to the main branch. It sets up Java 17, runs tests, and builds the project using Maven.
