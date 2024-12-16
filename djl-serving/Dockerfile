# docker build -t mosazhaw/djl-serving:latest .
# docker push mosazhaw/djl-serving:latest

FROM deepjavalibrary/djl-serving:0.31.0

# Copy Model
COPY *.zip /opt/ml/
RUN unzip /opt/ml/resnet18_v1.zip -d /opt/ml/model/resnet18_v1
RUN rm /opt/ml/resnet18_v1.zip
