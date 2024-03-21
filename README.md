# Introduction
Welcome to EtherMail's code challenge project. This repository contains an Android application with some basic functionality
to support the development of the code test required during the hiring process for an Android developer in EtherMail.

# The challenge
A candidate has to implement the following:

- When the user opens the app, we need to display a list of crypto currency assets (see CoincapService and AssetsApiData),
  displaying the asset name and symbol.

- When the user taps on an asset, we must navigate to the MarketScreen where we need to display a detailed view of one Market (see CoincapService and MarketsApiData)
  that has the selected crypto currency as the "baseId", and has the highest volume transacted in the last 24 hours ("volumeUsd24Hr").
  The information to display in this view is:
    + Exchange ID
    + Rank
    + Price
    + Updated date with the format "Day/Month/Year"

# Guideline
The candidate is free to implement the solution in any way that they consider appropriate, but please consider that we love well designed, clear and simple code. 
SOLID principles and Clean Architecture are fundamental concepts in our development philosophy.

Below are some key points that we use to evaluate your solution:
- The functionality needs to be testable, add different types of tests as deemed appropriate. 
- The presentation layer can be implemented following any of the well-known industry patterns: MVVM, MVI, MVP, etc.
  Although is not mandatory, using one of these paradigms is a positive point in the evaluation.
- Use any third party library not included in the project if desired.
- The webserver API used in this exercise can frequently return errors when many requests (sometimes just a few) are performed from the same IP address. Take this into account as part of the exercise and treat errors properly.
- consider your commits, we want to see how you work and how you think.
- We do want to see how you work with and structure your composable components
- This test should not take you more than 3-4 hours to complete. If you find yourself spending more time than this, please stop and submit what you have. Add comments in the code to explain what you would have done if you had more time.

# How to submit the code challenge
- **Important:** please DO NOT Fork this project from github
- The candidate can checkout the project locally and either push it to a newly created repo with public permissions so we can access it. Alternatively...
- you can clone the project and send us the completed project in a zip file.

# Reference links
- Coincap API: https://docs.coincap.io/
