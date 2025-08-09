# Getting Started with My Movies application

### APIs

* Get Movies API - `/movie/{id}`
This endpoint gives the movie based on id.
* Post Movies API - `/movie`. The request body as given below
```
{
    "name": "Rangers",
    "rating": 8.7,
    "genre": "Action"
}
```
This endpoint saves the given movie data into database.


### APIs that fetches data from external apis

* Get cat facts - `/cat-fact` Gives random cat facts from publicly available api in Json format
* Get cat facts filtered - `/cat-fact/filtered` - gives random cat fact as string.
* Get Random User - `/random-user` - fetched any random user data from a public user api in json format.
