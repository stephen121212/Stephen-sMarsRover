FROM java:8
COPY . /app
RUN make /app
CMD java /app.java
