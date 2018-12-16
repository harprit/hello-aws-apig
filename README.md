# hello-aws-apig

Simplest possible Hello World setup of AWS API Gateway (mock integration) using SAM.

aws cloudformation package --template-file sam.yaml --s3-bucket <YOUR-BUCKET-NAME-HERE> --output-template packaged-sam.yaml

aws cloudformation deploy --capabilities CAPABILITY_IAM --template-file packaged-sam.yaml --stack-name hello-world-api