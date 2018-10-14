# Coding Challenge

RESTful web service to add/delete transactions.
The main use case for the API is to calculate realtime statistics for the last 60 seconds of transactions.

Below are the API endpoints:
POST /transactions – called every time a transaction is made.
GET /statistics – returns the statistic based of the transactions of the last 60 seconds.
DELETE /transactions – deletes all transactions.
