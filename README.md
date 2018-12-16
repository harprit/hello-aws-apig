# hello-aws-apig

Simplest possible Hello World setup of AWS API Gateway (mock integration) using AWS SAM template.

`aws cloudformation package --template-file sam.yaml --s3-bucket <-BUCKET-NAME-HERE> --output-template packaged-sam.yaml`

`aws cloudformation deploy --capabilities CAPABILITY_IAM --template-file packaged-sam.yaml --stack-name hello-world-api`

Post the deployment -
* Go to [AWS API Gateway](https://console.aws.amazon.com/apigateway/)
* Invoke the API using provided url
* Check out the stack at [AWS Cloudformation](https://console.aws.amazon.com/cloudformation)
