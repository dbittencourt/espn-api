FROM python:3
 
WORKDIR /usr/src/crawler
 
COPY requirements.txt ./
 
RUN pip3 install --no-cache-dir -r requirements.txt
 
COPY . .
 
# Run the crawler when the container launches.
CMD ["python3", "./spider.py"]