# Announcer
Announce MeetUps and Events on different platforms

# Feature Status
Zero features implemented so far. Just a little setup and some unit tests.

# Next Things To Do
- Use Spring for DI
- use Spring REST template to access meetup.com
- have integration tests that actually access 3rd party web servers
- use Spring Boot to offer access to the app from outside
- deploy somehow. docker?
- have clean unit tests (which do not access 3rd party web servers)
- create a twitter app that can tweet

# Running it locally
- You need Java 8 and Gradle ? installed.
- An env var MEETUP_COM_API_KEY with a valid api key for meetup.com (goto website -> "..." on top right -> API -> pick "API Key" from navbar -> make it visible by clicking the lock symbol)
- There is a sandbox group on meetup.com that you can join to test your code

# Deployment
An coreOS instance is waiting on digital ocean. Contact me for machine details, i would rather not post them publicly). You can probably 

# Build Status
[ ![Codeship Status for swkBerlin/announcer](https://codeship.com/projects/a07a18e0-8b5e-0132-217e-328ae7f2fceb/status?branch=master)](https://codeship.com/projects/60291)
