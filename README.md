<h1 align="center"> Welcome to the Stonk-Platform </h1>

<h3 align="center"> Technology Stack </h3>
<div align="center">
	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/kotlin.svg" width="40"/>
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/angular-icon.svg" width="40"/>
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/spring.svg" width="150"/> 
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/docker.svg" width="150"/>
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/google-cloud.svg" width="50"/>  
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/kubernetes.svg" width="40"/>
  	<img src="https://raw.githubusercontent.com/gilbarbara/logos/master/logos/yahoo.svg" width="150"/>
</div>

#

The project is divided into two services, *api* and *web*.
The api service fetches realtime and historical data from *yahoo finance* and exposes a rest stream api
to the web service which is an Angular web application for displaying and updating the streamed data.

## How To Run
### Run on local machine with docker
Install docker.
Build the api service with *mvn clean install* in api directory.
Build the web service with *ng build --prod* in web directory.
Create Docker images with docker-compose in project root.
Create docker containers and run them with *docker run*.


### Run on local machine in debug mode
Start api service by run *StonkMonitorApp*. Start web service with ng serve in the web directory.

### API Specification
/quote/{symbol} - single symbol data  
/stream/quotes/{industry} - stream of all industry specific quotes  
/stream/quotes/{industry}/{category} - stream of subindustry quotes  
/stream/quotes/{industry}/{page} - stream of industry quotes with paging  
/stream/quotes/{industry}/{page}?{sortProperty}&{sortDirection} - stream of sorted indsutry quotes with paging   





